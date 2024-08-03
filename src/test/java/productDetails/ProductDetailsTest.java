package productDetails;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductDetailsPage;

public class ProductDetailsTest extends BaseTests {

    @Test
    public void ProductsInformationTest() {

        Assert.assertTrue(homePage.getPageTitle().contains(dataModel.HomePageTitle));
        ProductDetailsPage productDetailsPage = homePage.clickOnProductsLink();
        Assert.assertTrue(productDetailsPage.getAllProductPageTitle().contains(dataModel.ProductsPageTitle));
        productDetailsPage.clickFirstProductsLink();
        Assert.assertTrue(productDetailsPage.verifyProductInformationDisplay().contains(dataModel.ProductInformation));
    }
}
