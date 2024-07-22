package contactUs;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactUsForm;

public class ContactUsTests extends BaseTests {

    @Test
    public void testContactUsSuccessfully(){
        Assert.assertTrue(homePage.getPageTitle().contains("Automation Exercise"));
        ContactUsForm contactUSPage = homePage.clickOnContactUsLink();
        Assert.assertTrue(contactUSPage.getInTouchIsDisplayed());
        contactUSPage.contactUsFeature(
                dataModel.ContactUS.Name,
                dataModel.ContactUS.Email,
                dataModel.ContactUS.Subject,
                dataModel.ContactUS.Message,
                dataModel.ContactUS.attachmentPath);
        Assert.assertTrue(contactUSPage.successfulMessageTextIsDisplayed());
        contactUSPage.clickOnHomeButton();
        Assert.assertTrue(homePage.getPageTitle().contains("Automation Exercise"));



    }
}
