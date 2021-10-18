package pageobjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import resources.Base;

public class LoginPage extends Base {

    private WebDriver driver;
    private String pageUrl ="https://travel.agileway.net/login";
    private By alertElement= By.id("flash_alert");
    private By username = By.id("username");
    private By password = By.id("password");
    private By loginBtn = By.cssSelector("[value*='Sign']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public WebElement getAlertMessage()
    {
        return driver.findElement(alertElement);
    }

    public WebElement getUsername() {

        return driver.findElement(username);
    }

    public WebElement getPassword() {
        return driver.findElement(password);
    }

    public WebElement loginButton() {
        return driver.findElement(loginBtn);
    }

    public boolean checkIfLoginPageIsOpen() {
        if(driver.getCurrentUrl().equalsIgnoreCase(pageUrl))
            return true;
        else {
            return false;
        }
    }
    public boolean checkWrongLoginCridentials()
    {
        if(getAlertMessage().isDisplayed())
            return true;
        else {
            return false;
        }
    }


}
