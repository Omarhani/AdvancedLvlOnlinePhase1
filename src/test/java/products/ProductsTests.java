package products;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPage;

public class ProductsTests extends BaseTests {

    @Test
    public void ProductsInformationTest() {

        Assert.assertTrue(homePage.homePageTitle().contains("Automation Exercise"));
        ProductsPage productsPage = homePage.clickProductsLink();
        Assert.assertTrue(productsPage.getAllProductPageTitle().contains("All Products"));
        productsPage.clickFirstProductsLink();
        Assert.assertTrue(productsPage.VerifyProductInformationDisplay().contains("Category"));
    }
}
