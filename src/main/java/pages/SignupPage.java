package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class SignupPage extends MethodHandles {


    public SignupPage(WebDriver driver){

        super(driver);

    }

    // locators

    private final By title = By.id("id_gender1");
    private final By person_name = By.id("name");
    private final By Password = By.id("password");

    private final By firstname = By.id("first_name");

    private final By lastname = By.id("last_name");

    private final By address = By.id("address1");

    private final By state = By.id("state");

    private final By city = By.id("city");

    private final By zipcode = By.id("zipcode");

    private final By mobilenumber = By.id("mobile_number");

    private final By createaccount_btn = By.xpath("//button[@class='btn btn-default'][text()='Create Account']");


    // Actions

    public void checkbox_title(){

        click(title,3);

    }

    public void insert_name(String name){

        sendKeys(person_name,3,name);
    }


    public void insert_password(String password){

        sendKeys(Password,3,password);
    }

    public void insert_firstname(String fname){

        sendKeys(firstname,3,fname);
    }

    public void insert_lastname(String lname){

        sendKeys(lastname,3,lname);
    }

    public void insert_address(String add){

        sendKeys(address,3,add);
    }

    public void insert_state(String st){

        sendKeys(state,3,st);
    }

    public void insert_city(String cty){

        sendKeys(city,3,cty);
    }

    public void insert_zipcode(String zcode){

        sendKeys(zipcode,3 ,zcode);
    }

    public void insert_mnumber(String mob){

        sendKeys(mobilenumber,3,mob);
    }

    public void clickoncreateaccount(){

        click(createaccount_btn,3);

    }

    public AccountCreated createdaccountpage(){

        return new AccountCreated(driver);
    }






}
