package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import resources.Base;
public class FlightPage extends Base {

    private WebDriver driver;
    private String successLoginText ="Signed in!";
    private By loginControlText= By.id("flash_notice");

    public FlightPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public WebElement lgnControlText()
    {
        return driver.findElement(loginControlText);
    }
    public String controlLogin()
    {
        return lgnControlText().getText();
    }

    public boolean checkLoginFunction()
    {
       if(controlLogin().equalsIgnoreCase(successLoginText))
           return true;
       else
           return false;
    }


}
