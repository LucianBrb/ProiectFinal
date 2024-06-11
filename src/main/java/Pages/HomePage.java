package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//a[@href='/login']")
    private WebElement SignUpLogInButton;
    @FindBy(xpath = "//a[@href='/delete_account']")
    private WebElement deleteAccountButton;
    @FindBy(xpath = "//div/a[@data-qa='continue-button']")
    private WebElement continueButton;



    @FindBy(xpath = "//h4/a[@href='#Men']")
    private WebElement menCategoryField;
    @FindBy(xpath = "//a[@href='/category_products/6']")
    private WebElement jeansCategoryField;
    @FindBy(xpath = "//div/a[@data-product-id=\"37\"]")
    private WebElement gruntBlueModelAddToChartButton;
    @FindBy(xpath = "//button[text()='Continue Shopping']")
    private WebElement continueShoppingButton;
    @FindBy(xpath = "//a[@href='/brand_products/Madame']")
    private WebElement madammeBrandsField;
    @FindBy(xpath = "//a[@href=\"/product_details/41\"]")
    private WebElement viewProductButton;


    @FindBy(xpath = "//a[@href='/view_cart']")
    private WebElement cartButton;


    @FindBy (xpath = "//u[text()='Register / Login']")
    private WebElement registerLoginLink;


    public void navigateToLoginPage() {
        elementMethods.clickElemForce(SignUpLogInButton);
    }

    public void navigateToViewCartPage(){
        elementMethods.clickElement(cartButton);
    }

    public void pickMenProduct (){
        elementMethods.clickElemForce(menCategoryField);
        elementMethods.scrollElementByPixel(0,250);
        elementMethods.clickElemForce(jeansCategoryField);
        elementMethods.clickElemForce(gruntBlueModelAddToChartButton);
        elementMethods.clickElemForce(continueShoppingButton);
    }
    public void pickLadiesProducts(){
        //elementMethods.handlePopupButtons(getAdvertismentBox2,dismissButtonAdvert);
        elementMethods.clickElement(madammeBrandsField);
        elementMethods.scrollElementByPixel(0,750);
        elementMethods.clickElement(viewProductButton);
    }

    public void deleteAccount(){
        //elementMethods.handlePopupButtons(consentDialogBox,consentButton);
        elementMethods.clickElement(deleteAccountButton);
        //elementMethods.handlePopupButtons(consentDialogBox,consentButton);
        elementMethods.clickElement(continueButton);
    }




}
