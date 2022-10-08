import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pages.Loginpage;
import pages.Roomspage;

public class VerifyRoomsPage {

	private WebDriver driver;
	private Loginpage loginpage;
	private Roomspage roompage;
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void openRoomPage() {
		System.out.println("Before Method");
		driver.get("https://www.facebook.com/");
		
	}
}
