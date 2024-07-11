package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class LoginPage extends MethodHandles {

    public LoginPage(WebDriver driver){

        super(driver);
    }

    //locate Elements

    private final By Name = By.name("name");

    private final By emailaddress  = By.name("email");

    private final By signup_btn = By.xpath("//button[@type='submit'][text()='Signup']");

    // Actions


    public void insertname(String name){

        sendKeys(Name,3,name);
    }

    public void insertemailaddress(String email){

        sendKeys(emailaddress,3,email);
    }




    public SignupPage clickonsignupbuttton(){

        click(signup_btn,3);

        return new SignupPage(driver);
    }



}
