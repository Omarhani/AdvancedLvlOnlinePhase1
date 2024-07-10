package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class DeleteAccountPage extends MethodHandles {
    public DeleteAccountPage(WebDriver driver) {
        super(driver);
    }

    private final By deleteAccountText = By.xpath("//b[contains(text(),'Account Deleted!')]");

    public boolean deleteAccountIsDisplayed(){
        return isDisplayed(deleteAccountText,5);
    }

}
