package searchProductTest;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.productsPage;

public class searchProductsTest extends BaseTests {
    @Test
    public void verifySearchProduct(){

        productsPage productsPage = homePage.openProductPage();
        productsPage.insertProductName(dataModel.ProductName);
    }
}
