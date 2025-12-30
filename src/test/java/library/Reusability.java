package library;
import java.io.File;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class Reusability {
	
	public static void capturedScreenShot(WebDriver driver , String screenshotName) {
		
		try {
		
			   TakesScreenshot ts = (TakesScreenshot)driver ;
			   File source = ts.getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(source, new File("./ScreenShots/" +screenshotName + ".png"));
			   System.out.println("Screenshot Captured");
			
		}catch (Exception e){
			
			System.out.println("Exeption While Taking Screenshot");
			
		}
	}
}