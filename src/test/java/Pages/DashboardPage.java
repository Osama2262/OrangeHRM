package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {
    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    By admin_page = By.xpath("//a[contains(.,'Admin')]");
    By PIM_page = By.xpath("//a[contains(.,'PIM')]");
    By Recruitment_page = By.xpath("//a[contains(.,'Recruitment')]");

    public void gotoAdminPage()
    {
        driver.findElement(admin_page).click();
    }
    public void gotoPIMPage()
    {
        driver.findElement(PIM_page).click();
    }
    public void gotoRecruitmentPage()
    {
        driver.findElement(Recruitment_page).click();
    }



}
