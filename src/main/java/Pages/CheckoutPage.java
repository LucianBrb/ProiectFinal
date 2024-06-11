package Pages;

import ObjectData.CreateDeleteAccountObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//textarea[@name='message']")
    private WebElement commentField;
    @FindBy(xpath = "//a[text()='Place Order']")
    private WebElement placeOrderButton;


    @FindBy(xpath = "//ul[@id='address_delivery']/li")
    private List<WebElement> deliveryAddress;


    public void writeComment(CreateDeleteAccountObject createDeleteAccountObject) {
        //elementMethods.handlePopupButtons(consentDialogBox, consentButton);
        elementMethods.fillElement(commentField, createDeleteAccountObject.getCommentValue());
    }

    public void placeOrder() {
        elementMethods.scrollElementByPixel(0, 750);
        elementMethods.clickElement(placeOrderButton);
    }

    public void validateAddress(CreateDeleteAccountObject createDeleteAccountObject) {

        Assert.assertEquals(deliveryAddress.get(1).getText(),"Mr. "+createDeleteAccountObject.getNameOnCardValue()+" "
                +createDeleteAccountObject.getUserNameValue());
        Assert.assertEquals(deliveryAddress.get(3).getText(),createDeleteAccountObject.getUserAddress());
        Assert.assertEquals(deliveryAddress.get(5).getText(),createDeleteAccountObject.getCityFieldValue()+" "
                + createDeleteAccountObject.getStateFieldValue()+" "+createDeleteAccountObject.getZipCodeFieldValue());
        Assert.assertEquals(deliveryAddress.get(6).getText(),createDeleteAccountObject.getCountry());
        Assert.assertEquals(deliveryAddress.get(7).getText(),createDeleteAccountObject.getMobileNumberFieldValue());
        System.out.println("Delivery Address validation successfully done!");

    }
}
