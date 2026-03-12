package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Cases;
import pages.Companies;
import pages.Contacts;
import pages.Deals;
import pages.LoginPage;
import pages.Logout;
import pages.Tasks;
import util.ConfigReader;
import util.DriverFactory;

public class FreeCRM {

    WebDriver driver;
    LoginPage lp;
    Contacts c;
    Companies cp;
    ConfigReader cr;
    Deals d;
    Tasks t;
    Cases cs;
    Logout l;

    @When("User clicks and add details into Contacts")
    public void user_clicks_and_add_details_into_contacts() throws Exception {

    	cr = new ConfigReader();

        driver = DriverFactory.initDriver(cr.getBrowser());

        driver.get(cr.getAppURL());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        lp = new LoginPage(driver);

        lp.login(cr.getUsername(), cr.getPassword());
        c=new Contacts(driver);
    	c.clickcontact();
    	c.createcontacts();
    	c.addContactFromExcel();
    }

    @When("User clicks and add details into companies")
    public void user_clicks_and_add_details_into_companies() throws Exception {
    	cp=new Companies(driver);
    	cp.combutton();
        cp.createbutton();
        cp.addCompanyFromExcel();    
    }
    @When("User clicks and add details into Deals")
    public void user_clicks_and_add_details_into_deals() throws Exception {

        Deals d = new Deals(driver);

        d.clickDealsMenu();
        d.clickCreateDeal();
        d.addDealFromExcel();
    }



    @When("User clicks and add details into Tasks")
    public void user_clicks_and_add_details_into_tasks() throws Exception {
    	 t=new Tasks(driver);
    	 t.taskbutton();
    	 t.createbutton();
    	 t.addTaskFromExcel();
    	}

       
   

    @When("User clicks and add details into cases")
    public void user_clicks_and_add_details_into_cases() throws Exception {

       cs= new Cases(driver);
       cs.clickcasesMenu();
       cs.clickCreatecases();
       cs.addCaseFromExcel();
    }

    @Then("Logout from the page")
    public void logout_from_the_page() {
    	l=new Logout(driver);
    	l.logoutFromApp();


    }
}