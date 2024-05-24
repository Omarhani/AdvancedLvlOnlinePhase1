package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MethodHandles {
    protected WebDriver driver;
    WebDriverWait wait;

    Actions actions;
    static ExtentReports extent;
    static ExtentTest test;

    public MethodHandles(WebDriver driver){
        this.driver =driver;
    }

    private final By barNotification = By.id("bar-notification");

    private WebElement webElement(By locator){
        return driver.findElement(locator);
    }

    private void explicitWait(By locator, int time){
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(webElement(locator)),
                ExpectedConditions.visibilityOfElementLocated(locator),
                ExpectedConditions.elementToBeClickable(locator),
                ExpectedConditions.presenceOfElementLocated(locator)));
    }

    protected void click(By locator,int time){
        explicitWait(locator,time);
        addBorderToElement(driver,webElement(locator));
        setSteps();
        webElement(locator).click();
    }
    protected String getText(By locator,int time){
        explicitWait(locator,time);
        addBorderToElement(driver,webElement(locator));
        setSteps();
        return webElement(locator).getText();
    }

    protected void sendKeys(By locator,int time,String text){
        explicitWait(locator,time);
        addBorderToElement(driver,webElement(locator));
        setSteps();
        webElement(locator).sendKeys(text);
    }
    protected void hoverOverElement(By locator,int time){
        explicitWait(locator,time);
        actions = new Actions(driver);
        actions.moveToElement(webElement(locator)).build().perform();
    }
    protected boolean isDisplayed(By locator,int time){
        explicitWait(locator,time);
        addBorderToElement(driver,webElement(locator));
        setSteps();
        return webElement(locator).isDisplayed();
    }

    protected void clickWithActions(By locator,int time){
        explicitWait(locator,time);
        addBorderToElement(driver,webElement(locator));
        setSteps();
        actions = new Actions(driver);
        actions.click(webElement(locator)).build().perform();
    }
    public boolean barNotificationIsDisplayed(){
        return isDisplayed(barNotification,5);
    }
//    public void scrollIntoElement(WebDriver driver, By locator ) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);",webElement(locator));
//    }

    private static String getMethodName() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        if (stackTraceElements.length >= 2) {
            if (stackTraceElements.length >= 4)
                return stackTraceElements[4].getMethodName();
            return stackTraceElements[2].getMethodName();
        } else {
            return "Unknown";
        }
    }

    public void setSteps(){
        test.info(getMethodName());
    }

    private static void addBorderToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border = '5px solid red'", element);
    }

}
