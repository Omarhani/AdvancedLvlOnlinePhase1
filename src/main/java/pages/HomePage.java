package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class HomePage extends MethodHandles {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By loginLink = By.partialLinkText("Signup / Log");
    private final By deleteAccountLink = By.xpath("//a[contains(text(),'Delete Account')]");
    private final By loggedInAsUsernameText = By.xpath("//a[contains(text(),'Logged in as ')]");
    private final By contactUsLink = By.xpath("//a[contains(text(),'Contact us')]");


    private final By testCaseButton = By.xpath("//a[contains(text(),'Test Cases')]");
    private final By productsButton = By.xpath("//a[contains(text(),' Products')]");

    private final By logOutLink = By.xpath("//a[contains(text(),' Logout')]");

    private final By signuplink = By.xpath("//a[contains(text(),'Signup / Login')]");

    private final By subscribDisplay = By.xpath("//h2[contains(text(),'Subscription')]");
    private final By SubscribeEmail = By.id("susbscribe_email");
    private final By SubscribeButton = By.xpath("//button[@id='subscribe']");
    private final By SuccessSubscripeMessage = By.id("success-subscribe");
    private final By productsLink = By.xpath("//a[contains(text(),'Products')]");

    private final By viewProductLink = By.linkText("View Product");
    private final By cartLink = By.xpath("//a[@href='/view_cart' and contains(text(), 'Cart')]");

    public ProductDetailsPage clickOnViewProductLink(){
        click(viewProductLink,5);
        return new ProductDetailsPage(driver);
    }

    public void clickOnLogOutLink(){
        click(logOutLink,5);
    }

    public ProductDetailsPage clickOnProductsLink(){
        click(productsLink,5);
        return new ProductDetailsPage(driver);
    }
    public void ScrollToSubscription() {
        scrollIntoElement(driver, subscribDisplay);
    }

    public String VerifySubscribDisplay() {
        return getText(subscribDisplay, 5);
    }

    public void EnterSubscribeEmail(String email) {
        sendKeys(SubscribeEmail, 5, email);
    }

    public void clickSubscribeButton() {
        click(SubscribeButton, 5);
    }

    public String verifySuccessSubscripeMessage() {
        return getText(SuccessSubscripeMessage, 5);
    }

    public ExistingSignUpPage clickSignUpLink() {
        click(signuplink, 5);
        return new ExistingSignUpPage(driver);
    }



    public LoginPage clickOnLoginLink() {
        click(loginLink, 5);
        return new LoginPage(driver);
    }

    public DeleteAccountPage clickOnDeleteAccountLink() {
        click(deleteAccountLink, 5);
        return new DeleteAccountPage(driver);
    }

    public boolean loggedInAsUsernameIsDisplayed(){
        return isDisplayed(loggedInAsUsernameText,5);

    }

    public productsPage openProductPage() {
        click(productsButton, 2);
        return new productsPage(driver);
    }

    public TestCasesPage verifyTestCasePage() {
        click(testCaseButton, 2);
        return new TestCasesPage(driver);
    }

    public ContactUsFormPage clickOnContactUsLink(){
        click(contactUsLink,5);
        return new ContactUsFormPage(driver);

    }
    public cartPage clickOnCartButton(){
        click(cartLink,1);
        return new cartPage(driver);
    }


}
