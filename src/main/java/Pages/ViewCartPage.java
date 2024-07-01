package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewCartPage extends BasePage{

    public ViewCartPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//a[text()='Proceed To Checkout']")
    private WebElement proceedToCheckoutButton;

    public void proceedToCheckoutPage (){
        //elementMethods.handlePopupButtons(consentDialogBox,consentButton);
        elementMethods.clickElement(proceedToCheckoutButton);
    }
}
