package signUp;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.SignUpPage;

import static org.testng.Assert.assertTrue;

public class SignUpTests extends BaseTests {
    @Test
    public void RegisterExistingMail() throws InterruptedException {
        SignUpPage signUpPage = homePage.clickSignuplink();
        signUpPage.enterName(dataModel.Login.ValidCredentials.name);
        signUpPage.enterEmail(dataModel.Login.ValidCredentials.email);
        signUpPage.clickSignupBtn();

        String expectedResult = dataModel.ValidationMessage;
        String actualResult = signUpPage.ExistSignUpValidation();
        Thread.sleep(2000);
        assertTrue(actualResult.contains(expectedResult));
    }

}
