package subscribtionInCartPageTest;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cartPage;


public class SubscribtionInCartPageTests extends BaseTests {
    @Test
            public void testingSubscribtionInCartPage(){
        Assert.assertEquals(homePage.getPageTitle(),dataModel.HomePageTitle);
     cartPage cartPage = homePage.clickOnCartButton();
      String cartPagePageTitle = cartPage.getPageTitle();
        Assert.assertEquals(cartPagePageTitle,dataModel.CartPageTitle);

        cartPage.insertCartSubEmail(dataModel.subEmail);
        cartPage.clickOnSubscribeButton();
        Assert.assertEquals(cartPage.getSuccessfullySubscribtionMessage(),dataModel.subMessage);
    }
}
