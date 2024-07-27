package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DeleteAccountPage;
import pages.LoginPage;

import java.io.FileNotFoundException;

public class LoginTests extends BaseTests {

    @Test
    public void testLoginSuccessfully() throws FileNotFoundException {

        Assert.assertTrue(homePage.homePageTitle().contains("Automation Exercise"));
        LoginPage loginPage = homePage.clickOnLoginLink();
        Assert.assertTrue(loginPage.loginToYourAccountIsDisplayed());
        loginPage.loginFeature(dataModel.Login.ValidCredentials.Email, dataModel.Login.ValidCredentials.Password);


        Assert.assertTrue(homePage.loggedInAsUsernameIsDisplayed());
        DeleteAccountPage deleteAccountPage = homePage.clickOnDeleteAccountLink();
        Assert.assertTrue(deleteAccountPage.deleteAccountIsDisplayed());

    }
    @Test
    public void testLoginWithIncorrectEmail(){
        Assert.assertTrue(homePage.homePageTitle().contains("Automation Exercise"));
        LoginPage loginPage = homePage.clickOnLoginLink();
        Assert.assertTrue(loginPage.loginToYourAccountIsDisplayed());
        loginPage.loginFeature(dataModel.Login.InvalidCredentials.InvalidEmail.Email,dataModel.Login.InvalidCredentials.InvalidEmail.Password);
        Assert.assertTrue(loginPage.validationMSGIsDisplayed());
    }
    @Test
    public void testLoginWithIncorrectPassword(){
        Assert.assertTrue(homePage.homePageTitle().contains("Automation Exercise"));
        LoginPage loginPage = homePage.clickOnLoginLink();
        Assert.assertTrue(loginPage.loginToYourAccountIsDisplayed());
        loginPage.loginFeature(dataModel.Login.InvalidCredentials.InvalidPassword.Email,dataModel.Login.InvalidCredentials.InvalidPassword.Password);
        Assert.assertTrue(loginPage.validationMSGIsDisplayed());
    }

}
