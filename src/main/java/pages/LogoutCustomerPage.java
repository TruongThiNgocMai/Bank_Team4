package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutCustomerPage {
    @FindBy(xpath = "//div[3]/div/div[1]/button[2]")
    WebElement logOutBtn;

    public void clickLogoutBtn() throws InterruptedException {
        Thread.sleep(5000);
        logOutBtn.click();
        Thread.sleep(5000);
    }

    public void verifyLogOut() throws InterruptedException {
        Thread.sleep(5000);
        if(!(logOutBtn.isDisplayed())){
            System.out.println("Logout Successfully");
        }
        else {
            System.out.println("Logout unSuccessfully");
        }
        Thread.sleep(5000);
    }
}
