package HomeModlue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericUtility.UtilityMethod;
import GenericUtility.BaseClass;
import GenericUtility.UtilityMethod;

public class TC_ID extends GenericUtility.BaseClass{
	@Test
	public void TestCaseDescription() throws IOException, InterruptedException {
		WebElement email = driver.findElement(By.id("Email"));
		WebElement password = driver.findElement(By.id("Password"));
		WebElement login = driver.findElement(By.xpath("//input[@value='Log in']"));
		
		UtilityMethod.ActionsUtility(driver).sendKeys(email, "hello").perform();
		UtilityMethod.ActionsUtility(driver).sendKeys(password,"password").perform();
		UtilityMethod.ActionsUtility(driver).click(login).perform();
		/*
		 * JavaScriptExcecutorUtility.EnteringDataToELementsUsingJavaScript(email,
		 * "hcsm166");
		 * JavaScriptExcecutorUtility.EnteringDataToELementsUsingJavaScript(password,
		 * "demo1223234");
		 * JavaScriptExcecutorUtility.clickingOnELementUsingJavaScript(login);
		 */	}
	

}
