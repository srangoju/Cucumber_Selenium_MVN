package seleniumgluecode;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class test {
    public static WebDriver driver;
    @Given("^user is on homepage$")
    public void user_is_on_homepage() throws Throwable {     
    	System.setProperty("webdriver.chrome.driver","C:/Users/X013810/Desktop/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }
    
    @When("^user enters item name$")
    public void user_enters_items_in_searchbox() throws Throwable {
        driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).sendKeys("Cucumber");
    }
    
   @Then("^entered item should be displayed$")
    public void selected_item_is_displayed() throws Throwable {
    	String exp_message = "Cucumber - 1 Kg";
    	String actual = driver.findElement(By.cssSelector("h4[class='product-name']")).getText();
        Assert.assertEquals(exp_message, actual);
        driver.quit();  
    }      
}