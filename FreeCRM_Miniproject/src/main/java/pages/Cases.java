package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.ExcelUtility;

public class Cases {
	 WebDriver driver;

	    public Cases(WebDriver driver)
	    {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath="//a[@href='/cases']")
	    WebElement caseMenu;

	    @FindBy(xpath="//button[contains(text(),'Create')]")
	    WebElement createcase;
	    @FindBy(xpath="//input[@name='title']")
	    WebElement title;

	    @FindBy(xpath="(//input[contains(@class,'calendarField')])[1]")
	    WebElement deadline;

	    @FindBy(xpath="(//input[contains(@class,'calendarField')])[2]")
	    WebElement closeDate;

	    @FindBy(xpath="//textarea[@name='description']")
	    WebElement description;

	    @FindBy(xpath="//input[@name='identifier']")
	    WebElement identifier;
	    @FindBy(xpath="//button[@class='ui linkedin button']")
	    WebElement save;
	    public void clickcasesMenu() throws Exception
	    {
	        Thread.sleep(2000);

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].style.backgroundColor='green'", caseMenu);

	        caseMenu.click();
	    }

	    public void clickCreatecases() throws Exception
	    {
	        Thread.sleep(2000);

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].style.backgroundColor='green'", createcase);

	        createcase.click();
	    }
	    public void highlight(WebElement element,String color)
	    {
	        JavascriptExecutor js=(JavascriptExecutor)driver;
	        js.executeScript("arguments[0].style.backgroundColor='"+color+"';", element);
	    }
	    public void addCaseFromExcel() throws Exception
	    {

	        highlight(title,"yellow");
	        title.sendKeys(ExcelUtility.getCellData("Cases",1,0));
	        highlight(title,"lightgreen");

	        highlight(deadline,"yellow");
	        deadline.sendKeys(ExcelUtility.getCellData("Cases",1,1));
	        highlight(deadline,"lightgreen");

	        highlight(closeDate,"yellow");
	        closeDate.sendKeys(ExcelUtility.getCellData("Cases",1,2));
	        highlight(closeDate,"lightgreen");

	        highlight(description,"yellow");
	        description.sendKeys(ExcelUtility.getCellData("Cases",1,3));
	        highlight(description,"lightgreen");

	        highlight(identifier,"yellow");
	        identifier.sendKeys(ExcelUtility.getCellData("Cases",1,4));
	        highlight(identifier,"lightgreen");

	        highlight(save,"green");
	        save.click();
	    }

}
