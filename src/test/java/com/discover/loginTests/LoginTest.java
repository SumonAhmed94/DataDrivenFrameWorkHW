package com.discover.loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.discover.base.BaseTest;
import com.discover.loginPages.LoginPage;
import com.discoverUtilities.ExcelReader;

public class LoginTest extends BaseTest {
	LoginPage lp;
	ExcelReader Reader;
	String file = "src/test/resources/discover.xlsx";
	String sheetName = "Sheet1";
	
	@BeforeMethod
	public void opendiscoverApp() {
		openApp();
	}
	@Test
		public void LoginTest1() {
		lp=new LoginPage(driver);
		lp.creditcardsMethod();
		lp.applycardsMethod();
		Reader = new ExcelReader(file, sheetName);
		lp.zipMethod(Reader.getStringCellValue(0, 1));
	
		
		
	
	}
		//@AfterMethod
		public void closediscoverApp() {
			closeApp();
}
}