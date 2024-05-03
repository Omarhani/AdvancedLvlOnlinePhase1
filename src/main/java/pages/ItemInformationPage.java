package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class ItemInformationPage extends MethodHandles {
    public ItemInformationPage(WebDriver driver) {
        super(driver);
    }

    private final By addToCartButton = By.cssSelector("#add-to-cart-button-4");

    public void clickOnAddToCartButton(){
        click(addToCartButton,6);
    }
}
