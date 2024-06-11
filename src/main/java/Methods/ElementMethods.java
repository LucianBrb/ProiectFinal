package Methods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ElementMethods {
    private WebDriver webDriver;

    public ElementMethods(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void scrollElementByPixel(Integer x, Integer y) {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(" + x + "," + y + ")", "");
    }

    public void waitVisibleElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickElement(WebElement element) {
        waitVisibleElement(element);
        element.click();
    }

    public void fillElement(WebElement element, String value) {
        waitVisibleElement(element);
        element.sendKeys(value);
    }

    public void refillElement(WebElement element, String value) {
        waitVisibleElement(element);
        element.clear();
        element.sendKeys(value);
    }

    public void selectTextElement(WebElement element, String value) {
        waitVisibleElement(element);
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public void clickElemForce(WebElement element) {
        waitVisibleElement(element);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].click();", element);
    }

    public void handlePopupButtons(WebElement element, WebElement clickableElement) {
        try {
            if (element.isDisplayed() && element.isEnabled()) {
                clickElement(clickableElement);
                System.out.println("Consent button was clicked");
            }
        } catch (Exception e) {
            System.out.println("Error handling consent button");
        }
    }
}
