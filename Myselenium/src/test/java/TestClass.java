import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Loginpage;
import pages.Messengerpage;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");


		 WebDriver driver = new ChromeDriver();  
		
		
		Loginpage loginpage = new Loginpage(driver);
		
		driver.get("https://www.facebook.com/");
		
		loginpage.LoginToApplication("8080824914", "9850901734");
		
		if(loginpage.checkpassworddisplayed()==true)
		{
			System.out.println("password is displayed");
		}
		else
		{
			System.out.println("password is not displayed");
		}
		 
	
		
//		Messengerpage mpage = new Messengerpage(driver);
		driver.get("https://www.messenger.com/rooms");
		loginpage.backtomessenger();
	}

}
