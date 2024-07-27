package verifyTestCasePage;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestCasesPage;

public class TestCasePageTests extends BaseTests {
    @Test
    public void verifyTestCasePage(){
        homePage.verifyTestCasePage();
        TestCasesPage TestCasePage = homePage.verifyTestCasePage();
        String currentURL = TestCasePage.currentURL;
        String expectedURL = dataModel.testCaseURL;
        Assert.assertEquals(currentURL,expectedURL);
    }
}
