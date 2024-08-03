package registerBeforeCheckout;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.util.Random;

public class RegisterBeforeCheckoutTest extends BaseTests {

    @Test
    public void RegisterBeforeCheckoutTests() {
        Assert.assertTrue(homePage.homePageTitle().contains(dataModel.HomePageTitle));
        Random rand = new Random();
        int randomNumber = rand.nextInt(1000);
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
        Assert.assertTrue(homePage.loggedInAsUsernameIsDisplayed());
        ProductDetailsPage productDetailsPage = homePage.clickOnViewProductLink();
        productDetailsPage.clickOnAddToCartButton();
        ViewCartPage viewCartPage = productDetailsPage.clickOnViewCartLink();

        CheckOutPage checkOutPage = viewCartPage.clickProceedToCheckOutBtn();
        System.out.println("data model: " + dataModel.DeliveryAddressPanel);
        System.out.println("web ui : " + checkOutPage.verifyAddresspanel());
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
