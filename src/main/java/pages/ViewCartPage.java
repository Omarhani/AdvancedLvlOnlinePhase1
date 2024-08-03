package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class ViewCartPage extends MethodHandles {
    public ViewCartPage(WebDriver driver) {
        super(driver);
    }
    private final By quantityText = By.cssSelector(".cart_quantity > button");
    private final By proceedToCheckOutButton =By.xpath("//a[contains(text(),'Proceed To Checkout')]");
    private final By registerLink =By.xpath("//u[contains(text(),'Register / Login')]");

    private final By proceedToCheckOutBtn = By.xpath("//a[@class='btn btn-default check_out']");
    public CheckOutPage clickProceedToCheckOutBtn(){
        click(proceedToCheckOutBtn,5);
        return new CheckOutPage(driver);
    }

    public String getQuantityText(){
        return getText(quantityText,5);
    }

    public CheckOutPage clickOnProceedToCheckOutButton(){
        click(proceedToCheckOutButton,5);
        return new CheckOutPage(driver);
    }
    public LoginPage clickOnRegisterLink(){
        click(registerLink,5);
        return new LoginPage(driver);
    }

}
