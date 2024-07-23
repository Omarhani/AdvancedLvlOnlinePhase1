package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class SignUpPage extends MethodHandles {

    private final By NewUserSignupLabel = By.xpath("//h2[contains(text(),'New User Signup!')]");
    private final By nameField = By.xpath("//input[@name='name']");
    private final By emailField = By.xpath("//form[@action='/signup']//input[@name='email']");
    private final By SignupBtn = By.xpath("//button[contains(text(),'Signup')]");

    private final By ExistSignUpMessage = By.xpath("//form/p[contains(text(),'Email Address already exist!')]");

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public String NewUserSignupValidation() {
        return driver.findElement(NewUserSignupLabel).getText();
    }

    public void enterName(String name) {
        sendKeys(nameField,5,name);
    }

    public void enterEmail(String email) {
        sendKeys(emailField,5,email);
    }

    public void clickSignupBtn() {
        click(SignupBtn,5);
    }

    public void ExistSignUpFuc(String name,String email){
        enterName(name);
        enterEmail(email);
        clickSignupBtn();
    }

    public String ExistSignUpValidation() {
        return driver.findElement(ExistSignUpMessage).getText();

    }


}
