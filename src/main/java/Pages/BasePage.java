package Pages;

import Methods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver webDriver;
    public ElementMethods elementMethods;

    @FindBy(xpath = "//p[@class='fc-button-label']")
    public WebElement consentButton;
    @FindBy(xpath = "//div/div[@class='fc-dialog-overlay']")
    public WebElement consentDialogBox;

    @FindBy(xpath = "//div/iframe[@id='aswift_1']")
    public WebElement advertismentBox;
    @FindBy(xpath = "//div/span[text()='Close']")
    public WebElement closeButtonAdvert;

    @FindBy(xpath = "//div[@id='card']")
    public WebElement advertismentBigBox;
    @FindBy(xpath = "//div[@id='dismiss-button']")
    public WebElement dismissButtonAdvert;

    @FindBy (xpath = "//div/iframe[@name='aswift_5']")
    public WebElement getAdvertismentBox2;


    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        elementMethods = new ElementMethods(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
