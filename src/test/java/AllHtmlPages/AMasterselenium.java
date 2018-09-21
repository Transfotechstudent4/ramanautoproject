 package AllHtmlPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AMasterselenium 
{
		public static WebDriver driver;
		
		public static void OpenBrowserAndNavigateToApplication()
		{
			 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver");
			 driver = new ChromeDriver();
			 driver.get("https://www.demo.iscripts.com/multicart/demo/");
		}			
		public static void ClickWebElement(String xpath)
		{
			 driver.findElement(By.xpath(xpath)).click();
		}
		public static void SetTextOnWebElement(String xpath, String value)
		{
			 driver.findElement(By.xpath(xpath)).sendKeys(value);
		}
		public static boolean validateTextOfaElement(String expElemt, String expValue)
		{
			 //String registered_user_name;
			 String ActualValuefromElement =  driver.findElement(By.xpath(expElemt)).getText();
			 
			 if(ActualValuefromElement.equalsIgnoreCase(expValue))
			 {
				return true;
			 }
			 else
			 {
				return false;
			 }
		}
	
		public static void DriverwaitFiveSecond()
		{
			try
			{
				Thread.sleep(5000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			}
		}

