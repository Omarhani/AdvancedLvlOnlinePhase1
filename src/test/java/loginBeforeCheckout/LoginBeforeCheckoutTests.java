package loginBeforeCheckout;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.util.Random;

public class LoginBeforeCheckoutTests extends BaseTests {

    @Test
    public void LoginBeforeCheckoutTest() {
        Assert.assertTrue(homePage.homePageTitle().contains(dataModel.HomePageTitle));

        Random rand = new Random();
        int randomNumber = rand.nextInt(100000);
        LoginPage loginPage = homePage.clickOnLoginLink();
        AccountInformationPage accountInformationPage = loginPage.signUpFeature(
                dataModel.Register.Name,
                "email" + randomNumber + dataModel.Register.Email);
        accountInformationPage.accountInformationFeature(
                dataModel.Register.Password,
                dataModel.Register.FirstName,
                dataModel.Register.LastName,
                dataModel.Register.Address,
                dataModel.Register.State,
                dataModel.Register.City,
                dataModel.Register.zipCode,
                dataModel.Register.mobileNumber);
        Assert.assertTrue(accountInformationPage.accountCreationConfirmMessage().contains(dataModel.accountCreationConfirm));

        accountInformationPage.clickCreateAccounntContinueBtn();


        ProductDetailsPage productDetailsPage = homePage.clickOnViewProductLink();
        productDetailsPage.clickOnAddToCartButton();
        ViewCartPage viewCartPage = productDetailsPage.clickOnViewCartLink();

        CheckOutPage checkOutPage = viewCartPage.clickProceedToCheckOutBtn();
        Assert.assertTrue(checkOutPage.verifyAddresspanel().contains(dataModel.DeliveryAddressPanel));
        checkOutPage.insertOrderComment(dataModel.orderComment);
        PaymentPage paymentPage = checkOutPage.clickPlaceOrderBtn();

        paymentPage.insertPaymentDetails(
                dataModel.PaymentDetails.name_on_card,
                dataModel.PaymentDetails.card_number,
                dataModel.PaymentDetails.cvc,
                dataModel.PaymentDetails.expiry_month,
                dataModel.PaymentDetails.expiry_year);

        paymentPage.clickPayAndConfirmBtn();

        DeleteAccountPage deleteAccountPage = homePage.clickOnDeleteAccountLink();
        Assert.assertTrue(deleteAccountPage.deleteAccountIsDisplayed());


    }
}
