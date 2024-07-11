package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class HomePage extends MethodHandles {

    public HomePage(WebDriver driver) {

        super(driver);
    }

    //Locate Elements

    private final By signup = By.xpath("//a[@href='/login']");


    // Actions

    public LoginPage loginlink(){

        click(signup,6);

        return new LoginPage(driver);

    }






}



