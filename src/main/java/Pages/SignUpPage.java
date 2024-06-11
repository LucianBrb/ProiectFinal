package Pages;

import ObjectData.CreateDeleteAccountObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {
    public SignUpPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath = "//input[@value='Mr']")
    private WebElement selectTitleMr;
    @FindBy(id = "password")
    private WebElement userPassword;
    @FindBy(xpath = "//input[@data-qa='first_name']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@data-qa='last_name']")
    private WebElement lastName;
    @FindBy(xpath = "//input[@data-qa='address']")
    public WebElement userAddress;
    @FindBy(id = "country")
    private WebElement countryField;
    @FindBy(id = "city")
    private WebElement cityField;
    @FindBy(id = "state")
    private WebElement stateField;
    @FindBy(id = "zipcode")
    private WebElement zipCodeField;
    @FindBy(id = "mobile_number")
    private WebElement mobileNumberField;
    @FindBy(xpath = "//button[@data-qa='create-account']")
    private WebElement createAccountButton;
    @FindBy(xpath = "//div/a[@data-qa='continue-button']")
    private WebElement continueButton;

    public void completeInformation(CreateDeleteAccountObject createDeleteAccountObject) {
        //elementMethods.handlePopupButtons(consentDialogBox,consentButton);
        elementMethods.clickElement(selectTitleMr);
        elementMethods.fillElement(userPassword,createDeleteAccountObject.getPasswordValue());
        elementMethods.fillElement(firstName, createDeleteAccountObject.getFirstName());
        elementMethods.fillElement(lastName, createDeleteAccountObject.getUserNameValue());
        elementMethods.fillElement(userAddress, createDeleteAccountObject.getUserAddress());
        elementMethods.fillElement(cityField, createDeleteAccountObject.getCityFieldValue());
        elementMethods.fillElement(stateField, createDeleteAccountObject.getStateFieldValue());
        elementMethods.fillElement(zipCodeField, createDeleteAccountObject.getZipCodeFieldValue());
        elementMethods.fillElement(mobileNumberField, createDeleteAccountObject.getMobileNumberFieldValue());
    }

    public void pickCountry(CreateDeleteAccountObject createDeleteAccountObject) {
        elementMethods.clickElement(countryField);
        elementMethods.selectTextElement(countryField, createDeleteAccountObject.getCountry());
        elementMethods.scrollElementByPixel(0,200);
    }

    public void navigateToAccountCreatedHomePage() {
        elementMethods.clickElement(createAccountButton);
        //elementMethods.handlePopupButtons(consentDialogBox,consentButton);
        elementMethods.clickElement(continueButton);

    }
}
