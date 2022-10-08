package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Messengerpage {

	@FindBy (xpath = "//a[text()='Rooms']")
	private WebElement room;
	
	@FindBy (xpath = "//a[text()='Features']")
	private WebElement Features;
	
	@FindBy (xpath = "//a[text()='Desktop app']")
	private WebElement deskapp;
	
	@FindBy (xpath = "(//button[@type='submit'])[1]")
	private WebElement button1;
	
	@FindBy (xpath = "//a[text()='Privacy and safety']")
	private WebElement privacy;
	
	@FindBy (xpath = "//a[text()='For developers']")
	private WebElement developers;
	
	public Messengerpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void openrooms() {
		room.click();
	}
	
	public void opendesktoapp() {
		deskapp.click();
	}
	
	public void openaccount() {
	    button1.click();
	}
	
	public void openprivacy() {
		privacy.click();
	}
	
	public void openfordevelopers() {
		developers.click();
	}
}
