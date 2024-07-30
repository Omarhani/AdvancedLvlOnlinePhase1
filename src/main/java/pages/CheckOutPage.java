package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;


public class CheckOutPage extends MethodHandles {
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }
    private final By placeOrderButton = By.xpath("//a[contains(text(),'Place Order')]");

    public PaymentPage clickOnPlaceOrderButton(){
        click(placeOrderButton,5);
        return new PaymentPage(driver);
    }
}
