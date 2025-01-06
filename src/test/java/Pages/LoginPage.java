package Pages;

import Base.BasePage;
import Utils.StaticData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By username = By.name("username");
    private final By password = By.name("password");
    private final By login_button = By.cssSelector("[type=\"submit\"]");

    public LoginPage load()
    {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        return this;
    }

    public void login()
    {
        driver.findElement(username).sendKeys(StaticData.getDEFAULT_user());
        driver.findElement(password).sendKeys(StaticData.getDEFAULT_pass());
        driver.findElement(login_button).click();
    }

}
