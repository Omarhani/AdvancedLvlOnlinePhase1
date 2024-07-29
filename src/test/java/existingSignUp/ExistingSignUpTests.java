package existingSignUp;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ExistingSignUpPage;

import static org.testng.Assert.assertTrue;

public class ExistingSignUpTests extends BaseTests {
    @Test
    public void RegisterExistingMail() {
        ExistingSignUpPage existingSignUpPage = homePage.clickSignUpLink();
        existingSignUpPage.existSignUpFuc(dataModel.ExistingRegister.Name, dataModel.ExistingRegister.Email);
        String expectedResult = dataModel.ExistSignUpValidationMessage;
        String actualResult = existingSignUpPage.existSignUpValidation();
        assertTrue(actualResult.contains(expectedResult));
    }

}
