package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.ExcelUtility;

public class Deals {

    WebDriver driver;

    public Deals(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//a[@href='/deals']")
    WebElement dealsMenu;

    @FindBy(xpath="//button[contains(text(),'Create')]")
    WebElement createDeal;
 // Deal form fields (TEXTBOXES)
    @FindBy(xpath="//input[@name='title']")
    WebElement dTitle;

    @FindBy(xpath="//textarea[@name='description']")
    WebElement dDesc;

    @FindBy(xpath="//input[@name='probability']")
    WebElement dProb;

    @FindBy(xpath="//input[@name='amount']")
    WebElement dAmount;

    @FindBy(xpath="//input[@name='commission']")
    WebElement dCom;

    @FindBy(xpath="//textarea[@name='next_step']")
    WebElement dnxtSteps;

    @FindBy(xpath="//input[@name='identifier']")
    WebElement dIdentifier;
    @FindBy(xpath="//button[@class='ui linkedin button']")
    WebElement save;
    public void clickDealsMenu() throws Exception
    {
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor='green'", dealsMenu);

        dealsMenu.click();
    }

    public void clickCreateDeal() throws Exception
    {
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor='green'", createDeal);

        createDeal.click();
    }
    public void highlightElement(WebElement element,String color)
    {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.backgroundColor='"+color+"';", element);
    }
    public void addDealFromExcel() throws Exception
    {

        highlightElement(dTitle,"yellow");
        dTitle.sendKeys(ExcelUtility.getCellData("Deals",1,0));
        highlightElement(dTitle,"lightgreen");

        highlightElement(dDesc,"yellow");
        dDesc.sendKeys(ExcelUtility.getCellData("Deals",1,1));
        highlightElement(dDesc,"lightgreen");

        highlightElement(dProb,"yellow");
        dProb.sendKeys(ExcelUtility.getCellData("Deals",1,2));
        highlightElement(dProb,"lightgreen");

        highlightElement(dAmount,"yellow");
        dAmount.sendKeys(ExcelUtility.getCellData("Deals",1,3));
        highlightElement(dAmount,"lightgreen");

        highlightElement(dCom,"yellow");
        dCom.sendKeys(ExcelUtility.getCellData("Deals",1,4));
        highlightElement(dCom,"lightgreen");

        highlightElement(dnxtSteps,"yellow");
        dnxtSteps.sendKeys(ExcelUtility.getCellData("Deals",1,5));
        highlightElement(dnxtSteps,"lightgreen");

        highlightElement(dIdentifier,"yellow");
        dIdentifier.sendKeys(ExcelUtility.getCellData("Deals",1,6));
        highlightElement(dIdentifier,"lightgreen");
        highlightElement(save,"green");
        save.click();

    }
}