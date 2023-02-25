package com.invicta.qa.testcases;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.invicta.qa.base.Innitialization;
import com.invicta.qa.pages.EmployeeImportPage;

public class Testt extends Innitialization{
	
	static EmployeeImportPage Import = new EmployeeImportPage();
	
	static EmployeeImportTest UI = new EmployeeImportTest();
	
@Test
	public static void EmployeeImport() throws InterruptedException, AWTException, IOException {
		
		PageFactory.initElements(driver, Import);
		
		
		//Step1: Login 
			//UI.EmployeeImport();
		
/*		//Employee Import Button
			UI.EmployeeImportButton();
		
		//Employee Export Button
			UI.EmployeeExportButton();
			
		//Logout System
			UI.Logout();
*/
		
		//Step1: Login 
			UI.EmployeeImport();
			
		//Step2:Material Import Button
			UI.MaterialImportButton();
			/*			
		//Step5:Export CSV
			UI.ExportCSV();
		
		//Material SBU CSV File Export
			UI.MaterialSBUFilter();
			
		//MAterial Plant CSV File Export
			UI.MaterialPlantFilter();
	*/		
			//Step4:Import CSV
			UI.UploadCSV();
 /*		
		//Step3:Employee Export Button
			UI.MaterialExportButton();
			
		//Step4:Import CSV
			UI.UploadCSV();
		
			
			//UI.ImportCSV();
			
		//Step6:Delivery
			UI.DeliveryButton();
			
			//Pagination
				//Step7:Pagination page Visible
				UI.DefaultIndexPage();
				
				//Step8:Pagination Next page 
				UI.RefreshDefaultPage();
				
				//Step9:Pagination Click on 2nd page 
				UI.PageRedrict();
				
				//Step10:Click on Previous page
				UI.PreButtonDispaly();
				
				//Step11:Next Button Page visible
				UI.NextButtonDispaly();
				
				//Step12:Next Button Enable
				UI.NextButtonEanble();
				
				//Step13:PAGINATION-PREVIOUS-BUTTON-DISABLE-BEFORE MOVE THE 2ND PAGE
				UI.SecPagepreButDisable();
				
				//Step14:After move to 2nd page, previous button Enable
				UI.AfterMovetoSecPagepreButEnable();
				
				//Step15:Page select
				UI.TotalPage();
 */
		
	}

	
}
