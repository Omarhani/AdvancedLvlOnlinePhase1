package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;


public class NoteBookPage extends MethodHandles {
    public NoteBookPage(WebDriver driver) {
        super(driver);
    }
    private final By appleMac = By.cssSelector(".product-title > a");

    public ItemInformationPage clickOnAddToCartButton(){
        clickWithActions(appleMac,5);
        return new ItemInformationPage(driver);
    }
}
