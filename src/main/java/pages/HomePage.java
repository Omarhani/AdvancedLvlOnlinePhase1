package pages;

import org.openqa.selenium.By;
import utils.MethodHandles;

public class HomePage extends MethodHandles {

    public HomePage() {

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



