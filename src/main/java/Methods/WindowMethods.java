package Methods;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class WindowMethods {
    public WebDriver webDriver;

    public WindowMethods(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    public void switchSpecificWindow (Integer index){
        List<String> windowsOpened = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(windowsOpened.get(index));  //schimba focus-ul pe al doilea window, window(1)
        System.out.println("Window curent are URL-ul " + webDriver.getCurrentUrl());
    }
//
//    public void closeCurrentTabWindow (){
//        webDriver.close();
//    }

}
