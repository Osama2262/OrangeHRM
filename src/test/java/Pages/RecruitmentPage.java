package Pages;

import Base.BasePage;
import Utils.DataFaker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class RecruitmentPage extends BasePage {

    public RecruitmentPage(WebDriver driver) {
        super(driver);
    }

    By Add_button = By.xpath("//button[contains(.,'Add')]");
    By Search_button = By.xpath("//button[contains(.,' Search ')]");
    By save_button = By.xpath("//button[contains(.,'Save')]");
    By eye_icon = By.xpath("//i[@class='oxd-icon bi-eye-fill']");
    By Edit_button = By.xpath("//i[@class=\"oxd-icon bi-pencil-fill\"]");
    By Trash_button = By.xpath("//i[@class=\"oxd-icon bi-trash\"]");
    By Active_switch = By.xpath("//div[@class=\"oxd-grid-item oxd-grid-item--gutters orangerhrm-switch-wrapper\" and contains(.,'Active')]//div[@class=\"oxd-switch-wrapper\"]");
    By conf_delete = By.xpath("//button[contains(.,' Yes, Delete ')]");
    By shortList_button =By.xpath("//button[contains(.,' Shortlist ')]");
    By reject_button = By.xpath("//button[contains(.,' Reject ')]");
    By OfferJob_button =By.xpath("//button[contains(.,' Offer Job ')]");
    By ScheduleInterview_button = By.xpath("//button[contains(.,' Schedule Interview ')]");
    By MarkInterviewPassed_button = By.xpath("//button[contains(.,' Mark Interview Passed ')]");
    By MarkInterviewFailed_button = By.xpath("//button[contains(.,' Mark Interview Failed ')]");
    By OfferDeclined_button = By.xpath("//button[contains(.,' Offer Declined ')]");
    By Hire_button =By.xpath("//button[contains(.,' Hire ')]");
    By Status = By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\" and contains(.,'Status') ] //div[@class=\"oxd-select-wrapper\"]  ");
    By CandidateName= By.xpath("//input[@placeholder='Type for hints...']");
    By Vacancy = By.xpath("//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"and contains(.,'Vacancy')] //div[@class=\"oxd-select-text oxd-select-text--active\"]");
    By Vacancies_tab =By.xpath("//a[contains(.,'Vacancies')]");
    By chiefExecutiveOfficer = By.xpath("//*[contains(text(), 'Chief Executive Officer')]");
    By HiringManager = By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\" and contains(.,'Hiring Manager')] //input");
    By HiringManager_select = By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\" and contains(.,'Hiring Manager')] //div[@class=\"oxd-select-text oxd-select-text--active\"]");
    By HiringManager_Value =By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\" and contains(.,'Hiring Manager') ] //*[contains(text(), 'Charles  Carter')]");
    By HiringManagerSelectValue = By.xpath("//div[@role= 'listbox'] //*[contains(text(),'Charles  Carter' )]");
    By Active_value = By.xpath("//*[contains(text(), 'Active')]");
    By Closed_value =By.xpath("//*[contains(text(), 'Closed')]");
    By Candidates_tab = By.xpath("//a[contains(.,'Candidates')]");
    By JobTitle = By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\" and contains(.,'Job Title') ] //div[@class=\"oxd-select-text oxd-select-text--active\"]");
    By InterviewTitle =By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\" and contains(.,'Interview Title')] //input");
    By Interviewer = By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\" and contains(.,'Interviewer')] //input");
    By InterviewerNameValue =By.xpath("//*[contains(text(), 'Charles  Carter')]");
    By Date = By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\" and contains(.,'Date')] //input");
    By firstName = By.xpath("//input[@name=\"firstName\"]");
    By middleName = By.xpath("//input[@name=\"middleName\"]");
    By lastName = By.xpath("//input[@name=\"lastName\"]");
    By Email = By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\" and contains(.,'Email')] //input");
    By VacancyName = By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\" and contains(.,'Vacancy Name')] //input");
    By PayrollAdministrator = By.xpath("//*[contains(text(), 'Payroll Administrator')]");
    By recordFound = By.xpath("//span[contains(.,'(1) Record Found')]");
    By Shortlisted_Status =By.xpath("//p[contains(.,'Status: Shortlisted')]");
    By InterviewScheduled_Status = By.xpath("//p[contains(.,'Status: Interview Scheduled')]");
    By Reject_Status = By.xpath("//p[contains(.,'Status: Rejected')]");
    By InterviewPassed_Status =By.xpath("//p[contains(.,'Status: Interview Passed')]");
    By JobOffered_Status =By.xpath("//p[contains(.,'Status: Job Offered')]");
    By InterviewFailed_Status =By.xpath("//p[contains(.,'Status: Interview Failed')]");
    By Hired_Status =By.xpath("//p[contains(.,'Status: Hired')]");
    By close_value =By.xpath("//div[@class=\"oxd-table-cell oxd-padding-cell\"][5] //div[contains(.,'Closed')]");
    private static String Firstname;
    private static String NameofCandidate;

    //todo:Dynamic xpath
    private By getDynamicCandidateName() {
        return By.xpath(" //div[@role= 'listbox'] //*[contains(text(), \"" + NameofCandidate + "\")]");
    }


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    public RecruitmentPage clickOnEyeICON()
    {
        driver.findElement(eye_icon).click();
        return this;
    }
    public RecruitmentPage addCandidate() throws InterruptedException {
        driver.findElement(Add_button).click();
        Firstname = DataFaker.getFirstName();
        driver.findElement(firstName).sendKeys(Firstname);
        Thread.sleep(600);
        String middleName1 = DataFaker.getMiddleName();
        driver.findElement(middleName).sendKeys(middleName1);
        Thread.sleep(600);
        String lastName1 = DataFaker.getLastName();
        driver.findElement(lastName).sendKeys(lastName1);
        NameofCandidate = Firstname + " " + middleName1 + " " + lastName1;
        Thread.sleep(600);
        wait.until(ExpectedConditions.elementToBeClickable(Vacancy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(PayrollAdministrator)).click();
        driver.findElement(Email).sendKeys("admin@example.com");
        WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(save_button));
        saveButton.click();
        driver.findElement(Candidates_tab).click();
        return this;
    }
    public RecruitmentPage SearchForCandidates() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(Vacancy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(PayrollAdministrator)).click();
        driver.findElement(CandidateName).sendKeys(Firstname);
        wait.until(ExpectedConditions.elementToBeClickable(getDynamicCandidateName())).click();
        wait.until(ExpectedConditions.elementToBeClickable(Search_button)).click();
        Thread.sleep(2000);
        return this;
    }

    public RecruitmentPage RejectCandidate() throws InterruptedException {
        Thread.sleep(1500);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(reject_button))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(save_button))).click();
        Thread.sleep(2000);
        return this;
    }
    public RecruitmentPage AddToShortList() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(shortList_button))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(save_button))).click();
        Thread.sleep(2000);
        return this;
    }
    public RecruitmentPage ScheduleInterview () throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(ScheduleInterview_button))).click();
        Thread.sleep(500);
        driver.findElement(InterviewTitle).sendKeys("Preparing");
        Thread.sleep(500);
        driver.findElement(Interviewer).sendKeys("Charles");
        Thread.sleep(500);
        driver.findElement(InterviewerNameValue).click();
        driver.findElement(Date).sendKeys("2022-02-06");
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(save_button))).click();
        Thread.sleep(2000);
        return this;
    }
    public RecruitmentPage MarkInterviewPassed() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(MarkInterviewPassed_button))).click();
        Thread.sleep(2000);
        driver.findElement(save_button).click();
        return this;
    }
    public RecruitmentPage MarkInterviewFailed() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(MarkInterviewFailed_button))).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(save_button)).click();
        return this;
    }
    public RecruitmentPage MakeOffer() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(OfferJob_button))).click();
        Thread.sleep(2000);
        driver.findElement(save_button).click();
        Thread.sleep(2000);
        return this;
    }
    public void cancelingOffer() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(OfferDeclined_button))).click();
        Thread.sleep(2000);
        driver.findElement(save_button).click();
        Thread.sleep(2000);

    }
    public RecruitmentPage HiringCandidate() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Hire_button))).click();
        Thread.sleep(2000);
        driver.findElement(save_button).click();
        Thread.sleep(2000);
        return this;
    }
    public void DeleteCandidate() throws InterruptedException {
        driver.findElement(Candidates_tab).click();
        SearchForCandidates();
        Thread.sleep(500);
        wait.until(ExpectedConditions.elementToBeClickable(Trash_button)).click();
        wait.until(ExpectedConditions.elementToBeClickable(conf_delete)).click();
        Thread.sleep(3000);
    }

    private static String VacName;

    //todo: DynamicXpath
    private By getDynamicVacName() {
        return By.xpath(" //div[@role= 'listbox'] //*[contains(text(), \"" + VacName + "\")]");
    }
    private By getClosedVacancy()
    {
        return By.xpath("//div[@role= 'listbox']//*[contains(text(), \"" + VacName + " (Closed)\")]");
    }

    //TODO >> Vacancy Page <<
    public void addVacancy() throws InterruptedException {
        driver.findElement(Vacancies_tab).click();
        Thread.sleep(500);
        driver.findElement(Add_button).click();
        VacName = DataFaker.getVacancy();
        Thread.sleep(600);
        driver.findElement(VacancyName).sendKeys(VacName);
        Thread.sleep(600);
        driver.findElement(JobTitle).click();
        driver.findElement(chiefExecutiveOfficer).click();
        Thread.sleep(500);
        driver.findElement(HiringManager).sendKeys("Charles");
        driver.findElement(HiringManager_Value).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(save_button)).click();
        Thread.sleep(2000);
    }
    public void SearchForVacancies() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(JobTitle).click();
        driver.findElement(chiefExecutiveOfficer).click();
        Thread.sleep(500);
        wait.until(ExpectedConditions.elementToBeClickable(Vacancy)).click();
        System.out.println(getDynamicVacName());
        Thread.sleep(500);
        driver.findElement(getDynamicVacName()).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(Status)).click();
        driver.findElement(Active_value).click();
        Thread.sleep(500);
        wait.until(ExpectedConditions.elementToBeClickable(Search_button)).click();
        Thread.sleep(1500);
    }
    public RecruitmentPage closeTheVacancy() throws InterruptedException {
        driver.findElement(Vacancies_tab).click();
        Thread.sleep(500);
        SearchForVacancies();
        wait.until(ExpectedConditions.elementToBeClickable(Edit_button)).click();
        wait.until(ExpectedConditions.elementToBeClickable(Active_switch)).click();
        Thread.sleep(500);
        wait.until(ExpectedConditions.elementToBeClickable(save_button)).click();
        Thread.sleep(3000);
        driver.findElement(Vacancies_tab).click();
        Thread.sleep(1200);
        wait.until(ExpectedConditions.elementToBeClickable(JobTitle)).click();
        driver.findElement(chiefExecutiveOfficer).click();
        Thread.sleep(500);
        wait.until(ExpectedConditions.elementToBeClickable(Vacancy)).click();
        System.out.println(getClosedVacancy());
        Thread.sleep(500);
        driver.findElement(getClosedVacancy()).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(Status)).click();
        driver.findElement(Closed_value).click();
        Thread.sleep(500);
        wait.until(ExpectedConditions.elementToBeClickable(Search_button)).click();
        Thread.sleep(1300);
        return this;
    }




    //TODO >> Assertions <<
    public void verifySearchingForCandidate()
    {
        Assert.assertTrue(driver.findElement(recordFound).isDisplayed());
    }
    public RecruitmentPage verify_Reject_Status()
    {
        Assert.assertTrue(driver.findElement(Reject_Status).isDisplayed());
        return this;
    }
    public void verify_Shortlist_Status()
    {
        Assert.assertTrue(driver.findElement(Shortlisted_Status).isDisplayed());
    }
    public RecruitmentPage verify_InterviewScheduled_Status()
    {
        Assert.assertTrue(driver.findElement(InterviewScheduled_Status).isDisplayed());
        return this;
    }
    public void verify_InterviewPassed_Status()
    {
        Assert.assertTrue(driver.findElement(InterviewPassed_Status).isDisplayed());
    }
    public void verify_JobOffered_Status()
    {
        Assert.assertTrue(driver.findElement(JobOffered_Status).isDisplayed());
    }
    public RecruitmentPage verify_InterviewFailed_Status()
    {
        Assert.assertTrue(driver.findElement(InterviewFailed_Status).isDisplayed());
        return this;
    }
    public void verify_Hired_Status()
    {
        Assert.assertTrue(driver.findElement(Hired_Status).isDisplayed());
    }
    public void verifyClosingVacancy()
    {
        Assert.assertTrue(driver.findElement(close_value).isDisplayed());
    }

}
