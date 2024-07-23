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
        click(Signuplink,5);
        return new SignUpPage(driver);
    }

    final static By loginLink = By.partialLinkText("Signup / Log");
    final static By deleteAccountLink =By.xpath("//a[contains(text(),'Delete Account')]");
    final static By loggedInAsUsernameText = By.xpath("//a[contains(text(),'Logged in as ')]");


    public LoginPage clickOnLoginLink(){
        click(loginLink,5);
        return new LoginPage(driver);
    }
    public DeleteAccountPage clickOnDeleteAccountLink(){
        click(deleteAccountLink , 5);
        return new DeleteAccountPage(driver);
    }

    public boolean loggedInAsUsernameIsDisplayed(){
        return isDisplayed(loggedInAsUsernameText,5);

    }

    public String homePageTitle() {
        return driver.getTitle();

    }
}
