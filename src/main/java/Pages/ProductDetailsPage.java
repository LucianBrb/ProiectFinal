package Pages;

import ObjectData.CreateDeleteAccountObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends BasePage{
    public ProductDetailsPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(id = "name")
    private WebElement reviewNameField;
    @FindBy(id = "email")
    private WebElement reviewEmailField;
    @FindBy(id = "review")
    private WebElement reviewField;
    @FindBy(xpath = "//input[@value='1']")
    private WebElement increaseQuantityField;
    @FindBy(xpath = "//span/button/i[@class='fa fa-shopping-cart']")
    private WebElement addToCartButton;
    @FindBy(xpath = "//button[text()='Continue Shopping']")
    private WebElement continueShoppingButton;
    @FindBy(xpath = "//p[text()='Consent']")
    private WebElement consentButton;



    public void fillReviewFields (CreateDeleteAccountObject createDeleteAccountObject){
        //elementMethods.handlePopupButtons(consentDialogBox,consentButton);
        elementMethods.fillElement(reviewNameField,createDeleteAccountObject.getUserNameValue());
        elementMethods.fillElement(reviewEmailField,createDeleteAccountObject.getUserEmailAddressValue());
        elementMethods.fillElement(reviewField,createDeleteAccountObject.getReviewMessage());
    }
    public void increaseQtyAndReview (CreateDeleteAccountObject createDeleteAccountObject){
        elementMethods.refillElement(increaseQuantityField,createDeleteAccountObject.getIncreaseQtyValue());
        elementMethods.clickElement(addToCartButton);
        elementMethods.clickElement(continueShoppingButton);
    }
}
