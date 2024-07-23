package homePage_subscription;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageSubscriptionTest extends BaseTests {

    @Test
    public void SubscriptionTest() {
        Assert.assertTrue(homePage.homePageTitle().contains("Automation Exercise"));
        homePage.ScrollToSubscription();
        Assert.assertTrue(homePage.VerifySubscribDisplay().contains("SUBSCRIPTION"));
        homePage.EnterSubscribeEmail(dataModel.register.Email);
        homePage.clickSubscribeButton();
        Assert.assertTrue(homePage.VerifySuccessSubscribeMessage().contains("You have been successfully subscribed!"));
    }
}
