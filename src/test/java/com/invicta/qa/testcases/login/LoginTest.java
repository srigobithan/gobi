package com.invicta.qa.testcases.login;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.invicta.qa.base.Innitialization;

public class LoginTest extends Innitialization {
	static com.invicta.qa.pages.login.LoginPage loginpg = new com.invicta.qa.pages.login.LoginPage();

	@Test

	public static void Login() throws InterruptedException, IOException {
		
		PageFactory.initElements(driver, loginpg);

		SoftAssert sa = new SoftAssert();
		Thread.sleep(2000);
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\com\\invicta\\qa\\excel\\Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Login");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(0);

			String uName = (String) row.getCell(0).getStringCellValue();
			String pWord = (String) row.getCell(1).getStringCellValue();
			String expec = (String) row.getCell(2).getStringCellValue();

			com.invicta.qa.pages.login.LoginPage.Username.sendKeys(uName);
			com.invicta.qa.pages.login.LoginPage.Password.sendKeys(pWord);
			com.invicta.qa.pages.login.LoginPage.LoginButton.click();

			Thread.sleep(2500);
			String actualurl = driver.getCurrentUrl();
			System.out.println(actualurl);

			System.out.println(expec);

			sa.assertEquals(expec, actualurl);

		}

	}

}
