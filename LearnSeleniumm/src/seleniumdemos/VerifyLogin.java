package seleniumdemos;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log=Logger.getLogger(VerifyLogin.class);
		PropertyConfigurator.configure("log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumsoftware09082021\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		log.info("Launch Browser");
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		String expectedtitle="Demo Web Shop. Login";
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		if(expectedtitle.equals(actualtitle))
		{

		System.out.println("You are on correct page");
		driver.findElement(By.id("Email")).sendKeys("Kavyayathapu@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Kavya@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
		}
		else
		{
		System.out.println("You are on wrong page");
		driver.close();
		}
	}
	}
	

