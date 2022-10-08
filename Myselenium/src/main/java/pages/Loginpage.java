package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {

	private WebDriver driver;
	private Actions act;
	private WebDriverWait wait;
	
	//declaration
	@FindBy (xpath = "//input[@id='email']") 
	private WebElement username;
	
	@FindBy (xpath = "//input[@id='pass']") 
	private WebElement password;
	
	@FindBy (xpath = "//button[text()='Log in']") 
	private WebElement loginButton;
	
	@FindBy (xpath = "//a[text()=' Return to messenger.com ']") 
	private WebElement backtomessnger;
	
	@FindBy (xpath = "//a[text()='Create New Account']") 
	private WebElement createnewaccount;
	
	//initialization of web eleemnt
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		act = new Actions(driver);
	}
	
	//use
	/*
	 * public void sendusername(String uname) { username.sendKeys(uname); }
	 * 
	 * public void sendpassword(String pass) { password.sendKeys(pass); }
	 * 
	 * public void submit() { loginButton.click(); }
	 */
	
	public void LoginToApplication(String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginButton.click();
	}
	
	public void backtomessenger() {
		backtomessnger.click();
	}
	
	public void createaccount() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(createnewaccount));
		act.moveToElement(createnewaccount).click().build().perform();
	}
	
	public boolean checkpassworddisplayed() {
		return password.isDisplayed();
	}
}
