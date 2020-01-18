package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage {

    @FindBy(xpath = "//div[1]/input")
    WebElement firstname;

    @FindBy(xpath = "//div[2]/input")
    WebElement lastname;

    @FindBy(xpath = "//div[3]/input")
    WebElement postcode;

    @FindBy(xpath = "//form/button")
    WebElement addCustomerBtn;


    public void setUserInformation(String firstnameInput, String lastnameInput, String postcodeInput) {
        this.firstname.clear();
        if (!firstnameInput.equals("null")) {
            this.firstname.sendKeys(firstnameInput);
        }
        this.lastname.clear();
        if (!lastnameInput.equals("null")) {
            this.lastname.sendKeys(lastnameInput);
        }
        this.postcode.clear();
        if (!postcodeInput.equals("null")) {
            this.postcode.sendKeys(postcodeInput);
        }
    }

    public void clickSubmit() {
        addCustomerBtn.click();
    }
}
