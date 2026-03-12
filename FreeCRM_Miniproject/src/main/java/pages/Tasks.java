package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.ExcelUtility;

public class Tasks {
	WebDriver driver;

    public Tasks(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//a[@href='/tasks']")
	WebElement taskbutton;

	@FindBy(xpath="//button[contains(text(),'Create')]")
	WebElement create;
	@FindBy(xpath="//input[@name='title']")
	WebElement title;

	@FindBy(xpath="//textarea[@name='description']")
	WebElement description;

	@FindBy(xpath="//input[@name='completion']")
	WebElement completion;

	@FindBy(xpath="//input[@name='identifier']")
	WebElement identifier;

	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement saveButton;
	public void highlight(WebElement element, String color)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor='" + color + "';", element);
    }
	public void taskbutton() throws Exception
	{
		Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor='green'", taskbutton);

        taskbutton.click();
	}

	public void createbutton() throws Exception
	{
		 Thread.sleep(2000);

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].style.backgroundColor='green'", create);

	        create.click();	}

	public void addTaskFromExcel() throws Exception
	{

		highlight(title,"yellow");
		title.sendKeys(ExcelUtility.getCellData("Tasks",1,0));
		highlight(title,"lightgreen");

		highlight(description,"yellow");
		description.sendKeys(ExcelUtility.getCellData("Tasks",1,1));
		highlight(description,"lightgreen");

		highlight(completion,"yellow");
		completion.sendKeys(ExcelUtility.getCellData("Tasks",1,2));
		highlight(completion,"lightgreen");

		highlight(identifier,"yellow");
		identifier.sendKeys(ExcelUtility.getCellData("Tasks",1,3));
		highlight(identifier,"lightgreen");

		highlight(saveButton,"green");
		saveButton.click();

	}



}
