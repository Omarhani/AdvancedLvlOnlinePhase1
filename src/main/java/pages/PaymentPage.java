package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class PaymentPage extends MethodHandles {
    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    private final By name_on_card = By.name("name_on_card");
    private final By card_number = By.name("card_number");

    private final By cvc = By.xpath("//input[@name='cvc']");

    private final By expiry_month = By.name("expiry_month");

    private final By expiry_year = By.name("expiry_year");
    private final By payAndConfirmBtn = By.xpath("//button[@id='submit']");

    private final By paymentSuccessMessage = By.xpath("//div[@id='success_message']/div");

    public void insert_name_on_card(String txt) {
        sendKeys(name_on_card, 5, txt);
    }

    public void insert_card_number(String txt) {
        sendKeys(card_number, 5, txt);
    }

    public void insert_cvc(String txt) {
        sendKeys(cvc, 5, txt);
    }

    public void insert_expiry_month(String txt) {
        sendKeys(expiry_month, 5, txt);
    }

    public void insert_expiry_year(String txt) {
        sendKeys(expiry_year, 5, txt);
    }

    public void insertPaymentDetails(String nameOnCard, String cardNumber, String cvc, String expiryMonth, String expiryYear) {
        insert_card_number(nameOnCard);
        insert_name_on_card(cardNumber);
        insert_cvc(cvc);
        insert_expiry_month(expiryMonth);
        insert_expiry_year(expiryYear);
    }

    public void clickPayAndConfirmBtn() {
        click(payAndConfirmBtn, 5);
    }

    public String payementSuccessConfirmMessage() {
        return getText(paymentSuccessMessage,5);
    }
}
