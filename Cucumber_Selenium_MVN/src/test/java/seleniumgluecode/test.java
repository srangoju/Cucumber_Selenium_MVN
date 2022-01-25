package seleniumgluecode;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test {
    public static WebDriver driver;
    
    @Given("user is on homepage")
    public void user_is_on_homepage() {
    	System.setProperty("webdriver.chrome.driver","F:\\BrowserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }
    
    @When("^user enters \"(.*)\"$")
    public void user_enters_items_in_searchbox(String itemname) throws Throwable {
        driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).sendKeys(itemname);
    }
    @Then("^entered item should be displayed$")
    public void entered_item_should_be_displayed() {
    	String exp_message = "Brocolli - 1 Kg";
    	String actual = driver.findElement(By.cssSelector("#root > div > div.products-wrapper > div > div > h4")).getText();
        Assert.assertEquals(exp_message, actual);
    }
    
   
   @When("^user clicks on add to cart$")
   public void user_clicks_on_add_to_cart() throws Throwable {
       driver.findElement(By.xpath("//button[normalize-space()='ADD TO CART']")).click();
   }
   
  @Then("^item should be added to cart$")
   public void item_should_be_added_to_cart() throws Throwable {
   	String exp_message = "[[✔ ]]ADDED";
   	String actual = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[3]/button")).getText();
       Assert.assertEquals(exp_message, actual);
       driver.quit();  
   }      
}