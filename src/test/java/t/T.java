package t;

import data.DataModel;
import org.testng.annotations.Test;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

public class T {

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
}
