package TestCases;

import Base.BaseTest;
import Pages.AdminPage;
import Pages.DashboardPage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class AdminTest extends BaseTest {

    @Test(priority = 1)
    public void CreateNewUserManagement() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login();
        DashboardPage dashboardPage =new DashboardPage(driver);
        dashboardPage.gotoAdminPage();
        AdminPage adminPage= new AdminPage(driver);
        adminPage.AddNewUser();
        Thread.sleep(2000);

    }
    @Test(priority = 2)
    public void UserManagementAppearsOnSearchingResults() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login();
        DashboardPage dashboardPage =new DashboardPage(driver);
        dashboardPage.gotoAdminPage();
        AdminPage adminPage= new AdminPage(driver);
        adminPage.SearchForUser()
                .verifySearchingResult();
    }
    @Test(priority = 3)
    public void EditTheCurrentUser() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login();
        DashboardPage dashboardPage =new DashboardPage(driver);
        dashboardPage.gotoAdminPage();
        AdminPage adminPage= new AdminPage(driver);
                adminPage.EditUser();
    }
    @Test(priority = 4)
    public void DeleteUser() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login();
        DashboardPage dashboardPage =new DashboardPage(driver);
        dashboardPage.gotoAdminPage();
        AdminPage adminPage= new AdminPage(driver);
        adminPage.DeleteUserOrEmployee()
                .verifyDelete();
    }
    @Test(priority = 5)
    public void createNewJob() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login();
        DashboardPage dashboardPage =new DashboardPage(driver);
        dashboardPage.gotoAdminPage();
        AdminPage adminPage= new AdminPage(driver);
        adminPage.AddNewJob()
                .verifyCurrentURL();
    }
    @Test(priority = 6)
    public void EditCurrentJob() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login();
        DashboardPage dashboardPage =new DashboardPage(driver);
        dashboardPage.gotoAdminPage();
        AdminPage adminPage= new AdminPage(driver);
        adminPage.EditJob();
    }
    @Test(priority = 7)
    public void DeleteCurrentJob() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage
                .load()
                .login();
        DashboardPage dashboardPage =new DashboardPage(driver);
        dashboardPage.gotoAdminPage();
        AdminPage adminPage = new AdminPage(driver);
        adminPage.
                DeleteJob();
    }
    @Test(priority = 8)
    public void createNewOrganizationLocation() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage
                .load()
                .login();
        DashboardPage dashboardPage =new DashboardPage(driver);
                dashboardPage.gotoAdminPage();
                AdminPage adminPage = new AdminPage(driver);
                adminPage
                        .gotoLocation_tab()
                        .createNewOrganizationLocation()
                        .verifyCreatingOrg();
    }

}
