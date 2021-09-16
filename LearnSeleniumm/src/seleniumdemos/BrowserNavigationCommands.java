package seleniumdemos;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class BrowserNavigationCommands {

		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Seleniumsoftware09082021\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Register")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
			driver.navigate().forward();
			Thread.sleep(3000);
			driver.navigate().to("http://demowebshop.tricentis.com/register");
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			driver.close();


		}

	}