package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class HomePage extends MethodHandles {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By HomePageDisplay = By.xpath("//a[contains(text(),'Home')]");
    private final By Signuplink = By.xpath("//a[contains(text(),'Signup / Login')]");

    public String VerifyHomePageDisplay() {
        return driver.findElement(HomePageDisplay).getText();
    }

    public SignUpPage clickSignuplink() {
        driver.findElement(Signuplink).click();
        return new SignUpPage(driver);
    }


}
