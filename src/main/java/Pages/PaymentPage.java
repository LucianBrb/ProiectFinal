package Pages;

import ObjectData.CreateDeleteAccountObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage{
    public PaymentPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath = "//input[@data-qa='name-on-card']")
    private WebElement nameOnCardField;
    @FindBy(xpath = "//input[@data-qa='card-number']")
    private WebElement cardNumberField;
    @FindBy(xpath = "//input[@data-qa='cvc']")
    private WebElement cvcField;
    @FindBy(xpath = "//input[@data-qa='expiry-month']")
    private WebElement expirationMonthField;
    @FindBy(xpath = "//input[@data-qa='expiry-year']")
    private WebElement expirationYearField;
    @FindBy(id = "submit")
    private WebElement payAndConfirmOrderButton;

    @FindBy(xpath = "//div/a[@data-qa='continue-button']")
    private WebElement continueButton;

    public void fillPaymentCardFields(CreateDeleteAccountObject createDeleteAccountObject){
        //elementMethods.handlePopupButtons(consentDialogBox,consentButton);
        elementMethods.fillElement(nameOnCardField,createDeleteAccountObject.getNameOnCardValue());
        elementMethods.fillElement(cardNumberField,createDeleteAccountObject.getCardNumberValue());
        elementMethods.fillElement(cvcField,createDeleteAccountObject.getCvcValue());
        elementMethods.fillElement(expirationMonthField,createDeleteAccountObject.getExpirationMonthValue());
        elementMethods.fillElement(expirationYearField,createDeleteAccountObject.getExpirationYearValue());
    }
    public void payAndConfirmOrder(){
        elementMethods.clickElement(payAndConfirmOrderButton);
    }
}
