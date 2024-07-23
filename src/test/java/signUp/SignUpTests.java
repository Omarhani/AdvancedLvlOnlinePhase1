package signUp;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.SignUpPage;

import static org.testng.Assert.assertTrue;

public class SignUpTests extends BaseTests {
    @Test
    public void RegisterExistingMail() {
        SignUpPage signUpPage = homePage.clickSignuplink();
        signUpPage.ExistSignUpFuc(dataModel.register.Name, dataModel.register.Email);
        String expectedResult = dataModel.ExistSignUpValidationMessage;
        String actualResult = signUpPage.ExistSignUpValidation();
        assertTrue(actualResult.contains(expectedResult));
    }

}
