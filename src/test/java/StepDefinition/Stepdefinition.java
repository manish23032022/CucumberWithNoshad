package StepDefinition;

import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stepdefinition {
public WebDriver driver;

//@Given("launch the browser and navigate the appliaction with url {string}")
//public void launch_the_browser_and_navigate_the_appliaction_with_url(String url) {
//   driver=new ChromeDriver();
//   driver.get(url);
//   driver.manage().window().maximize();
//   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//}
//
//@Given("login application with user name {string} and password {string}")
//public void login_application_with_user_name_and_password(String user, String pass) {
//    driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
//    driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
//    driver.findElement(By.id("submitButton")).click();
//    
//    
//    
//}


@Given("launch the browser and navigate the appliaction with url {string}")
public void launch_the_browser_and_navigate_the_appliaction_with_url(String url) {
  driver=new ChromeDriver();
  driver.get(url);
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@Given("login application with user name {string} and password {string}")
public void login_application_with_user_name_and_password(String user, String pass) {
  driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(user);
  driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(pass);
  driver.findElement(By.id("submitButton")).click();
}


@Then("validate home page with {string}")
public void validate_home_page_with(String homepage) throws InterruptedException {
	
}

@Then("logout the application")
public void logout_the_application() throws InterruptedException {
	WebElement e=driver.findElement(By.xpath("//td[@onmouseover=\"fnDropDownUser(this,'ondemand_sub','~razamd260@gmail.com`');\"]"));
    Actions act=new Actions(driver);
    Thread.sleep(3000);
    act.moveToElement(e).perform();
	  Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
    driver.close();
}

/**
 * Organisation with handle dropdown
 */

@Then("Click on Organisation")
public void click_on_organisation() {
   System.out.println("click");
}

@Then("perform dropdown and select Billing city")
public void perform_dropdown_and_select_billing_city() {
	System.out.println("click2");
    
}

/**
 * Handle by dropdown of quickCreate
 */

@Then("Click on QuickCreate")
public void click_on_quick_create() {
    System.out.println("quickCreate122");
}

@Then("perform dropdown and select New Asset")
public void perform_dropdown_and_select_new_asset() {
	System.out.println("quickCreate1233");
	}   

}
