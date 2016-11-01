package gurukulaQA.gurukulaTesting;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.Selenium;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.*;


public class Staff {

	public WebDriver driver;
	public WebElement login;
	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C://Users//HP1/git//gurukulaTesting//gurukulaTesting//chromedriver_win32//chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1:8080/#/");

		//LOGIN
		login = driver.findElement(By.linkText("login"));
		login.click();

		driver.findElement(By.id("username")).sendKeys("admin");	
		driver.findElement(By.id("password")).sendKeys("admin");				
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();


	}



	@Given("^The user press Entities menu$")
	public void navigate(){
		System.out.println("given");

		driver.findElement(By.xpath(".//span[text()='Entities']")).click();


		driver.findElement(By.xpath(".//span[text()='Branch']")).click();



	}

	@When ("^introduce Name mybranch$")
	public void lands_in_hotel_result(){
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
		driver.findElement(By.name("name")).sendKeys("mybranch");
		driver.findElement(By.name("code")).sendKeys("12");




	}

	@Then("^A branch has been created$")
	public void verifySuccessful(){

		driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-primary")).click();
	    //TODO include assert
	}

	@After
	public void tearDown() {
		driver.quit();
	} 

}
