package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.text.ParseException;

import static tests.PageProvider.*;

public class WithdrawlCustomerTest {
    String datetime = "";
    @When ("^I open withdrawl tab$")
    public void clickWithdrawTab() throws InterruptedException{
        Thread.sleep(5000);
        getWithdrawlCustomerPage().clickWithdrawlTab();
    }
    @When("^I type withdrawl as (.*)$")
    public void typeWithdrawl(String amountWithdraw) throws InterruptedException{
        Thread.sleep(5000);
        getWithdrawlCustomerPage().inputWithdrawl(amountWithdraw);
    }
    @And("^I click withdrawl submit button$")
    public void clickWithdrawlBtn() throws InterruptedException{
        Thread.sleep(5000);
        getWithdrawlCustomerPage().submitWihdrawlBtn();
    }
    @Then ("^I verify amount input of Withdrawl successfully$")
    public void verifyInputWithdrawlsuccessfully() throws InterruptedException{
        Thread.sleep(5000);
        getWithdrawlCustomerPage().verifyMessageSuccessfully();
    }

    @Then ("^I verify amount input of Withdrawl unsuccessfully$")
    public void verifyInputWithdrawlunsuccessfully() throws InterruptedException{
        Thread.sleep(5000);
        getWithdrawlCustomerPage().verifyMessageunSuccessfully();
    }

    @Then ("^I click Transaction to navigate to Transaction Tab$")
    public void clickTransactionTab() throws InterruptedException{
        Thread.sleep(5000);
        getTransactionPage().navigateTransactionTab();
    }
    @Then("^I verify that customer input withdrawl successfully as (.*)$")
    public void verifyWithdrawlSuccessfully(String withdrawl) throws InterruptedException, ParseException {
        Thread.sleep(5000);
        getCommonPage().verifyAmountInput(withdrawl, datetime, "Debit", "fail");
    }

}
