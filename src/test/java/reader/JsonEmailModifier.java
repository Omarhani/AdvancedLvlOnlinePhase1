package reader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import data.DataModel;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class JsonEmailModifier {

    private static final String JSON_FILE_PATH = "data/testData.json";

    public static void modifyEmailInJson() throws IOException {
        // Read the JSON file
        FileReader fileReader = new FileReader(JSON_FILE_PATH);
        DataModel dataModel = new Gson().fromJson(fileReader, DataModel.class);
        fileReader.close();

        // Generate a random number
        Random rand = new Random();
        int randomNumber = rand.nextInt(10); // Generates a random number between 0 and 9

        // Modify the email address
        String currentEmail = dataModel.Login.ValidCredentials.Email;
        String modifiedEmail = insertRandomNumberToEmail(currentEmail, randomNumber);
        dataModel.Login.ValidCredentials.Email = modifiedEmail;
        dataModel.Register.Email = modifiedEmail ;

        // Write the modified data back to the file
        FileWriter fileWriter = new FileWriter(JSON_FILE_PATH);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        gson.toJson(dataModel, fileWriter);
        fileWriter.flush();
        fileWriter.close();

        // Debug print
        System.out.println("Modified email: " + modifiedEmail);
    }


    private static String insertRandomNumberToEmail(String email, int randomNumber) {
        int atIndex = email.indexOf('@');
        String emailPrefix = email.substring(0, atIndex);
        String emailDomain = email.substring(atIndex);
        return emailPrefix + randomNumber + emailDomain;
    }

}
