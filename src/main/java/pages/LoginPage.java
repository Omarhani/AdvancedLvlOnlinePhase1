package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class LoginPage extends MethodHandles {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By emailField = By.xpath("//*[contains(@data-qa , 'login-email')]");
    private final By passwordField = By.name("password");
    private final By loginButton = By.xpath("//button[contains(text(),'Login')]");
    private final By loginToYourAccountText = By.xpath("//h2[contains(text(),'Login to your account')]");
    private final By validationMSGText = By.xpath("//p[contains(text(),'Your email or password is incorrect!')]");
    private final By nameField = By.name("name");
    private final By emailSignUpField = By.xpath("//*[contains(@data-qa , 'signup-email')]");
    private final By signUpButton = By.xpath("//button[contains(text(),'Signup')]");

    private void insertNameField(String name){
        sendKeys(nameField,5,name);
    }
    private void insertEmailSignUpField(String email){
        sendKeys(emailSignUpField,5,email);
    }
    private void clickOnSignUpButton(){
        click(signUpButton,5);
    }
    public AccountInformationPage signUpFeature(String name,String email){
        insertNameField(name);
        insertEmailSignUpField(email);
        clickOnSignUpButton();
        return new AccountInformationPage(driver);
    }

    public boolean loginToYourAccountIsDisplayed(){
        return isDisplayed(loginToYourAccountText , 5);
    }


    private void insertEmail(String text) {
        sendKeys(emailField, 5, text);
    }

    private void insertPassword(String password) {
        sendKeys(passwordField, 5, password);
    }

    private void clickOnLoginButton() {
        click(loginButton, 5);
    }
    public void loginFeature(String username ,String password ){
        insertEmail(username);
        insertPassword(password);
        clickOnLoginButton();
    }
    public boolean validationMSGIsDisplayed(){
        return isDisplayed(validationMSGText,5);
    }


}