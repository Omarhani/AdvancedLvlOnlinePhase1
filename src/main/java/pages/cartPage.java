package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class cartPage extends MethodHandles {

    public cartPage(WebDriver driver) {
        super(driver);
    }
    private final By mailSubscriptionBox = By.xpath("//*[@id=\"susbscribe_email\"]");

    private final By subscribeButton = By.xpath("//*[@id=\"subscribe\"]");
    private final By successSubscribtionMessage = By.xpath("//*[@id=\"success-subscribe\"]/div");

    public void insertCartSubEmail(String cartSubMail){
        sendKeys(mailSubscriptionBox,2,cartSubMail);
    }
    public void clickOnSubscribeButton(){
        click(subscribeButton,2);
    }
    public String getSuccessfullySubscribtionMessage(){
       return getText(successSubscribtionMessage,5);
    }



}
