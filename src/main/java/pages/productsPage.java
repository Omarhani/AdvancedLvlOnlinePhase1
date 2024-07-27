package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class productsPage extends MethodHandles {
    public productsPage(WebDriver driver) {
        super(driver);
    }
    private final By searchBox = By.id("search_product");

    public void insertProductName(String productName){
        sendKeys(searchBox,5,productName);
    }
}
