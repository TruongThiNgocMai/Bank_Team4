package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchCustomerPage {

    Boolean check;
    @FindBy(xpath = "//div[2]/div/form/div/div/input")
    WebElement searchTest;

    @FindBy(xpath = "//div/div[2]/div/div/table")
    WebElement myTable;

    public void setSearchUserInformation(String fullNameInput) {
        this.searchTest.clear();
        if (!fullNameInput.equals("null")) {
            this.searchTest.sendKeys(fullNameInput);
        }
    }

    public void getSearchResultTableInformation(String fullName) throws InterruptedException {
        Thread.sleep(5000);
        List<WebElement> tableRows = myTable.findElements(By.tagName("tr"));
        for (int i = 1; i < tableRows.size(); i++) {
           String myList = tableRows.get(i).getText();
           if (myList.contains(fullName)){
               check = true;
           }else check = false;
        }

    }
}

