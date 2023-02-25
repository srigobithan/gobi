package com.invicta.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeImportPage {
	
//User Name
	@FindBy(id = "usernameOrEmail")
	public static WebElement Username;
	
//password
	@FindBy(id = "password")
	public static WebElement Password;
	
//Login Button
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div/div[3]/div/div/span/button")
	public static WebElement LoginButton;
	
//Master card
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div/div[1]/a/div")
	public static WebElement master;
	
/** Employee Navigation --> Employee **/
	
	//Top Navigation Bar Employee Button
//	@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href=\"#/master/employeelevel\"]")
//	public static WebElement NavEmployee;
	
	//Left Employee Button
//	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[3]")
//	public static WebElement LeftEmployee;
	
	//Import Button
//	@FindBy(xpath = "//div[@class=\"ant-upload ant-upload-select ant-upload-select-text\"]")
//	public static WebElement ImportButton;
	
	//Export Button
//	@FindBy(xpath = "//div/button[@class=\"ant-btn ant-btn-primary ant-btn-round sc-gZMcBi dMdnOw\"]")
//	public static WebElement ExportButton;
	
	
/** Material Navigation --> Material**/
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div")
	public static WebElement SuccessMSG;
		
	//Top Navigation Bar Material Button
	//a[@class=\"sc-bdVaJa ieeiNp active\"][@href=\"#/master/materiallevel\"]
		@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/header/ul/li[3]/span/a")
		public static WebElement NavMaterial ;
	
	//Left Material Button
	//a[@class=\"sc-bdVaJa ieeiNp active\"][@href=\"#/master/materiallevel\"]
		@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[5]")
		public static WebElement LeftMaterial ;
	
	//Import Button
	//div[@class=\"ant-upload ant-upload-select ant-upload-select-text\"]/span/button[@class=\"ant-btn ant-btn-primary ant-btn-round sc-gZMcBi dMdnOw\"]
		@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div[4]/span/div/span/button")
		public static WebElement MaterialImportButton;
	
	//Export Button
		@FindBy(xpath = "//div[@class=\"ant-col ant-col-3\"]/button[@class=\"ant-btn ant-btn-primary ant-btn-round sc-gZMcBi dMdnOw\"]")
		public static WebElement MaterialExportButton;
	
/*Material SBU Filter*/
	//SBU Filter ICON
		@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div/div[2]/div[1]/table/thead/tr/th[9]/div/span[2]")
		public static WebElement SBUIcon;
		
	//SBU Filter ICON
		@FindBy(xpath = "//input[@name=\"subBusinessUnitName\"]")
		public static WebElement SBUFilterInput;
		
	//SBU Search Button
		@FindBy(xpath = "//button[@class=\"ant-btn ant-btn-primary ant-btn-sm\"]")
		public static WebElement SBUSearchButton;
		
	//SBU Search Button
		@FindBy(xpath = "//button[@class=\"ant-btn ant-btn-danger ant-btn-background-ghost\"]")
		public static WebElement SBUSearchResetAllButton;
		
/*Material Plant Filter*/	
	//SBU Filter ICON
			@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div/div[2]/div[1]/table/thead/tr/th[5]/div/span[2]")
			public static WebElement PlantIcon;
			
		//SBU Filter ICON
			@FindBy(xpath = "//*[@name=\"plantName\"]")
			public static WebElement PlantFilterInput;
			
		//SBU Search Button
			@FindBy(xpath = "/html/body/div[4]/div/div/div/div/div/button[1]")
			public static WebElement PlantSearchButton;

/** Customer Navigation --> Delivery **/
	
//Top Navigation Bar Customer Button
	//a[@class=\"sc-bdVaJa ieeiNp active\"][@href=\"#/master/customerlevel\"]
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/header/ul/li[4]/span/a")
	public static WebElement NavCustomer;
		
//Left Delivery Button
	//div[@class=\"ant-col ant-col-3\"]/div/div[@class=\"sc-gzVnrw flBzTM\"]
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[3]")
	public static WebElement LeftDelivery;
	

	
	
/** Customer --> Delivery --> Pagination**/
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/header/a[2]/div")
	public static WebElement NavHomeButton;
	
	@FindBy(xpath = "//li[@class='ant-pagination-total-text']")
	public static WebElement totalText;
	
	@FindBy(xpath = "//ul[@class='ant-pagination mini ant-table-pagination ant-table-pagination-right']/li/div")
	public static WebElement CurrentPaginationOpction;
	
	@FindBy(xpath = "//li[@title='1']/a")
	public static WebElement PageNumber;
	
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[1]")
	public static List<WebElement> UnitColumn;
	
	@FindBy(xpath = "//li[@title='Next Page']/button")
	public static WebElement NextPageBtn;
	
	@FindBy(xpath = "//li[@title='Previous Page']/button")
	public static WebElement PreviousPageBtn;
	
	@FindBy(xpath = "//li[@title='1'][@class='ant-pagination-item ant-pagination-item-1 ant-pagination-item-active']")
	public static WebElement DefaultPaginationPage;
	
	@FindBy(xpath = "//li[@title='2'][@class='ant-pagination-item ant-pagination-item-2 ant-pagination-item-active']")
	public static WebElement PaginationSecoundPage;
	
	@FindBy(xpath = "//*[@class='ant-select-item ant-select-item-option'][@title='20 / page']")
	public static WebElement Page_20;
	
	@FindBy(xpath = "//*[@class='ant-select-item ant-select-item-option'][@title='30 / page']")
	public static WebElement Page_30;
	
	@FindBy(xpath = "//*[@class='ant-select-item ant-select-item-option'][@title='100 / page']")
	public static WebElement Page_100;
	
	@FindBy(xpath = "//ul[@class='ant-pagination mini ant-table-pagination ant-table-pagination-right']")
	public static WebElement pagination;
	
	
	
/** Logout Button **/
	//LogoutAdminButton
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/header/ul/div/div[2]/div/div/span")
	public static WebElement logoutAdmin;
		
	//LogoutButton
	@FindBy(xpath = "/html/body/div[2]/div/div/ul/li[5]")
	public static WebElement logoutButton;

	public List<WebElement> findElements(By tagName) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
