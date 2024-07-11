package signup;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.AccountCreated;
import pages.HomePage;
import pages.LoginPage;
import pages.SignupPage;

public class SignupTests {


    String email = "test150@gmail.com";
    String name = "test150";

    String password = "12345678";

    String fname = "Mena";
    String lname = "Adel";
    String add = "17 abdel hakeem reda street";
    String st = "newdelhy";
    String cty = "newdelhy";
    String zcode = "147111";






    @Test

    public void test_signup(){

       HomePage homePage = new HomePage();

        LoginPage loginPage = homePage.loginlink();

        loginPage.insertname(name);
        loginPage.insertemailaddress(email);
        SignupPage signupPage = loginPage.clickonsignupbuttton();
        signupPage.checkbox_title();
        signupPage.insert_name(name);
        signupPage.insert_password(password);
        signupPage.insert_firstname(fname);
        signupPage.insert_lastname(lname);
        signupPage.insert_address(add);
        signupPage.insert_state(st);
        signupPage.insert_city(cty);
        signupPage.insert_zipcode(zcode);
        signupPage.clickoncreateaccount();

        AccountCreated accountcreated = signupPage.createdaccountpage();

        String Actual_result = accountcreated.get_title();
        String Expected_result = "ACCOUNT CREATED!";

        Assert.assertEquals(Actual_result,Expected_result);




    }
}
