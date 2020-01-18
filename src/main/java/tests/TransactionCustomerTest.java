package tests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static tests.PageProvider.getCommonPage;
import static tests.PageProvider.getTransactionPage;

public class TransactionCustomerTest {

    @When("^I click transaction tab$")
    public void clickTransactionTab() throws InterruptedException {
        Thread.sleep(5000);
        getTransactionPage().navigateTransactionTab();
    }

    @When("^I click reset button$")
    public void clickResetButton() throws InterruptedException {
        Thread.sleep(5000);
        getTransactionPage().resetTableTransaction();
    }

    @Then("^I verify the data of transaction is clear$")
    public void verifyDataReseted() throws InterruptedException {
        Thread.sleep(5000);
        getTransactionPage().verifyResetButtonSuccess();
    }

    @When("^I click back button$")
    public void clickBackButton() throws InterruptedException {
        Thread.sleep(5000);
        getTransactionPage().backButtonAtTransaction();
    }


    @Then("^I verify page transaction backed$")
    public void verifyPageBack() throws InterruptedException {
        Thread.sleep(5000);
        getTransactionPage().verifyBackButtonSuccess();
    }

    @Then("^I verify balance equals 0 successfully$")
    public void verifyDataCorrect() throws InterruptedException {
        Thread.sleep(5000);
        getTransactionPage().verifyBalance();
    }
}
