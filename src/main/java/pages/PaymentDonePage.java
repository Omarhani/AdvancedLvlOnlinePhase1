package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class PaymentDonePage extends MethodHandles {
    public PaymentDonePage(WebDriver driver) {
        super(driver);
    }
    private final By orderConfirmedText = By.xpath("//p[contains(text(),'Congratulations! Your order has been confirmed!')]");
    private final By deleteAccountLink = By.xpath("//a[contains(text(),'Delete Account')]");

    public boolean orderConfirmedTextIsDisplayed(){
        return isDisplayed(orderConfirmedText,5);
    }
    public DeleteAccountPage clickOnDeleteAccountLink() {
        click(deleteAccountLink, 5);
        return new DeleteAccountPage(driver);
    }
}
