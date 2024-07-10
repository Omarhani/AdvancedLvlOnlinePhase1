package signUp;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SignUpPage;

import static org.testng.Assert.assertTrue;

public class SignUpTests extends BaseTests {
    @Test
    public void RegisterExistingMail() {
        SignUpPage signUpPage = homePage.clickSignuplink();
        signUpPage.enterName(dataModel.register.name);
        signUpPage.enterEmail(dataModel.register.email);
        signUpPage.clickSignupBtn();

        String expectedResult = dataModel.ValidationMessage;
        String actualResult = signUpPage.ExistSignUpValidation();
        assertTrue(actualResult.contains(expectedResult));
    }

}
