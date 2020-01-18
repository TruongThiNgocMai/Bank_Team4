package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

import static java.lang.Thread.sleep;

public class TransactionCustomerPage {
    @FindBy(xpath = "//strong[2]")
    WebElement balance;

    @FindBy(xpath = "//div/div[3]/button[1]")
    WebElement transactionTab;

    @FindBy(xpath = "//div[3]/button[2]")
    WebElement depositTab;

    @FindBy(xpath = "//div[3]/button[3]")
    WebElement withdrawBtn;

    @FindBy(xpath = "//div[2]/table")
    WebElement table;

    @FindBy(xpath = "//div[2]/div/div[1]/button[1]")
    WebElement backBtn;

    @FindBy(xpath = "//div[2]/div/div[1]/button[2]")
    WebElement resetBtn;

    @FindBy(xpath = "//strong/span")
    WebElement welcomeName;


    public void navigateTransactionTab() {
        transactionTab.click();
    }

    public void resetTableTransaction() {
        resetBtn.click();
    }

    public void verifyBackButtonSuccess() {
        if (transactionTab.isDisplayed() && depositTab.isDisplayed()
                && withdrawBtn.isDisplayed() && welcomeName.isDisplayed()) {
            System.out.println("Navigate Home Page Successfully!!!");
        } else {
            System.out.println("Navigate Home Page unSuccessfully!!!");
        }
    }

    public void backButtonAtTransaction() {
        backBtn.click();
    }

    public void verifyResetButtonSuccess() {
        List<WebElement> listTr = table.findElements(By.xpath("tbody/tr"));
        Assert.assertEquals(listTr.size(), 0);
    }

    public void verifyBalance() {
        Assert.assertEquals(balance.getText(), "0");
    }
}
