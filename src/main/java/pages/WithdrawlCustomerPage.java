package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class WithdrawlCustomerPage {
    @FindBy(xpath = "//button[contains(text(),\"Withdrawl\")]")
    WebElement withdrawTab;
    @FindBy(xpath = "//div/div[4]/div/form/div/input")
    WebElement withdrawInput ;
    @FindBy(xpath = "//button[contains(@class,\"btn btn-default\")]")
    WebElement withdrawBtn;
    @FindBy(xpath = "//div/div[4]/div/span")
    WebElement messageLabel;

    public void clickWithdrawlTab() {
        withdrawTab.click();
    }

    public void inputWithdrawl(String amountWithdraw) {
        withdrawInput.clear();
        withdrawInput.sendKeys(amountWithdraw);
    }

    public void submitWihdrawlBtn() {
        withdrawBtn.click();
    }

    public void verifyMessageSuccessfully()  {
        if (messageLabel.isDisplayed()) {
            Assert.assertEquals(messageLabel.getText(),"Transaction successful");
        }
    }

    public void verifyMessageunSuccessfully()  {
        if (messageLabel.isDisplayed()) {
            Assert.assertEquals(messageLabel.getText(),"Transaction Failed. You can not withdraw amount more than the balance.");
        }
    }

}
