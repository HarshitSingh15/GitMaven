package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	
	public static String browser = "chrome";
	//public static ChromeDriver driver; // it is better to use a super reference like parent
	// below line webdriver is parent of all driver class 
	//changing driver at run time is part of run time polymorphism
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(browser.equals("chrome")){
		WebDriverManager.chromedriver().setup(); // this keeps updated chromeversion in the maven dependency
		driver = new ChromeDriver();
		driver.manage().window().maximize(); /*this is called method chaining. manage returns
    some class, and that class has window method, now window returns something and maximize
    is method within that class. this is method chaining.
    */
    String title = "https://www.way2automation.com";
		driver.get(title);
		System.out.println(driver.getTitle());
		System.out.println(title.length());
		

	}
		else if(browser.equals("firefox")){
			WebDriverManager.chromedriver().setup(); // this keeps updated chromeversion in the maven dependency
		 driver = new FirefoxDriver();
	    String title = "https://www.way2automation.com";
			driver.get(title);
			System.out.println(driver.getTitle());
			System.out.println(title.length());
				
		}
	}
}

