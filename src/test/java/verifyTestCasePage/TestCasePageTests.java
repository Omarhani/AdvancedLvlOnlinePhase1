package verifyTestCasePage;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestCasesPage;

public class TestCasePageTests extends BaseTests {
    @Test
    public void verifyTestCasePage(){
        homePage.verifyTestCasePage();
       // String expectedURL = "https://automationexercise.com/test_cases";
        String expectedURL = dataModel.testCaseURL;
        TestCasesPage testCasesPage = new TestCasesPage(driver);
        Assert.assertEquals(testCasesPage.currentURL(),expectedURL);

    }
}
