package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class AccountCreated extends MethodHandles {

    public AccountCreated(WebDriver driver){

        super(driver);
    }


 private final By title = By.xpath("//b[text()='Account Created!']");


    public String get_title(){

       return getText(title,3);
    }







}
