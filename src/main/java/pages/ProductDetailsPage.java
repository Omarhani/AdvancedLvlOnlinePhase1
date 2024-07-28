package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class ProductDetailsPage extends MethodHandles {
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    private final By FirstProductsLink = By.xpath("//a[@href='/product_details/1']");
    private final By VerifyProductInformation = By.xpath("//div[@class='product-information']/p[contains(text(),'Category')]");

    public void clickFirstProductsLink() {
        scrollIntoElement(driver, FirstProductsLink);
        click(FirstProductsLink, 5);
    }

    public String getAllProductPageTitle() {
        return getPageTitle();
    }

    public String verifyProductInformationDisplay() {
        return getText(VerifyProductInformation, 5);
    }

}
