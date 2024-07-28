package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class ExistingSignUpPage extends MethodHandles {

    private final By newUserSignupLabel = By.xpath("//h2[contains(text(),'New User Signup!')]");
    private final By nameField = By.xpath("//input[@name='name']");
    private final By emailField = By.xpath("//form[@action='/signup']//input[@name='email']");
    private final By signupBtn = By.xpath("//button[contains(text(),'Signup')]");

    private final By existSignUpMessage = By.xpath("//form/p[contains(text(),'Email Address already exist!')]");

    public ExistingSignUpPage(WebDriver driver) {
        super(driver);
    }

    public String newUserSignupValidation() {
        return getText(newUserSignupLabel, 5);
    }

    public void enterName(String name) {
        sendKeys(nameField, 5, name);
    }

    public void enterEmail(String email) {
        sendKeys(emailField, 5, email);
    }

    public void clickSignupBtn() {
        click(signupBtn, 5);
    }

    public void existSignUpFuc(String name, String email) {
        enterName(name);
        enterEmail(email);
        clickSignupBtn();
    }

    public String existSignUpValidation() {
        return getText(existSignUpMessage, 5);

    }


}
