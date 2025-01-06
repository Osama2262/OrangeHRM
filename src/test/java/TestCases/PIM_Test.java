package TestCases;

import Base.BaseTest;
import Pages.AdminPage;
import Pages.DashboardPage;
import Pages.LoginPage;
import Pages.PIM_Page;
import org.testng.annotations.Test;

public class PIM_Test extends BaseTest {

    @Test(priority = 9)
    public void CreateNewEmployee() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login();
                DashboardPage dashboardPage= new DashboardPage(driver);
                dashboardPage.gotoPIMPage();
                PIM_Page pimPage =new PIM_Page(driver);
                pimPage.goToAddEmployee_tab()
                        .FillEmployeeInfo()
                        .VerifyThatUserAreCreated();
    }
    @Test(priority = 10)
    public void SearchingForEmployee() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login();
        DashboardPage dashboardPage= new DashboardPage(driver);
        dashboardPage.gotoPIMPage();
        PIM_Page pimPage =new PIM_Page(driver);
        pimPage.goToEmployeeList_tab()
                .SearchForEmployee()
                .verifySearchingForEmployee();
    }

    @Test(priority = 11)
    public void AssignEmployeeToJob() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login();
        DashboardPage dashboardPage= new DashboardPage(driver);
        dashboardPage.gotoPIMPage();
        PIM_Page pimPage =new PIM_Page(driver);
        pimPage.goToEmployeeList_tab()
                .SearchForEmployee()
                .AssignEmployeeToJob()
                .goToEmployeeList_tab()
                .SearchForEmployee()
                .verifyAssigningEmployeeToJob();

    }
    @Test(priority = 12)
    public void AssignEmployeeToOrganization() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login();
        DashboardPage dashboardPage= new DashboardPage(driver);
        dashboardPage.gotoPIMPage();
        PIM_Page pimPage =new PIM_Page(driver);
        pimPage.goToEmployeeList_tab()
                .SearchForEmployee()
                .ChangeLocationValue();
        dashboardPage.gotoAdminPage();
        AdminPage adminPage = new AdminPage(driver);
            adminPage.gotoLocation_tab()
                    .SearchingAndAssertForLocation();

    }
    @Test(priority = 13)
    public void DeleteEmployee() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login();
        DashboardPage dashboardPage= new DashboardPage(driver);
        dashboardPage.gotoPIMPage();
        PIM_Page pimPage =new PIM_Page(driver);
        pimPage.goToEmployeeList_tab();
        AdminPage adminPage = new AdminPage(driver);
         adminPage
                 .DeleteUserOrEmployee();
    }

}
