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

    private final By quantityField = By.id("quantity");
    private final By addToCartButton = By.cssSelector(".btn.btn-default.cart");
    private final By viewCartLink = By.xpath("//u[contains(text(),'View Cart')]");

    public void clickFirstProductsLink() {
        scrollIntoElement(driver, FirstProductsLink);
        click(FirstProductsLink, 5);
    }

    public String getAllProductPageTitle() {
        return getPageTitle();
    }

    public String verifyProductInformationDisplay() {
        return getText(VerifyProductInformation,5);
    }

    public void insertQuantityField(String quantity){
        clear(quantityField,5);
        sendKeys(quantityField,5,quantity);
    }

    public void clickOnAddToCartButton(){
        click(addToCartButton , 5);
    }
    public ViewCartPage clickOnViewCartLink(){
        click(viewCartLink,5);
        return new ViewCartPage(driver);
    }

}
