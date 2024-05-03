package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class HomePage extends MethodHandles {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By loginLink = By.cssSelector(".ico-login");
    private final By computersMenu = By.cssSelector(".top-menu.notmobile >li > a");

    private final By noteBookLink = By.xpath("(//a[contains(text(),'Notebooks ')])[1]");

    public LoginPage clickOnLoginLink(){
        click(loginLink,5);
        return new LoginPage(driver);
    }

    private void hoverOverComputers(){
        hoverOverElement(computersMenu,4);
    }
    private void clickOnNoteBookLink(){
        click(noteBookLink,6);
    }

    public NoteBookPage moveToNoteBookPage(){
        hoverOverComputers();
        clickOnNoteBookLink();
        return new NoteBookPage(driver);
    }
}
