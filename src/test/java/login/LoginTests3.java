package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import java.io.FileNotFoundException;

public class LoginTests3 extends BaseTests {

    @Test
    public void testLoginSuccessfully() throws FileNotFoundException {
        LoginPage loginPage = homePage.clickOnLoginLink();
        loginPage.loginFeature(dataModel().Login.ValidCredentials.Username,dataModel.Login.ValidCredentials.Password);
    }
    @Test
    public void t2() throws FileNotFoundException {
        LoginPage loginPage = homePage.clickOnLoginLink();
        loginPage.loginFeature(dataModel().Login.ValidCredentials.Username,dataModel.Login.ValidCredentials.Password);
    }
    @Test
    public void t3() throws FileNotFoundException {
        LoginPage loginPage = homePage.clickOnLoginLink();
        loginPage.loginFeature(dataModel().Login.ValidCredentials.Username,dataModel.Login.ValidCredentials.Password);
    }
}
