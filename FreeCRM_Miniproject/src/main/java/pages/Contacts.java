package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.ExcelUtility;

public class Contacts {
	WebDriver driver;
    WebDriverWait wait;
    

    public Contacts(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//span[text()='Contacts']") WebElement contact; 
    @FindBy(xpath="(//button[@class='ui linkedin button'])[4]") WebElement create;
    @FindBy(name="first_name")
    WebElement firstName;

    @FindBy(name="middle_name")
    WebElement middleName;

    @FindBy(name="last_name")
    WebElement lastName;

    @FindBy(name="company")
    WebElement company;

    @FindBy(xpath="//input[@placeholder='Email address']")
    WebElement email;

    @FindBy(name="description")
    WebElement description;

    @FindBy(xpath="//input[@placeholder='Twitter handle']")
    WebElement twitterHandle;

    @FindBy(xpath="(//input[@name='name'])[2]")
    WebElement streetAddress;

    @FindBy(xpath="//input[@placeholder='City']")
    WebElement city;

    @FindBy(xpath="//input[@placeholder='State / County']")
    WebElement stateCounty;

    @FindBy(xpath="//input[@placeholder='Post Code']")
    WebElement postCode;

    @FindBy(xpath="//input[@placeholder='Number']")
    WebElement phoneNumber;

    @FindBy(xpath="//input[@name='position']")
    WebElement position;

    @FindBy(name="department")
    WebElement department;

    @FindBy(xpath="//input[@name='identifier']")
    WebElement identifier;
    @FindBy(xpath="//input[@name='do_not_call']/parent::div")
    WebElement donotcall;

    @FindBy(xpath="//input[@name='do_not_email']/parent::div")
    WebElement donotemail;

    @FindBy(xpath="//input[@name='do_not_text']/parent::div")
    WebElement donottext;
    
    
    

    

    @FindBy(xpath="//button[contains(text(),'Save')]")
    WebElement saveButton;
    public void clickcontact() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;

    	js.executeScript("arguments[0].style.backgroundColor='green';", contact);
    
        wait.until(ExpectedConditions.elementToBeClickable(contact)).click();
        wait.until(ExpectedConditions.visibilityOf(create));
    }
    public void createcontacts()
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;

    	js.executeScript("arguments[0].style.backgroundColor='green';", create);
    	wait.until(ExpectedConditions.elementToBeClickable(create)).click();
       
    }
    public void highlightElement(WebElement element, String color)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor='" + color + "';", element);
    }
    public void toggleIfNotSelected(WebElement element)
    {
        if(!element.isSelected())
        {
            element.click();
        }
    }
    public void addContactFromExcel() throws Exception
    {

    	highlightElement(firstName,"yellow");
        firstName.sendKeys(ExcelUtility.getCellData("Contacts",1,0));
        highlightElement(firstName,"lightgreen");

        highlightElement(middleName,"yellow");
        middleName.sendKeys(ExcelUtility.getCellData("Contacts",1,1));
        highlightElement(middleName,"lightgreen");

        highlightElement(lastName,"yellow");
        lastName.sendKeys(ExcelUtility.getCellData("Contacts",1,2));
        highlightElement(lastName,"lightgreen");

//        highlightElement(company,"yellow");
//        company.sendKeys(ExcelUtility.getCellData("Contacts",1,3));
//        highlightElement(company,"lightgreen");

        highlightElement(email,"yellow");
        email.sendKeys(ExcelUtility.getCellData("Contacts",1,4));
        highlightElement(email,"lightgreen");

        highlightElement(description,"yellow");
        description.sendKeys(ExcelUtility.getCellData("Contacts",1,5));
        highlightElement(description,"lightgreen");

        highlightElement(twitterHandle,"yellow");
        twitterHandle.sendKeys(ExcelUtility.getCellData("Contacts",1,6));
        highlightElement(twitterHandle,"lightgreen");

        highlightElement(streetAddress,"yellow");
        streetAddress.sendKeys(ExcelUtility.getCellData("Contacts",1,7));
        highlightElement(streetAddress,"lightgreen");

        highlightElement(city,"yellow");
        city.sendKeys(ExcelUtility.getCellData("Contacts",1,8));
        highlightElement(city,"lightgreen");

        highlightElement(stateCounty,"yellow");
        stateCounty.sendKeys(ExcelUtility.getCellData("Contacts",1,9));
        highlightElement(stateCounty,"lightgreen");

        highlightElement(postCode,"yellow");
        postCode.sendKeys(ExcelUtility.getCellData("Contacts",1,10));
        highlightElement(postCode,"lightgreen");

        highlightElement(phoneNumber,"yellow");
        phoneNumber.sendKeys(ExcelUtility.getCellData("Contacts",1,11));
        highlightElement(phoneNumber,"lightgreen");

        highlightElement(position,"yellow");
        position.sendKeys(ExcelUtility.getCellData("Contacts",1,12));
        highlightElement(position,"lightgreen");

        highlightElement(department,"yellow");
        department.sendKeys(ExcelUtility.getCellData("Contacts",1,13));
        highlightElement(department,"lightgreen");

        highlightElement(identifier,"yellow");
        identifier.sendKeys(ExcelUtility.getCellData("Contacts",1,14));
        highlightElement(identifier,"lightgreen");
        toggleIfNotSelected(donotcall);
        toggleIfNotSelected(donotemail);
        toggleIfNotSelected(donottext);
        

        highlightElement(saveButton,"green");
        saveButton.click();

    }
  
}
