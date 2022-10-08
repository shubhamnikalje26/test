import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Messengerpage;
import pages.Roomspage;

public class Testng {
	
	  
	private WebDriver driver;
	private Messengerpage mpage;
	private Roomspage rpage;
	

	@BeforeClass
	public void beforeclass() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.messenger.com/");
		mpage=new Messengerpage(driver);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("test start");
	}
	
	@Test(priority=0)
	public void verifyroombutton() {
		mpage.openrooms();
		rpage=new Roomspage(driver);
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.messenger.com/rooms", "url is correct");
//		boolean result = url.equals("https://www.messenger.com/rooms");
		
		if (url.equals("https://www.messenger.com/rooms"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
	
	@Test(priority=1)
	public void Verifyhelpbutton() {
		
		rpage.help();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		Assert.assertEquals(url, "https://www.messenger.com/help", "url is correct");
		Assert.assertEquals(title, "Messenger Help Centre");
//		boolean result = url.equals("https://www.messenger.com/rooms");
		
		if (url.equals("https://www.messenger.com/help") && title.equals("Messenger Help Centre"))
			
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
	}
	
	@Test(priority=2)
	public void testc()  {
		System.out.println("testC");
		
	}
	
	@Test(priority=3)
	public void testD() {
		System.out.println("testD");
		
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("test finish" );
	}
	
	@AfterClass
	public void Afterclass() {
		driver.close();
	}
}
