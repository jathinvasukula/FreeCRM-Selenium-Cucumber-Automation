package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.ExcelUtility;

public class Companies {
	
	WebDriver driver;
	public Companies(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy (xpath="//a[@href='/companies']") WebElement combutton;
	@FindBy (xpath="(//button[@class='ui linkedin button'])[3]") WebElement create;
	@FindBy (xpath="(//input[@name='name'])[1]") WebElement cname;
	@FindBy(xpath="(//input[@name='url'])[1]") WebElement cwebsite;
	@FindBy(xpath="(//input[@placeholder='Street Address'])[1]") WebElement caddress;
	@FindBy(xpath="(//input[@placeholder='City'])[1]") WebElement ccity;
	@FindBy(xpath="(//input[@placeholder='State / County'])[1]") WebElement cstate;
	@FindBy(xpath="(//input[@placeholder='Post Code'])[1]") WebElement cpostcode;
	@FindBy(xpath="(//input[@placeholder='Number'])") WebElement cnumber;
	@FindBy(xpath="	(//input[@placeholder='Home, Work, Mobile...'])") WebElement cphonetype;		
	//@FindBy(xpath="//div[@name='country']//i[@class='dropdown icon']") WebElement ccounty;
	@FindBy(xpath="//input[@placeholder='Email address']") WebElement cmail;
	@FindBy(xpath="(//div[@class='ui active visible fluid multiple search selection dropdown'])[1]") WebElement ctag;
	@FindBy(xpath="//input[@placeholder='Twitter handle']") WebElement ctwitter;
	@FindBy(xpath="//input[@name='num_employees']") WebElement cnoofEmp;
	@FindBy(xpath="//input[@name='annual_revenue']") WebElement cAnRevenue;
	@FindBy(xpath="//div[@name='status']//i[@class='dropdown icon']") WebElement cstatus;
	@FindBy(xpath="(//i[@class='dropdown icon'])[8]") WebElement ccategory;
	@FindBy(xpath="//input[@name='identifier']") WebElement cidentifier;
	@FindBy(xpath="//textarea[@name='description']") WebElement cdescription;
	@FindBy(xpath="//input[@name='industry']") WebElement cindustry;
	@FindBy(xpath="//input[@name='symbol']") WebElement cstocksym;
	@FindBy(xpath="//div[@name='priority']//i[@class='dropdown icon']") WebElement cpriority;
	@FindBy(xpath=" //div[@name='source']//i[@class='dropdown icon']") WebElement csource;
	@FindBy(xpath=" //input[@name='vat_number']") WebElement cvatno;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement saveButton;
	
	
	public void highlightElement(WebElement element, String color)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor='" + color + "';", element);
    }
	public void combutton() throws Exception
	{
		Thread.sleep(3000);
    	WebElement comp=driver.findElement(By.xpath("//a[@href='/companies']"));
    	comp.click();
	}
	public void createbutton() throws InterruptedException
	{
		Thread.sleep(3000);
    	WebElement create=driver.findElement(By.xpath("(//button[@class='ui linkedin button'])[3]"));
    	create.click();
    	Thread.sleep(3000);
	}
	
	public void addCompanyFromExcel() throws Exception
	{
	    highlightElement(cname,"yellow");
	    cname.sendKeys(ExcelUtility.getCellData("companies",1,0));
	    highlightElement(cname,"lightgreen");

	    highlightElement(cwebsite,"yellow");
	    cwebsite.sendKeys(ExcelUtility.getCellData("companies",1,1));
	    highlightElement(cwebsite,"lightgreen");

	    highlightElement(caddress,"yellow");
	    caddress.sendKeys(ExcelUtility.getCellData("companies",1,2));
	    highlightElement(caddress,"lightgreen");

	    highlightElement(ccity,"yellow");
	    ccity.sendKeys(ExcelUtility.getCellData("companies",1,3));
	    highlightElement(ccity,"lightgreen");

	    highlightElement(cstate,"yellow");
	    cstate.sendKeys(ExcelUtility.getCellData("companies",1,4));
	    highlightElement(cstate,"lightgreen");

	    highlightElement(cpostcode,"yellow");
	    cpostcode.sendKeys(ExcelUtility.getCellData("companies",1,5));
	    highlightElement(cpostcode,"lightgreen");

	    highlightElement(cnumber,"yellow");
	    cnumber.sendKeys(ExcelUtility.getCellData("companies",1,7));
	    highlightElement(cnumber,"lightgreen");

	    highlightElement(cphonetype,"yellow");
	    cphonetype.sendKeys(ExcelUtility.getCellData("companies",1,8));
	    highlightElement(cphonetype,"lightgreen");

	    highlightElement(cmail,"yellow");
	    cmail.sendKeys(ExcelUtility.getCellData("companies",1,9));
	    highlightElement(cmail,"lightgreen");

	    highlightElement(cdescription,"yellow");
	    cdescription.sendKeys(ExcelUtility.getCellData("companies",1,17));
	    highlightElement(cdescription,"lightgreen");

	    highlightElement(ctwitter,"yellow");
	    ctwitter.sendKeys(ExcelUtility.getCellData("companies",1,11));
	    highlightElement(ctwitter,"lightgreen");

	    highlightElement(cnoofEmp,"yellow");
	    cnoofEmp.sendKeys(ExcelUtility.getCellData("companies",1,12));
	    highlightElement(cnoofEmp,"lightgreen");

	    highlightElement(cAnRevenue,"yellow");
	    cAnRevenue.sendKeys(ExcelUtility.getCellData("companies",1,13));
	    highlightElement(cAnRevenue,"lightgreen");

	    highlightElement(cidentifier,"yellow");
	    cidentifier.sendKeys(ExcelUtility.getCellData("companies",1,16));
	    highlightElement(cidentifier,"lightgreen");

	    highlightElement(cvatno,"yellow");
	    cvatno.sendKeys(ExcelUtility.getCellData("companies",1,22));
	    highlightElement(cvatno,"lightgreen");

	    highlightElement(saveButton,"green");
	    saveButton.click();
	}

}