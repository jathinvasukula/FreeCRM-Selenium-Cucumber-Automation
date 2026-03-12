package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	WebDriver driver;

    public Logout(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//div[@class='ui basic button floating item dropdown']") WebElement settings;
    @FindBy(xpath="//i[@class='power icon']")
    WebElement logout;
    public void logoutFromApp()
    {
        Actions act = new Actions(driver);

        act.moveToElement(settings).click().perform();   // open dropdown
        act.moveToElement(logout).click().perform();         // click logout
    }

}
