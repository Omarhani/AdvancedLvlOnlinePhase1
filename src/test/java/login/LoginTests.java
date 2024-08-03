package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountInformationPage;
import pages.DeleteAccountPage;
import pages.LoginPage;
import java.util.Random;

public class LoginTests extends BaseTests {



    @Test
    public void testLoginSuccessfully(){
        Random rand = new Random();
        int randomNumber = rand.nextInt(100000);
        LoginPage loginPage = homePage.clickOnLoginLink();
        AccountInformationPage accountInformationPage = loginPage.signUpFeature(
                dataModel.Register.Name ,
                "email"+randomNumber+dataModel.Register.Email);
        accountInformationPage.accountInformationFeature(
                dataModel.Register.Password,
                dataModel.Register.FirstName,
                dataModel.Register.LastName,
                dataModel.Register.Address,
                dataModel.Register.State,
                dataModel.Register.City,
                dataModel.Register.zipCode,
                dataModel.Register.mobileNumber);
        homePage.clickOnLoginLink();
        homePage.clickOnLogOutLink();
        Assert.assertTrue(loginPage.loginToYourAccountIsDisplayed());
        loginPage.loginFeature(
                "email"+randomNumber+dataModel.Login.ValidCredentials.Email,
                dataModel.Login.ValidCredentials.Password);
        Assert.assertTrue(homePage.loggedInAsUsernameIsDisplayed());
        DeleteAccountPage deleteAccountPage = homePage.clickOnDeleteAccountLink();
        Assert.assertTrue(deleteAccountPage.deleteAccountIsDisplayed());

    }
    @Test
    public void testLoginWithIncorrectEmail(){
        Assert.assertTrue(homePage.getPageTitle().contains(dataModel.HomePageTitle));
        LoginPage loginPage = homePage.clickOnLoginLink();
        Assert.assertTrue(loginPage.loginToYourAccountIsDisplayed());
        loginPage.loginFeature(dataModel.Login.InvalidCredentials.InvalidEmail.Email,dataModel.Login.InvalidCredentials.InvalidEmail.Password);
        Assert.assertTrue(loginPage.validationMSGIsDisplayed());
    }
    @Test
    public void testLoginWithIncorrectPassword(){
        Assert.assertTrue(homePage.getPageTitle().contains(dataModel.HomePageTitle));
        LoginPage loginPage = homePage.clickOnLoginLink();
        Assert.assertTrue(loginPage.loginToYourAccountIsDisplayed());
        loginPage.loginFeature(dataModel.Login.InvalidCredentials.InvalidPassword.Email,dataModel.Login.InvalidCredentials.InvalidPassword.Password);
        Assert.assertTrue(loginPage.validationMSGIsDisplayed());
    }

}
