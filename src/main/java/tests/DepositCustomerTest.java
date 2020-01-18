package tests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.text.ParseException;

import static java.lang.Thread.sleep;

import static tests.PageProvider.getDepositCustomerPage;
import static tests.PageProvider.getTransactionPage;
import static tests.PageProvider.getCommonPage;

public class DepositCustomerTest {
    String datetime = "";

    @When("^I click deposit tab$")
    public void clickDepositTab() throws InterruptedException {
        sleep(5000);
        getDepositCustomerPage().navigateToDepositTab();
    }

    @When("^I type the deposit as (.*)$")
    public void chooseDepositAmount(String depositAmount) throws InterruptedException {
        sleep(5000);
        getDepositCustomerPage().typeDepositAmount(depositAmount);

    }

    @When("^I click deposit submit button$")
    public void clickDepositSubmitButton() throws InterruptedException {
        sleep(5000);
        getDepositCustomerPage().submitDeposit();
        datetime = getCommonPage().getDateTime();
    }

    @Then("^I verify amount input of Deposit")
    public void verifyMessageSuccesfully() throws InterruptedException {
        sleep(5000);
        getDepositCustomerPage().verifyMessageSuccessfully();
    }

    @Then("^I navigate to Transaction Tab")
    public void navigateTransactionTab() throws InterruptedException {
        sleep(5000);
        getTransactionPage().navigateTransactionTab();
    }

    @Then("^I verify that customer deposit successfully as (.*)$")
    public void verifyDepositSuccesfully(String deposit) throws InterruptedException, ParseException {
        sleep(5000);
        getCommonPage().verifyAmountInput(deposit, datetime, "Credit", "success" );
    }

    @Then("^I verify that customer deposit unsuccessfully as (.*)$")
    public void verifyDepositunSuccesfully(String deposit) throws InterruptedException, ParseException {
        sleep(5000);
        getCommonPage().verifyAmountInput(deposit, datetime, "Credit", "fail");
    }
}
