package TestCases;

import Base.BaseTest;
import Pages.DashboardPage;
import Pages.LoginPage;
import Pages.RecruitmentPage;
import org.testng.annotations.Test;

public class RecruitmentTest extends BaseTest {

    @Test(priority = 14)
    public void CreateCandidate() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login();
        DashboardPage dashboardPage= new DashboardPage(driver);
        dashboardPage.gotoRecruitmentPage();
        RecruitmentPage recruitmentPage = new RecruitmentPage(driver);
        recruitmentPage.addCandidate()
                .SearchForCandidates()
                .verifySearchingForCandidate();

    }
    @Test(priority = 15)
    public void AddCandidateToShortList() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login();
        DashboardPage dashboardPage= new DashboardPage(driver);
        dashboardPage.gotoRecruitmentPage();
        RecruitmentPage recruitmentPage = new RecruitmentPage(driver);
        recruitmentPage.SearchForCandidates()
                .clickOnEyeICON()
                .AddToShortList()
                .verify_Shortlist_Status();
    }
    @Test(priority = 16)
    public void AddCandidateToScheduleInterview() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login();
        DashboardPage dashboardPage= new DashboardPage(driver);
        dashboardPage.gotoRecruitmentPage();
        RecruitmentPage recruitmentPage = new RecruitmentPage(driver);
        recruitmentPage.SearchForCandidates()
                .clickOnEyeICON()
                .ScheduleInterview()
                .verify_InterviewScheduled_Status();
    }
    @Test(priority = 17)
    public void MakeCandidatePassTheInterview() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login();
        DashboardPage dashboardPage= new DashboardPage(driver);
        dashboardPage.gotoRecruitmentPage();
        RecruitmentPage recruitmentPage = new RecruitmentPage(driver);
        recruitmentPage.SearchForCandidates()
                .clickOnEyeICON()
                .MarkInterviewPassed()
                .verify_InterviewPassed_Status();
    }
    @Test(priority = 18)
    public void OfferJobForCandidate() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login();
        DashboardPage dashboardPage= new DashboardPage(driver);
        dashboardPage.gotoRecruitmentPage();
        RecruitmentPage recruitmentPage = new RecruitmentPage(driver);
        recruitmentPage.SearchForCandidates()
                .clickOnEyeICON()
                .MakeOffer()
                .verify_JobOffered_Status();
    }
    @Test(priority = 19)
    public void HireCandidate() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login();
        DashboardPage dashboardPage= new DashboardPage(driver);
        dashboardPage.gotoRecruitmentPage();
        RecruitmentPage recruitmentPage = new RecruitmentPage(driver);
        recruitmentPage.SearchForCandidates()
                .clickOnEyeICON()
                .HiringCandidate()
                .verify_Hired_Status();
    }
    @Test(priority = 20)
    public void DeleteCurrentCandidate() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login();
        DashboardPage dashboardPage= new DashboardPage(driver);
        dashboardPage.gotoRecruitmentPage();
        RecruitmentPage recruitmentPage = new RecruitmentPage(driver);
        recruitmentPage.DeleteCandidate();
    }
    @Test(priority = 21)
    public void RejectCandidate() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login();
        DashboardPage dashboardPage= new DashboardPage(driver);
        dashboardPage.gotoRecruitmentPage();
        RecruitmentPage recruitmentPage = new RecruitmentPage(driver);
        recruitmentPage.addCandidate()
                .SearchForCandidates()
                .clickOnEyeICON()
                .RejectCandidate()
                .verify_Reject_Status()
                .DeleteCandidate();

    }
    @Test(priority = 22)
    public void MakeInterviewFailed() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login();
        DashboardPage dashboardPage= new DashboardPage(driver);
        dashboardPage.gotoRecruitmentPage();
        RecruitmentPage recruitmentPage = new RecruitmentPage(driver);
        recruitmentPage.addCandidate()
                .SearchForCandidates()
                .clickOnEyeICON()
                .AddToShortList()
                .ScheduleInterview()
                .verify_InterviewScheduled_Status()
                .MarkInterviewFailed()
                .verify_InterviewFailed_Status()
                .DeleteCandidate();
    }
    @Test(priority = 23)
    public void CancelingOfferForCandidate() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login();
        DashboardPage dashboardPage= new DashboardPage(driver);
        dashboardPage.gotoRecruitmentPage();
        RecruitmentPage recruitmentPage = new RecruitmentPage(driver);
        recruitmentPage.addCandidate()
                .SearchForCandidates()
                .clickOnEyeICON()
                .AddToShortList()
                .ScheduleInterview()
                .MarkInterviewPassed()
                .MakeOffer()
                .cancelingOffer();
    }

    @Test(priority = 24)
    public void CreateVacancy() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login();
        DashboardPage dashboardPage= new DashboardPage(driver);
        dashboardPage.gotoRecruitmentPage();
        RecruitmentPage recruitmentPage = new RecruitmentPage(driver);
        recruitmentPage.addVacancy();
    }

    @Test(priority = 25)
    public void CloseVacancy() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login();
        DashboardPage dashboardPage= new DashboardPage(driver);
        dashboardPage.gotoRecruitmentPage();
        RecruitmentPage recruitmentPage = new RecruitmentPage(driver);
        recruitmentPage.closeTheVacancy()
                .verifyClosingVacancy();
    }
    @Test(priority = 26)
    public void DeleteTheClosedVacancy() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load()
                .login();
        DashboardPage dashboardPage= new DashboardPage(driver);
        dashboardPage.gotoRecruitmentPage();
        RecruitmentPage recruitmentPage = new RecruitmentPage(driver);
        recruitmentPage.DeleteTheClosedVacancy();
    }





}
