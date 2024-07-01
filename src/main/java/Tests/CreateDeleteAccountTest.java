package Tests;

import ObjectData.CreateDeleteAccountObject;
import Pages.*;
import PropertyUtility.PropertyUtility;
import SharedData.SharedData;

import org.testng.annotations.Test;

public class CreateDeleteAccountTest extends SharedData {

    @Test
    public void CreateDeleteAccount() {
        PropertyUtility propertyUtility = new PropertyUtility("createDeleteAccount");
        CreateDeleteAccountObject createDeleteAccountObject = new CreateDeleteAccountObject(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToLoginPage();

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.fillNewUserSignUpFields(createDeleteAccountObject);
        loginPage.navigateToSignUpPage();

        SignUpPage signUpPage = new SignUpPage(getWebDriver());
        signUpPage.completeInformation(createDeleteAccountObject);
        signUpPage.pickCountry(createDeleteAccountObject);
        signUpPage.navigateToAccountCreatedHomePage();

        loginPage.userLogout();
        homePage.navigateToLoginPage();
        loginPage.fillUserLoginFields(createDeleteAccountObject);
        loginPage.userLogin();

        homePage.pickMenProduct();
        homePage.pickLadiesProducts();

        ProductDetailsPage productDetailsPage = new ProductDetailsPage(getWebDriver());
        productDetailsPage.fillReviewFields(createDeleteAccountObject);
        productDetailsPage.increaseQtyAndReview(createDeleteAccountObject);

        homePage.navigateToViewCartPage();

        ViewCartPage viewCartPage = new ViewCartPage(getWebDriver());
        viewCartPage.proceedToCheckoutPage();

        CheckoutPage checkoutPage = new CheckoutPage(getWebDriver());
        checkoutPage.validateAddress(createDeleteAccountObject);
        checkoutPage.writeComment(createDeleteAccountObject);
        checkoutPage.placeOrder();

        PaymentPage paymentPage = new PaymentPage(getWebDriver());
        paymentPage.fillPaymentCardFields(createDeleteAccountObject);
        paymentPage.payAndConfirmOrder();

        PaymentDonePage paymentDonePage = new PaymentDonePage(getWebDriver());
        paymentDonePage.fillSubscribeEmail(createDeleteAccountObject);
        paymentDonePage.downloadInvoiceAndContinue();

        homePage.deleteAccount();
    }
}
