package com.w2a.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class LoginTest extends TestBase {

	@Test
	public void loginAsBankManager() throws InterruptedException{
		
		driver.findElement(By.xpath("//*[contains(text(),'Bank Manager Login')]")).click();
//		driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click(); 
		log.debug("clicked on button: "+OR.getProperty("bmlBtn"));
		Thread.sleep(3000);
		log.debug("Login Successfull");
	}

}
