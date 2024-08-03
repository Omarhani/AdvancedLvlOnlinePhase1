package cart;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.util.Random;

public class CheckOutBeforeRegistrationTests extends BaseTests {
    @Test
    public void testPlaceOrderAndCheckOutBeforeRegister(){
        Assert.assertTrue(homePage.getPageTitle().contains(dataModel.HomePageTitle));
        homePage.clickOnAddToCartButton();
        ViewCartPage viewCartPage = homePage.clickOnViewCardLink();
        viewCartPage.clickOnProceedToCheckOutButton();
        LoginPage loginPage = viewCartPage.clickOnRegisterLink();
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        AccountInformationPage accountInformationPage = loginPage.signUpFeature(
                dataModel.Register.Name ,
                "email"+randomNumber+dataModel.Register.Email);
        AccountCreatedPage accountCreatedPage = accountInformationPage.accountInformationFeature(
                dataModel.Register.Password,
                dataModel.Register.FirstName,
                dataModel.Register.LastName,
                dataModel.Register.Address,
                dataModel.Register.State,
                dataModel.Register.City,
                dataModel.Register.zipCode,
                dataModel.Register.mobileNumber);
        accountCreatedPage.clickOnContinueButton();
        homePage.clickOnCartLink();
        CheckOutPage checkOutPage = viewCartPage.clickOnProceedToCheckOutButton();
        PaymentPage paymentPage = checkOutPage.clickPlaceOrderBtn();
        paymentPage.insertPaymentDetails(
                dataModel.PaymentDetails.name_on_card,
                dataModel.PaymentDetails.card_number,
                dataModel.PaymentDetails.cvc,
                dataModel.PaymentDetails.expiry_month,
                dataModel.PaymentDetails.expiry_year);
        paymentPage.clickPayAndConfirmBtn();
      //  Assert.assertTrue(paymentPage.orderConfirmedTextIsDisplayed());
        DeleteAccountPage deleteAccountPage = homePage.clickOnDeleteAccountLink();
        Assert.assertTrue(deleteAccountPage.deleteAccountIsDisplayed());
    }
}
