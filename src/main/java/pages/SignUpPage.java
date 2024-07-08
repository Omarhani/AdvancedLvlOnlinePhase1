package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

    WebDriver driver;
    private final By NewUserSignupLabel = By.xpath("//h2[contains(text(),'New User Signup!')]");
    private final By nameField = By.xpath("//input[@name='name']");
    private final By emailField = By.xpath("//form[@action='/signup']//input[@name='email']");
    private final By SignupBtn = By.xpath("//button[contains(text(),'Signup')]");

    private final By ExistSignUpMessage = By.xpath("//form/p[contains(text(),'Email Address already exist!')]");

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public String NewUserSignupValidation() {
        return driver.findElement(NewUserSignupLabel).getText();
    }

    public void enterName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickSignupBtn() {
        driver.findElement(SignupBtn).click();
    }

    public String ExistSignUpValidation() {
        return driver.findElement(ExistSignUpMessage).getText();

    }


}
