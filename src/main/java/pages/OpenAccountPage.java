package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class OpenAccountPage {

    @FindBy(xpath = "//div[2]/div/div[1]/button[2]")
    WebElement openAccountTab;

    @FindBy(id = "userSelect")
    WebElement userSelect;

    @FindBy(id = "currency")
    WebElement currency;

    @FindBy(xpath = "//div[2]/div/div/form/button")
    WebElement processBtn;

    public void clickOpenAccountTab() throws InterruptedException {
        Thread.sleep(5000);
        openAccountTab.click();
        Thread.sleep(5000);
    }

    public void clickCheckUserName() throws InterruptedException {
        Thread.sleep(5000);
        userSelect.click();
        Thread.sleep(5000);
    }

    public void checkUserInformation(String fullnameInput, Boolean success) {
        List<WebElement> userList = userSelect.findElements(By.tagName("option"));
        Boolean check = false;

        for (WebElement user : userList) {
            if (user.getText().equals(fullnameInput)) {
                check = true;
            }
        }
        if (success) {
            if (!check) Assert.assertEquals(1, 0);
        } else {
            if (check) Assert.assertEquals(1, 0);
        }
    }

    public void getUserInformation(String usernameInput) throws InterruptedException {
        Thread.sleep(5000);
        Select userSelects = new Select(userSelect);
        userSelects.selectByVisibleText(usernameInput);
        Thread.sleep(5000);
    }

    public void getCurrency(String currencyInput) throws InterruptedException {
        Thread.sleep(5000);
        Select userSelects = new Select(currency);
        userSelects.selectByVisibleText(currencyInput);
        Thread.sleep(5000);
    }

    public void clickProcess() throws InterruptedException {
        Thread.sleep(5000);
        processBtn.click();
        Thread.sleep(5000);
    }

}
