package Pages;

import ObjectData.CreateDeleteAccountObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentDonePage extends BasePage{
    public PaymentDonePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "susbscribe_email")
    private WebElement subscribeField;    //input[@id='susbscribe_email']
    @FindBy(xpath ="//a[text()='Download Invoice']")
    private WebElement downloadInvoiceButton;
    @FindBy(xpath = "//div/a[@data-qa='continue-button']")   //il am multimplicat in homePage, paymentPage si aici - cum il pot scrie doar o singura data ?????
    private WebElement continueButton;

    public void fillSubscribeEmail (CreateDeleteAccountObject createDeleteAccountObject){
        elementMethods.scrollElementByPixel(0,500);
        elementMethods.fillElement(subscribeField,createDeleteAccountObject.getUserEmailAddressValue());
    }
    public void downloadInvoiceAndContinue (){
        //elementMethods.clickElement(downloadInvoiceButton);
        //elementMethods.handlePopupButtons(advertismentBox, closeButtonAdvert );
        //elementMethods.handlePopupButtons(advertismentBigBox, dismissButtonAdvert);
        elementMethods.clickElement(continueButton);
    }
}
