package util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import util.ActionUtility;

public class ActionUtility {
	
	    WebDriver driver;
	    ActionUtility action;

	    public ActionUtility(WebDriver driver)
	    {
	        this.driver = driver;
	        PageFactory.initElements(driver,this);
	        action = new ActionUtility(driver);
	    }
	}


