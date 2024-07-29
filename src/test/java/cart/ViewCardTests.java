package cart;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductDetailsPage;
import pages.ViewCartPage;

public class ViewCardTests extends BaseTests {

    @Test
    public void testProductQuantityInCart(){
        Assert.assertTrue(homePage.getPageTitle().contains(dataModel.HomePageTitle));
        ProductDetailsPage productDetailsPage = homePage.clickOnViewProductLink();
        productDetailsPage.insertQuantityField("4");
        productDetailsPage.clickOnAddToCartButton();
        ViewCartPage viewCartPage= productDetailsPage.clickOnViewCartLink();
        Assert.assertEquals("4",viewCartPage.getQuantityText());
    }
}
