package t;

import base.BaseTests;
import data.DataModel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

public class T extends BaseTests {

    DataModel dataModel ;

    @Test
    public void t1() throws FileNotFoundException {
        dataModel = new ReadDataFromJson().readJsonFile();
        System.out.println(dataModel.URL);
    }
    @Test
    public void t2() throws FileNotFoundException {
        dataModel = new ReadDataFromJson().readJsonFile();
        System.out.println(dataModel.Login.ValidCredentials.Username);
        System.out.println(dataModel.Login.ValidCredentials.Password);
    }
    @Test
    public void t3() throws FileNotFoundException {
        dataModel = new ReadDataFromJson().readJsonFile();
        System.out.println(dataModel.Login.InvalidCredentials.InvalidUsername.Username);
        System.out.println(dataModel.Login.InvalidCredentials.InvalidUsername.Password);
    }
    @Test
    public void t4() throws FileNotFoundException {
        dataModel = new ReadDataFromJson().readJsonFile();
        System.out.println(dataModel.Login.InvalidCredentials.InvalidPassword.Username);
        System.out.println(dataModel.Login.InvalidCredentials.InvalidPassword.Password);
    }
    @DataProvider
    public Object[][] testDataForT5() throws FileNotFoundException {
        return dataModel().Login1;
    }
    @Test(dataProvider = "testDataForT5")
    public void t5(String username,String password){
        System.out.println(username);
        System.out.println(password);
    }
}
