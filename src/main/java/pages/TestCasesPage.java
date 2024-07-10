package pages;

import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class TestCasesPage extends MethodHandles {
    public TestCasesPage(WebDriver driver) {
        super(driver);
    }

    public String currentURL() {
        return driver.getCurrentUrl();
   }
}
