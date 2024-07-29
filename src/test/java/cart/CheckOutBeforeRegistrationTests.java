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
        PaymentPage paymentPage = checkOutPage.clickOnPlaceOrderButton();
        PaymentDonePage paymentDonePage = paymentPage.clickOnConfirmOrder(
                dataModel.Payment.NameOnCard,
                dataModel.Payment.CardNumber,
                dataModel.Payment.CVC,
                dataModel.Payment.ExpireMonth,
                dataModel.Payment.ExpireYear);
        Assert.assertTrue(paymentDonePage.orderConfirmedTextIsDisplayed());
        DeleteAccountPage deleteAccountPage = paymentDonePage.clickOnDeleteAccountLink();
        Assert.assertTrue(deleteAccountPage.deleteAccountIsDisplayed());
        deleteAccountPage.clickOnContinueButton();
    }
}
