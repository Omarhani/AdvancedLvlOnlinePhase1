package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class DeleteAccountPage extends MethodHandles {
    public DeleteAccountPage(WebDriver driver) {
        super(driver);
    }

    private final By deleteAccountText = By.xpath("//b[contains(text(),'Account Deleted!')]");
    private final By continueButton = By.xpath("//a[contains(text(),'Continue')]");

    public boolean deleteAccountIsDisplayed(){
        return isDisplayed(deleteAccountText,5);
    }
    public HomePage clickOnContinueButton(){
        click(continueButton,5);
        return new HomePage(driver);
    }

}
