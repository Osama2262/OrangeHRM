package Pages;

import Base.BasePage;
import Utils.DataFaker;
import Utils.StaticData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class AdminPage extends BasePage {
    public AdminPage(WebDriver driver) {
        super(driver);
    }

    //todo  << Locators >>
    By username = By.xpath("//div[@class=\"oxd-form-row\"] //input[@class=\"oxd-input oxd-input--active\"]");
    By userRole =By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\" and contains(.,'User Role') ] //div[@class=\"oxd-select-wrapper\"] ");
    By EmployeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By Status = By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\" and contains(.,'Status') ] //div[@class=\"oxd-select-wrapper\"]  ");
    By Search_button = By.xpath("//button[contains(.,'Search')]");
    By Add_button = By.xpath("//button[contains(.,'Add')]");
    By Trash_button = By.xpath("//i[@class=\"oxd-icon bi-trash\"]");
    By Edit_button = By.xpath("//i[@class=\"oxd-icon bi-pencil-fill\"]");
    By Select_admin = By.xpath("//*[contains(text(), 'Admin')]");

    By Enable_value = By.xpath("//*[contains(text(), 'Enabled')]");
    By Disable_value = By.xpath("//*[contains(text(), 'Disabled')]");
    By password = By.xpath(" //input[@type='password'] [1]");
    By conf_password = By.xpath("//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"and contains(.,'Confirm Password')] //input");
    By save_button = By.xpath("//button[contains(.,'Save')]");
    By recordFound = By.xpath("//span[contains(.,'(1) Record Found')]");
    By assertDelete = By.xpath("//span[contains(.,'No Records Found')]");
    By conf_delete = By.xpath("//button[contains(.,' Yes, Delete ')]");
    By job_tab = By.xpath("//li[@class=\"oxd-topbar-body-nav-tab --parent\" and contains(.,'Job ') ]");
    By organization_tab = By.xpath("//li[@class=\"oxd-topbar-body-nav-tab --parent\" and contains(.,'Organization') ]");
    By location_org = By.xpath("//a[contains(.,'Locations')]");
    By jobTitle = By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"] //input[@class=\"oxd-input oxd-input--active\"]");
    By joTitleTab = By.xpath(" //a[contains(.,'Job Titles')]");
    By jobDescription =By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"] //textarea[@placeholder=\"Type description here\"]");
    By location_Name_f = By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\" and contains(.,'Name') ] //input[@class=\"oxd-input oxd-input--active\"]");
    By location_City_f = By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\" and contains(.,'City') ] //input[@class=\"oxd-input oxd-input--active\"]");
    By location_zipcode_f =By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\" and contains(.,'Zip/Postal Code') ] //input[@class=\"oxd-input oxd-input--active\"]");
    By location_Phone_f = By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\" and contains(.,'Phone') ] //input[@class=\"oxd-input oxd-input--active\"]");
    By location_Country = By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\" and contains(.,'Country') ] //div[@class=\"oxd-select-text oxd-select-text--active\"]");
    By egypt_value = By.xpath("//*[contains(text(), 'Egypt')]");
    By LocationField =By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"and contains(.,'Name') ] //input");
    By NumberOfEmployees = By.xpath("//div[@class=\"oxd-table-cell oxd-padding-cell\"][6]");
    By employeeNameValue =By.xpath("//*[contains(text(), 'Charles  Carter')]");

    public static String usernameStorage;
    public static String jobTitleStorage;
    public static String LocationStorage;

    //todo:Dynamic xpath
    By dynamicDeleteXPath =By.xpath("//div[@class='orangehrm-container']//div[@class='oxd-table-row oxd-table-row--with-border' and contains(.,'"
            + jobTitleStorage
            + "')]//div[@class='oxd-table-cell-actions']//i[@class='oxd-icon bi-trash']");

    By dynamicEditXPath = By.xpath("//div[@class='orangehrm-container']//div[@class='oxd-table-row oxd-table-row--with-border' and contains(.,'"
            + jobTitleStorage
            + "')]//div[@class='oxd-table-cell-actions']//i[@class='oxd-icon bi-pencil-fill']");



    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    public AdminPage gotoLocation_tab()
    {
        driver.findElement(organization_tab).click();
        driver.findElement(location_org).click();
        return this;
    }

    public void AddNewUser() throws InterruptedException {
        driver.findElement(Add_button).click();
        driver.findElement(Status).click();
        driver.findElement(Enable_value).click();
        Thread.sleep(500);
        driver.findElement(userRole).click();
        driver.findElement(Select_admin).click();
        Thread.sleep(500);
        driver.findElement(EmployeeName).sendKeys("Charles");
        wait.until(ExpectedConditions.elementToBeClickable(employeeNameValue)).click();
        usernameStorage = DataFaker.getUsername();
        Thread.sleep(500);
        driver.findElement(username).sendKeys(usernameStorage);
        Thread.sleep(500);
        driver.findElement(password).sendKeys(DataFaker.getPassword());
        Thread.sleep(500);
        driver.findElement(conf_password).sendKeys(DataFaker.getPassword());
        wait.until(ExpectedConditions.elementToBeClickable(save_button)).click();
        Thread.sleep(2000);
    }



    public AdminPage SearchForUser() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(username).sendKeys(usernameStorage);
        Thread.sleep(500);
        driver.findElement(userRole).click();
        driver.findElement(Select_admin).click();
        Thread.sleep(500);
        driver.findElement(EmployeeName).sendKeys("Charles");
        wait.until(ExpectedConditions.visibilityOfElementLocated(employeeNameValue)).click();
        Thread.sleep(500);
        driver.findElement(Status).click();
        driver.findElement(Enable_value).click();
        driver.findElement(Search_button).click();
        Thread.sleep(2000);
        return this;
    }


    public AdminPage DeleteUserOrEmployee() throws InterruptedException {
        driver.findElement(username).sendKeys(usernameStorage);
        wait.until(ExpectedConditions.elementToBeClickable(Search_button)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(Trash_button)).click();
        wait.until(ExpectedConditions.elementToBeClickable(conf_delete)).click();
        Thread.sleep(1200);
        return this;
    }


    public void EditUser() throws InterruptedException {
        driver.findElement(username).sendKeys(usernameStorage);
        driver.findElement(Search_button).click();
        Thread.sleep(2000);
        driver.findElement(Edit_button).click();
        driver.findElement(Status).click();
        driver.findElement(Disable_value).click();
        driver.findElement(save_button).click();
        Thread.sleep(2000);
        driver.findElement(username).sendKeys(usernameStorage);
        driver.findElement(Search_button).click();
        boolean isDisable = driver.findElement(Disable_value).isDisplayed();
        Assert.assertTrue(isDisable);

    }
    public AdminPage AddNewJob() throws  InterruptedException {
        driver.findElement(job_tab).click();
        driver.findElement(joTitleTab).click();
        driver.findElement(Add_button).click();
        jobTitleStorage = DataFaker.getJobName();
        Thread.sleep(500);
        driver.findElement(jobTitle).sendKeys(jobTitleStorage);
        driver.findElement(save_button).click();
        Thread.sleep(2000);
        return this;
    }
    public void EditJob() throws InterruptedException {
        driver.findElement(job_tab).click();
        driver.findElement(joTitleTab).click();
        driver.findElement(dynamicEditXPath).click();
        driver.findElement(jobDescription).click();
        driver.findElement(jobDescription).sendKeys(StaticData.getLoremIpsumMessage());
        Thread.sleep(1300);
        driver.findElement(save_button).click();
        Thread.sleep(1200);

    }
    public void DeleteJob() throws InterruptedException {
        driver.findElement(job_tab).click();
        driver.findElement(joTitleTab).click();
        driver.findElement(dynamicDeleteXPath).click();
        driver.findElement(conf_delete).click();
        Thread.sleep(2000);
    }
    public AdminPage createNewOrganizationLocation() throws InterruptedException {
        driver.findElement(Add_button).click();
        LocationStorage = DataFaker.getJobName();
        Thread.sleep(500);
        driver.findElement(location_Name_f).sendKeys(LocationStorage);
        Thread.sleep(500);
        driver.findElement(location_City_f).sendKeys(DataFaker.getCity());
        Thread.sleep(600);
        driver.findElement(location_zipcode_f).sendKeys(DataFaker.getZipcode());
        Thread.sleep(600);
        driver.findElement(location_Phone_f).sendKeys(DataFaker.getPhone());
        Thread.sleep(600);
        driver.findElement(location_Country).click();
        driver.findElement(egypt_value).click();
        Thread.sleep(600);
        driver.findElement(save_button).click();
       return this;
    }

    public void SearchingAndAssertForLocation() throws InterruptedException {
        driver.findElement(LocationField).sendKeys(LocationStorage);
        driver.findElement(Search_button).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(NumberOfEmployees).getText(),"1" );
    }


    //Todo >> Assertion <<
    public void verifyCreatingOrg()
    {
        wait.until(ExpectedConditions.urlToBe(StaticData.getViewLocationsURL()));
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals(currentURL,StaticData.getViewLocationsURL());
    }
    public void verifyDelete()
    {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(assertDelete)));
        boolean isDeleted = driver.findElement(assertDelete).isDisplayed();
        Assert.assertTrue(isDeleted);
    }
    public void verifySearchingResult()
    {
        boolean searching_result = driver.findElement(recordFound).isDisplayed();
        Assert.assertTrue(searching_result);
    }
    public void verifyCurrentURL()
    {
        wait.until(ExpectedConditions.urlToBe(StaticData.getViewJobTitleListURL()));
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals(currentURL,StaticData.getViewJobTitleListURL());
    }

}
