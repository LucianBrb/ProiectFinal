package SharedData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class SharedData {
    private WebDriver webDriver;

    @BeforeMethod
    public void prepareDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");


        //deschide un browser de Chrome
        webDriver = new ChromeDriver(options);
        //accesam un URL
        webDriver.get("https://automationexercise.com/");
        //maximizare fereastra
        webDriver.manage().window().maximize();
        //wait implicit
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void clearDriver() {
        webDriver.quit();
    }


    public WebDriver getWebDriver() {
        return webDriver;
    }
}
