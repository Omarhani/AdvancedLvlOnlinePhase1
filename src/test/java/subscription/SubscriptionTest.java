package subscription;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubscriptionTest extends BaseTests {

    @Test
    public void SubscriptionTest() {
        Assert.assertTrue(homePage.homePageTitle().contains(dataModel.HomePageTitle));
        homePage.ScrollToSubscription();
        Assert.assertTrue(homePage.VerifySubscribDisplay().contains(dataModel.Subscription));
        homePage.EnterSubscribeEmail(dataModel.ExistingRegister.Email);
        homePage.clickSubscribeButton();
        Assert.assertTrue(homePage.verifySuccessSubscripeMessage().contains(dataModel.SuccessfullySubscriptionMessage));
    }
}
