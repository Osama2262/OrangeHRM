package Pages;

import Base.BasePage;
import Utils.DataFaker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class PIM_Page extends BasePage {

    public PIM_Page(WebDriver driver) {
        super(driver);
    }

    public static String StorageUsername;


    //todo  << Locators >>
    By Add_employeeTab = By.xpath("//nav[@aria-label=\"Topbar Menu\"] //*[contains(text(),'Add Employee') ]");
    By employeeList = By.xpath("//nav[@aria-label=\"Topbar Menu\"] //*[contains(text(),'Employee List') ]");
    By save_button = By.xpath("//button[contains(.,'Save')]");
    By search_button = By.xpath("//button[contains(@type,'submit')]");
    By Trash_button = By.xpath("//i[@class=\"oxd-icon bi-trash\"]");
    By conf_delete = By.xpath("//button[contains(.,' Yes, Delete ')]");
    By firstName = By.xpath("//input[@name=\"firstName\"]");
    By middleName = By.xpath("//input[@name=\"middleName\"]");
    By lastName = By.xpath("//input[@name=\"lastName\"]");
    By employee_Id= By.xpath(" //div[@class=\"oxd-input-group oxd-input-field-bottom-space\"] //input[@class=\"oxd-input oxd-input--active\"]");
    By employeeName =By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\" and contains(.,'Employee Name') ] //input");
    By Edit_button = By.xpath("//i[@class=\"oxd-icon bi-pencil-fill\"]");
    By recordFound = By.xpath("//span[contains(.,'(1) Record Found')]");
    By jobSidBar = By.xpath("//a[contains(.,'Job')]");
    By jobDetails_JoinDate = By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\" and contains(.,'Joined Date')] //input");
    By jobDetails_JobCategory = By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\" and contains(.,'Job Category')] //div[@class=\"oxd-select-text-input\"]");
    By jobDetails_employeeStatus = By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\" and contains(.,'Employment Status')] //div[@class=\"oxd-select-text-input\"]");
    By jobDetails_JobTitle = By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\" and contains(.,'Job Title')] //div[@class=\"oxd-select-text-input\"]");
    By jobDetails_subUnit = By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\" and contains(.,'Sub Unit')] //div[@class=\"oxd-select-text-input\"]");
    By jobDetails_Location =By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\" and contains(.,'Location')] //div[@class=\"oxd-select-text-input\"]");
    By Edit_Layout = By.xpath("//div[@class=\"orangehrm-edit-employee-content\"]");
    By automatonTesterValue = By.xpath("//*[contains(text(), 'Automaton Tester')]");
    By techniciansValue = By.xpath("//*[contains(text(), 'Technicians')]");
    By full_Time_Contract = By.xpath("//*[contains(text(), 'Full-Time Contract')]");
    By quality_Assurance = By.xpath("//*[contains(text(), 'Quality Assurance')]");
    By new_York_Sales_Office = By.xpath("//*[contains(text(), 'New York Sales Office')]");
    By jobTitleAfterChange =By.xpath("//div[@class=\"oxd-table-row oxd-table-row--with-border oxd-table-row--clickable\"] //*[contains(text(),'Automaton Tester')]");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    //todo:Dynamic xpath
    By dynamicLocation = By.xpath("//*[contains(text(), '"+
           AdminPage.LocationStorage +
           "')]") ;


    public PIM_Page goToEmployeeList_tab()
    {
        driver.findElement(employeeList).click();
        return this;
    }
    public PIM_Page goToAddEmployee_tab(){
        driver.findElement(Add_employeeTab).click();
        return this;
    }

    public PIM_Page FillEmployeeInfo() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        String Firstname = DataFaker.getFirstName();
        driver.findElement(firstName).sendKeys(Firstname);
        Thread.sleep(500);
        String MiddleName = DataFaker.getMiddleName();
        driver.findElement(middleName).sendKeys(MiddleName);
        StorageUsername = Firstname + " " + MiddleName;
        Thread.sleep(500);
        driver.findElement(lastName).sendKeys(DataFaker.getLastName());
        Thread.sleep(500);
        driver.findElement(employee_Id).sendKeys(DataFaker.getId());
        WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(save_button));
        saveButton.click();
        return this;
    }

    public PIM_Page SearchForEmployee() throws InterruptedException {
        driver.findElement(employeeName).sendKeys(StorageUsername);
        Thread.sleep(2000);
        driver.findElement(search_button).click();
        return this;
    }

    public PIM_Page AssignEmployeeToJob() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(Edit_button).click();
        driver.findElement(jobSidBar).click();
        Thread.sleep(600);
        driver.findElement(jobDetails_JoinDate).sendKeys("2022-01-05");
        driver.findElement(jobDetails_JobTitle).click();
        driver.findElement(automatonTesterValue).click();
        Thread.sleep(600);
        driver.findElement(jobDetails_JobCategory).click();
        driver.findElement(techniciansValue).click();
        Thread.sleep(600);
        driver.findElement(jobDetails_employeeStatus).click();
        driver.findElement(full_Time_Contract).click();
        Thread.sleep(600);
        driver.findElement(jobDetails_subUnit).click();
        driver.findElement(quality_Assurance).click();
        Thread.sleep(600);
        driver.findElement(jobDetails_Location).click();
        driver.findElement(new_York_Sales_Office).click();
        Thread.sleep(1000);
        driver.findElement(save_button).click();
        return this;
    }

    public void ChangeLocationValue() throws InterruptedException {
        driver.findElement(Edit_button).click();
        driver.findElement(jobSidBar).click();
        Thread.sleep(2000);
        driver.findElement(jobDetails_Location).click();
        driver.findElement(dynamicLocation).click();
        Thread.sleep(1500);
        driver.findElement(save_button).click();
    }
    public void DeleteEmployee() throws InterruptedException {
        driver.findElement(employeeName).sendKeys(StorageUsername);
        wait.until(ExpectedConditions.elementToBeClickable(search_button)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(Trash_button)).click();
        wait.until(ExpectedConditions.elementToBeClickable(conf_delete)).click();
        Thread.sleep(1200);
    }



    //todo << Assertion >>
    public void VerifyThatUserAreCreated()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Edit_Layout)));
        boolean isVisible = driver.findElement(Edit_Layout).isDisplayed();
        Assert.assertTrue(isVisible);
    }
    public void verifyAssigningEmployeeToJob() throws InterruptedException {
        Thread.sleep(2000);
        boolean isDisplayed = driver.findElement(jobTitleAfterChange).isDisplayed();
        Assert.assertTrue(isDisplayed);
    }
    public void verifySearchingForEmployee()
    {
        Assert.assertTrue(driver.findElement(recordFound).isDisplayed());
    }
}
