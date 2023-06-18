package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethords {
public static WebDriver driver;//without public it will be defult modifiyer
	
	public static void setup() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	public static void navigateURL() {
		driver.get("http://it.microtechlimited.com/");
	}
	public static void click(By a) {//without String,int datatype that time we can use (By a)333 
		driver.findElement(a).click();
		//public static void click(String a) {//when datatype String then we use this way
		//driver.findElement(By.xpath(xpath)).click();
	}
	
	public static void sendkeys(String xpath,String value) {//we write send keys this way
		
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
		
	  public static String getElementText(String v ) {
	  
	  WebElement element = driver.findElement(By.xpath(v));
	  String s = element.getText(); 
	  return s;}
	 
	
	


public static void tearDown() {
driver.quit();
}

}
