package tests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static tests.PageProvider.getDeleteCustomerPage;

public class DeleteCustomerTest {

    @When("^I delete customer with (.+) as (.+) as (.+)")
    public void deleteCustomerSuccessfully(String firstName, String lastName, String postCode) throws InterruptedException {
        Thread.sleep(5000);
        getDeleteCustomerPage().getCheckDeleteTheInformationTable(firstName, lastName, postCode);
    }

    @Then("^I verify delete customer successfully$")
    public void verifyDeleteCustomer() throws InterruptedException {
        Thread.sleep(5000);
        getDeleteCustomerPage().verifyDeleteCustomerSuccessful();
    }
}
