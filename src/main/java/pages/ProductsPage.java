package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class ProductsPage extends MethodHandles {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    private final By FirstProductsLink = By.xpath("//a[@href='/product_details/1']");
    private final By VerifyProductInformation = By.xpath("//div[@class='product-information']/p[contains(text(),'Category')]");

    public void clickFirstProductsLink() {
        scrollIntoElement(driver,FirstProductsLink);
        click(FirstProductsLink, 5);
    }
    public String getAllProductPageTitle() {
        return driver.getTitle();
    }
    public String VerifyProductInformationDisplay() {
        return getText(VerifyProductInformation, 5);
    }
}
