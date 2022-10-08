package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Roomspage {
	
	

	@FindBy (xpath = "//a[text()=' Return to messenger.com ']")
	private WebElement returnmessage;
	
	@FindBy (xpath = "//a[text()=' Visit our help center ']")
	private WebElement help;
	
	public Roomspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String url() {
		String url = "https://www.messenger.com/rooms";
		return url;
	}
	
	public void backtomessenger()
	{
		returnmessage.click();
	}
	
	public void help() {
		help.click();
	}
}
