package HomeModule;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.UtilityMethod;

public class Selecting extends BaseClass{
	@Test
	public void demo() throws InterruptedException, IOException {
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		UtilityMethod method=new UtilityMethod();
		method.SelectUtility(dropdown, "1");
		Thread.sleep(2000);
		//ScreenshotUtility.takingScreenshot("myscreenshot");


	}
}

