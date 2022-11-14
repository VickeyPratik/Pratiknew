package GenericUtility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShotUtility extends BaseClass implements IAutoConstants{
private static final String ERRORSHOTS = null;

public static void takingScreenshot(String screenshotName) throws IOException {
	TakesScreenshot screenshot=(TakesScreenshot) driver;
	File photo = screenshot.getScreenshotAs(OutputType.FILE);
	String ldt = LocalDateTime.now().toString().replace(':', '-');
	File dest=new File(ERRORSHOTS+screenshotName+" "+ldt+ ".png");
	FileUtils.copyFile(photo, dest);
}
}


