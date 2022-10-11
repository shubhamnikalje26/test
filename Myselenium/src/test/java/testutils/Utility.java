package testutils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void capturescreenshot(WebDriver driver, int a)  throws IOException{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\asus\\Desktop\\temporary files\\test(a).jpg");
		
		FileHandler.copy(source,dest);
	}

}
