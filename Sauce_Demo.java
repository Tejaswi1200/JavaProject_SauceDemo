package sauce_Demo;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sauce_Demo {

	public static void main(String[] args) throws InterruptedException {
		Select s;
		System.setProperty("webdriver.chrome.driver", "D:\\Edubridge\\Automation Testing\\Browser Extension\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//URL
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		//username
		String usn=JOptionPane.showInputDialog("Enter User Name");
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(usn);
		Thread.sleep(2000);
		
		//password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		//login Button
		driver.findElement(By.cssSelector("input[name='login-button']")).click();
		Thread.sleep(2000);
		
		//dropdown filter name(A - Z)
		s=new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
		Thread.sleep(2000);
		
		//Step 2. Select option
		s.selectByIndex(0);// Always starts with 0th index
		Thread.sleep(2000);
		
		//DropDown name(Z-A)
		s=new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
		Thread.sleep(2000);
		
		//Step 2. Select option
		s.selectByIndex(1);
		Thread.sleep(2000);
		
		//DropDown Price(low-high)
		s=new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
		Thread.sleep(2000);
				
		//Step 2. Select option
		s.selectByValue("lohi");
		Thread.sleep(2000);
		
		//DropDown Price(low-high)
		s=new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
		Thread.sleep(2000);
						
		//Step 2. Select option
		s.selectByVisibleText("Price (high to low)");
		Thread.sleep(2000);
		
		//dropdown filter name(A - Z)
		s=new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
		Thread.sleep(2000);
				
		//Step 2. Select option
		s.selectByIndex(0);
		Thread.sleep(2000);
		
		//Scroll down
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		
		//Adding product to cart
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
		Thread.sleep(2000);
		
		//Scroll to top
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(2000);
		
		//Click on Cart
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		Thread.sleep(2000);
		
		//Continue Shopping
		driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]")).click();
		Thread.sleep(2000);
		
		//Add to cart second product
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		Thread.sleep(2000);
		
		//Checkout
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		
		//FirstName, Lastname andZip/Postalcode
		driver.findElement(By.id("first-name")).sendKeys("Samwi");
		Thread.sleep(2000);
		driver.findElement(By.id("last-name")).sendKeys("Kandi");
		Thread.sleep(2000);
		driver.findElement(By.id("postal-code")).sendKeys("412587");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		Thread.sleep(2000);
		
		//Scroll Down
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		//finish
		driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
		Thread.sleep(2000);
		
		//Back to home
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		Thread.sleep(2000);
		
				
		//three-lines
		driver.findElement(By.cssSelector("button[id='react-burger-menu-btn']")).click();
		Thread.sleep(2000);
	
				
		//logout
		driver.findElement(By.cssSelector("a[id='logout_sidebar_link']")).click();
				
		driver.close();



	
	}

}
