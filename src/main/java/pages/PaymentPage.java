package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.MethodHandles;

import java.time.Duration;

public class PaymentPage extends MethodHandles {
    public PaymentPage(WebDriver driver) {
        super(driver);
    }
    private final By nameOnCardField = By.name("name_on_card");
    private final By cardNumberField = By.name("card_number");
    private final By cvcField = By.name("cvc");
    private final By expiryMonthField = By.name("expiry_month");
    private final By expiryYearField = By.name("expiry_year");
    private final By confirmOrderButton = By.id("submit");
    private final By placeOrderSuccessfulText =By.xpath("//div[contains(text(),'Your order has been placed successfully!')]");

    private void insertNameOnCardField(String nameOnCard){
        sendKeys(nameOnCardField,5,nameOnCard);
    }
    private void insertCardNumberFieldField(String cardNumber){
        sendKeys(cardNumberField,5,cardNumber);
    }
    private void insertCvcField(String cvc){
        sendKeys(cvcField,5,cvc);
    }
    private void insertExpiryMonthField(String expiryMonth){
        sendKeys(expiryMonthField,5,expiryMonth);
    }
    private void insertExpiryYearField(String expiryYear){
        sendKeys(expiryYearField,5,expiryYear);
    }
    public String getPlaceOrderSuccessfulText(){
        return getText(placeOrderSuccessfulText,5);
    }
    public PaymentDonePage clickOnConfirmOrder(String nameOnCard ,String cardNumber,String cvc,String expiryMonth,String expiryYear){
        insertNameOnCardField(nameOnCard);
        insertCardNumberFieldField(cardNumber);
        insertCvcField(cvc);
        insertExpiryMonthField(expiryMonth);
        insertExpiryYearField(expiryYear);
        click(confirmOrderButton,5);
        return new PaymentDonePage(driver);
    }
}
