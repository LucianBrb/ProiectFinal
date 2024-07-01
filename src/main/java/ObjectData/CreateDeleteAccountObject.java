package ObjectData;

import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.asm.Advice;

import java.util.Map;

@Getter
@Setter
public class CreateDeleteAccountObject extends GeneralObject {
    private String userNameValue;
    private String userEmailAddressValue;
    private String passwordValue;
    private String nameOnCardValue;
    private String cardNumberValue;
    private String cvcValue;
    private String expirationMonthValue;
    private String expirationYearValue;
    private String country;
    private String increaseQtyValue;
    private String commentValue;
    private String reviewMessage;
    private String firstName;
    private String lastName;
    private String userAddress;
    private String cityFieldValue;
    private String stateFieldValue;
    private String zipCodeFieldValue;
    private String mobileNumberFieldValue;

    public CreateDeleteAccountObject(Map<String, String> testData) {
        prepareObject(testData);
    }

    private void prepareObject(Map<String, String> testData) {
        for (String key : testData.keySet()) {
            switch (key) {
                case "userNameValue":
                    setUserNameValue(testData.get(key));
                    break;
                case "userEmailAddressValue":
                    setUserEmailAddressValue(testData.get(key));
                    break;
                case "passwordValue":
                    setPasswordValue(testData.get(key));
                    break;
                case "nameOnCardValue":
                    setNameOnCardValue(testData.get(key));
                    break;
                case "cardNumberValue":
                    setCardNumberValue(testData.get(key));
                    break;
                case "cvcValue":
                    setCvcValue(testData.get(key));
                    break;
                case "expirationMonthValue":
                    setExpirationMonthValue(testData.get(key));
                    break;
                case "expirationYearValue":
                    setExpirationYearValue(testData.get(key));
                    break;
                case "country":
                    setCountry(testData.get(key));
                    break;
                case "increaseQtyValue":
                    setIncreaseQtyValue(testData.get(key));
                    break;
                case "commentValue":
                    setCommentValue(testData.get(key));
                    break;
                case "reviewMessage":
                    setReviewMessage(testData.get(key));
                    break;
                case "firstName":
                    setFirstName(testData.get(key));
                    break;
                case "lastName":
                    setLastName(testData.get(key));
                    break;
                case "userAddress":
                    setUserAddress(testData.get(key));
                    break;
                case "cityFieldValue":
                    setCityFieldValue(testData.get(key));
                    break;
                case "stateFieldValue":
                    setStateFieldValue(testData.get(key));
                    break;
                case "zipCodeFieldValue":
                    setZipCodeFieldValue(testData.get(key));
                    break;
                case "mobileNumberFieldValue":
                    setMobileNumberFieldValue(testData.get(key));
                    break;
            }
        }
    }

}