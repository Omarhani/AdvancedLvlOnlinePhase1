package shoppingCart;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ItemInformationPage;
import pages.NoteBookPage;

import static org.testng.Assert.assertTrue;

public class AddItemToCart extends BaseTests {

    @Test
    public void testBarNotificationSuccess() {
        NoteBookPage noteBookPage = homePage.moveToNoteBookPage();
        ItemInformationPage itemInformationPage = noteBookPage.clickOnAddToCartButton();
        itemInformationPage.clickOnAddToCartButton();
        assertTrue(itemInformationPage.barNotificationIsDisplayed());
    }
}
