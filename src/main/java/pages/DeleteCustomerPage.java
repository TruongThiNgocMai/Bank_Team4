package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import runner.TestRunner;

import java.util.List;

public class DeleteCustomerPage {

    @FindBy(xpath = "//div[2]/div/div/table/tbody")
    WebElement myTable;

    int beforeTable, afterTable;

    public void getCheckDeleteTheInformationTable(String firstName, String lastName, String postCode) throws InterruptedException{
        Thread.sleep(5000);
        List<WebElement> tableRows = myTable.findElements(By.tagName("tr"));
        beforeTable = tableRows.size();
        for (int i = 0; i < tableRows.size() - 1; i++) {
            List<WebElement> myRow = tableRows.get(i).findElements(By.tagName("td"));
            if (myRow.get(0).getText().equalsIgnoreCase(firstName)
                    && myRow.get(1).getText().equalsIgnoreCase(lastName)
                    && myRow.get(2).getText().equalsIgnoreCase(postCode)) {
                TestRunner.driver.findElement(By.xpath("//tr[" + (i + 1) + "]//button")).click();
            }
        }
    }

    public void verifyDeleteCustomerSuccessful(){
        List<WebElement> tableRows = myTable.findElements(By.tagName("tr"));
        afterTable = tableRows.size();
        Assert.assertEquals((beforeTable - 1), afterTable);
    }
}