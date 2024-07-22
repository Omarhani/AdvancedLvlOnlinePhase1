package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class HomePage extends MethodHandles {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By loginLink = By.partialLinkText("Signup / Log");
    private final By deleteAccountLink =By.xpath("//a[contains(text(),'Delete Account')]");
    private final By loggedInAsUsernameText = By.xpath("//a[contains(text(),'Logged in as ')]");
    private final By logOutLink =By.xpath("//a[contains(text(),' Logout')]");

    public LoginPage clickOnLoginLink(){
        click(loginLink,5);
        return new LoginPage(driver);
    }
    public DeleteAccountPage clickOnDeleteAccountLink(){
        click(deleteAccountLink , 5);
        return new DeleteAccountPage(driver);
    }
    public void clickOnLogOutLink(){
        click(logOutLink , 5);
    }

    public boolean loggedInAsUsernameIsDisplayed(){
        return isDisplayed(loggedInAsUsernameText,5);

    }

//    public String homePageTitle() {
//        return driver.getTitle();
//
//    }
}
