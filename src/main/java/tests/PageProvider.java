package tests;

import org.openqa.selenium.support.PageFactory;
import pages.*;
import runner.TestRunner;

public class PageProvider {

    private static LoginCustomerPage loginCustomerPage;
    private static DepositCustomerPage depositCustomerPage;

    private static TransactionCustomerPage transactionCustomerPage;
    private static AddCustomerPage addCustomerPage;
    private static OpenAccountPage openAccountPage;
    private static CommonPage commonPage;
    private static SearchCustomerPage searchCustomerPage;
    private static DeleteCustomerPage deleteCustomerPage;
    private static LogoutCustomerPage logoutCustomerPage;
    private static WithdrawlCustomerPage withdrawlCustomerPage;

    public static WithdrawlCustomerPage getWithdrawlCustomerPage() {
        withdrawlCustomerPage = PageFactory.initElements(TestRunner.driver, WithdrawlCustomerPage.class);
        return withdrawlCustomerPage;
    }
    public static AddCustomerPage getAddCustomerPage() {
        addCustomerPage = PageFactory.initElements(TestRunner.driver, AddCustomerPage.class);
        return addCustomerPage;
    }

    public static OpenAccountPage getOpenAccountPage() {
        openAccountPage = PageFactory.initElements(TestRunner.driver, OpenAccountPage.class);
        return openAccountPage;
    }

    public static CommonPage getCommonPage() {
        commonPage = PageFactory.initElements(TestRunner.driver, CommonPage.class);
        return commonPage;
    }

    public static SearchCustomerPage getSearchCustomerPage() {
        searchCustomerPage = PageFactory.initElements(TestRunner.driver, SearchCustomerPage.class);
        return searchCustomerPage;
    }

    public static DeleteCustomerPage getDeleteCustomerPage() {
        if (deleteCustomerPage == null) {
            deleteCustomerPage = PageFactory.initElements(TestRunner.driver, DeleteCustomerPage.class);
        }
        return deleteCustomerPage;
    }

    public static LoginCustomerPage getLoginCustomerPage() {
        loginCustomerPage = PageFactory.initElements(TestRunner.driver, LoginCustomerPage.class);
        return loginCustomerPage;
    }

    public static DepositCustomerPage getDepositCustomerPage() {
        if (depositCustomerPage == null) {
            depositCustomerPage = PageFactory.initElements(TestRunner.driver, DepositCustomerPage.class);
        }
        return depositCustomerPage;
    }



    public static TransactionCustomerPage getTransactionPage() {
        if (transactionCustomerPage == null) {
            transactionCustomerPage = PageFactory.initElements(TestRunner.driver, TransactionCustomerPage.class);
        }
        return transactionCustomerPage;
    }

    public static LogoutCustomerPage getLogoutCustomerPage() {
        logoutCustomerPage = PageFactory.initElements(TestRunner.driver, LogoutCustomerPage.class);
        return logoutCustomerPage;
    }

}
