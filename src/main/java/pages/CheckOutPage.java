package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class CheckOutPage extends MethodHandles {
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    private final By addressPanel= By.xpath("//ul[@id='address_delivery']/li/h3");
    private final By orderComment = By.xpath("//div[@id='ordermsg']/textarea");

    private final By placeOrderBtn = By.xpath("//a[contains(text(),'Place Order')]");

    public String verifyAddresspanel(){
        return getText(addressPanel,5);
    }
    public void insertOrderComment(String txt){
        sendKeys(orderComment,5,txt);
    }
    public PaymentPage clickPlaceOrderBtn(){
        click(placeOrderBtn,5);
        return new PaymentPage(driver);
    }
}
