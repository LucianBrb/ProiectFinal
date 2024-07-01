package Pages;

import ObjectData.CreateDeleteAccountObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//div/form/input[@data-qa='signup-name']")
    private WebElement userNameField;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    private WebElement newUserEmailAddressField;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    private WebElement signUpButton;

    @FindBy(xpath = "//input[@placeholder='Email Address']")
    private WebElement emailAddressField;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement userPasswordField;
    @FindBy(xpath = "//button[@data-qa='login-button']")
    private WebElement loginButton;
    @FindBy(xpath = "//a[@href='/logout']")
    private WebElement logoutButton;

    public void fillNewUserSignUpFields(CreateDeleteAccountObject createDeleteAccountObject) {
        elementMethods.handlePopupButtons(consentDialogBox, consentButton);
        elementMethods.fillElement(userNameField, createDeleteAccountObject.getUserNameValue());
        elementMethods.fillElement(newUserEmailAddressField, createDeleteAccountObject.getUserEmailAddressValue());
    }
    public void navigateToSignUpPage(){
        elementMethods.clickElement(signUpButton);
    }




    public void fillUserLoginFields (CreateDeleteAccountObject createDeleteAccountObject){
        //elementMethods.handlePopupButtons(consentDialogBox,consentButton);
        elementMethods.fillElement(emailAddressField, createDeleteAccountObject.getUserEmailAddressValue());
        elementMethods.fillElement(userPasswordField, createDeleteAccountObject.getPasswordValue());
    }
    public void userLogin () {
        elementMethods.clickElement(loginButton);
    }



    public void userLogout(){
        //elementMethods.handlePopupButtons(consentDialogBox,consentButton);
        //elementMethods.handlePopupButtons(advertismentBox,closeButtonAdvert);
        elementMethods.clickElement(logoutButton);
    }





}
