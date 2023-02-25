package com.invicta.qa.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.invicta.qa.base.Innitialization;
import com.invicta.qa.pages.EmployeeImportPage;
import com.opencsv.CSVReader;

public class EmployeeImportTest extends Innitialization {

	static EmployeeImportPage table = new EmployeeImportPage();

	@Test
	public static void EmployeeImport() throws InterruptedException {

		PageFactory.initElements(driver, table);
		// login
		EmployeeImportPage.Username.sendKeys("admin");
		EmployeeImportPage.Password.sendKeys("tokyo@admin");
		EmployeeImportPage.LoginButton.click();

		// Click on Master card
		Thread.sleep(4000);
		EmployeeImportPage.master.click();

		// Click on Navigation Employee Button
//			Thread.sleep(4000);
//			EmployeeImportPage.NavEmployee.click();

		// Click on Left Employee Button
//			Thread.sleep(3000);
//			EmployeeImportPage.LeftEmployee.click();

	}

	public static void Logout() throws InterruptedException {

		// Click on LogoutAdmin Button
		Thread.sleep(2000);
		EmployeeImportPage.logoutAdmin.click();

		// Click on Logout Button
		Thread.sleep(5000);
		EmployeeImportPage.logoutButton.click();
	}

//public static void join() throws InterruptedException {
//	
//	//Click on Master card
//		Thread.sleep(2000);
//		EmployeeImportPage.master.click();
//	
//	//Click on Navigation Employee Button
//		Thread.sleep(4000);
//		EmployeeImportPage.NavEmployee.click();
//}

	/** Employee --> Employee --> ImportButton **/
	/*
	 * @Test public void EmployeeImportButton() throws InterruptedException {
	 * 
	 * //Click on Master card Thread.sleep(2000); EmployeeImportPage.master.click();
	 * 
	 * //Click on Navigation Employee Button Thread.sleep(4000);
	 * EmployeeImportPage.NavEmployee.click();
	 * 
	 * //Click on Left Employee Button Thread.sleep(3000);
	 * EmployeeImportPage.LeftEmployee.click();
	 * 
	 * testCase = extent.createTest("Step1:- EMPLOYEE-IMPORT-BUTTON UI PROPERTIES");
	 * try { boolean ExpectedTextVisible=true; System.out.println("IsVisible");
	 * boolean ActualTextVisible=EmployeeImportPage.ImportButton.isDisplayed();
	 * testCase = extent.createTest("1-EMPLOYEE-IMPORT-BUTTON-VISIBLE"); try { //
	 * ExpectedTextVisible=false; Assert.assertEquals(ActualTextVisible,
	 * ExpectedTextVisible); testCase.log(Status.INFO, "Actual Visible :- " +
	 * ActualTextVisible); testCase.log(Status.INFO, "Expected Visible :- " +
	 * ExpectedTextVisible); testCase.log(Status.PASS, " Correct"); } catch
	 * (AssertionError e) { testCase.log(Status.INFO, "ActualVisible :- " +
	 * ActualTextVisible); testCase.log(Status.INFO, "Expected Visible :- " +
	 * ExpectedTextVisible); testCase.log(Status.FAIL, "Wrong"); } } catch(Exception
	 * e) { testCase = extent.createTest("1-VISIBLE"); testCase.log(Status.FAIL,
	 * "No element"); }
	 * 
	 * 
	 * 
	 * //Employee Import Button FONT-COLOR
	 * 
	 * try { String ActualTitleFontColor =
	 * EmployeeImportPage.ImportButton.getCssValue("color");
	 * System.out.println("Font color of button: " + ActualTitleFontColor); String
	 * ExpectedTitleFontColor ="rgba(0, 0, 0, 0.85)"; testCase =
	 * extent.createTest("2.EMPLOYEE-IMPORT-BUTTON-FONT-COLOUR");
	 * 
	 * try { AssertJUnit.assertEquals(ActualTitleFontColor, ExpectedTitleFontColor);
	 * testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
	 * testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
	 * testCase.log(Status.INFO, "Correct font Colour"); testCase.log(Status.PASS,
	 * "Correct font Colour");
	 * 
	 * } catch(AssertionError e){ testCase.log(Status.INFO, "ActualColour :- " +
	 * ActualTitleFontColor); testCase.log(Status.INFO, "ExpectedColour :- " +
	 * ExpectedTitleFontColor); testCase.log(Status.INFO, "wrong font Colour");
	 * testCase.log(Status.FAIL, "wrong font Colour"); } } catch(Exception e) {
	 * testCase = extent.createTest("2.EMPLOYEE-IMPORT-BUTTON-FONT-COLOUR");
	 * testCase.log(Status.FAIL, "No element"); }
	 * 
	 * //Employee Import Button FONTSIZE
	 * 
	 * 
	 * try { String ActualTitleFontsSize =
	 * EmployeeImportPage.ImportButton.getCssValue("font-size");
	 * System.out.println("Font Size: " + ActualTitleFontsSize); String
	 * ExpectedTitleFontsSize = "14px"; testCase =
	 * extent.createTest("3.EMPLOYEE-IMPORT-BUTTON-FONT-SIZE"); try{
	 * AssertJUnit.assertEquals(ActualTitleFontsSize, ExpectedTitleFontsSize);
	 * testCase.log(Status.INFO, "ActualfontSize :-" + ActualTitleFontsSize);
	 * testCase.log(Status.INFO, "ExpectedfontSize:-" + ExpectedTitleFontsSize);
	 * testCase.log(Status.PASS, "Correct font-size"); testCase.log(Status.PASS,
	 * " Font-size Correct"); }catch(AssertionError e) { testCase.log(Status.INFO,
	 * "ActualfontsSize :- " + ActualTitleFontsSize); testCase.log(Status.INFO,
	 * "ExpectedfontsSize :- " + ExpectedTitleFontsSize); testCase.log(Status.INFO,
	 * "Wrong font-size"); testCase.log(Status.FAIL, "Font-size Wrong");
	 * 
	 * } } catch(Exception e) { testCase =
	 * extent.createTest("3.EMPLOYEE-IMPORT-BUTTON-FONT- SIZE");
	 * testCase.log(Status.FAIL, "No Element"); }
	 * 
	 * 
	 * //Employee Import Button Font-Family
	 * 
	 * try { String ActualElementfamily =
	 * EmployeeImportPage.ImportButton.getCssValue("font-family");
	 * System.out.println("FONT-FAMILY: "+ActualElementfamily); String
	 * ExpectedElementFamily = "Roboto, sans-serif"; testCase =
	 * extent.createTest("4.EMPLOYEE-IMPORT-BUTTON-FONT-FAMILY"); try {
	 * Assert.assertEquals(ActualElementfamily, ExpectedElementFamily);
	 * testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
	 * testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
	 * testCase.log(Status.PASS, "Correct Text"); } catch (AssertionError e) {
	 * testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
	 * testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
	 * testCase.log(Status.FAIL, "wrong Text"); } } catch(Exception e) { testCase =
	 * extent.createTest("4.EMPLOYEE-IMPORT-BUTTON-FONT-FAMILY");
	 * testCase.log(Status.FAIL, "NO ELEMENT"); }
	 * 
	 * 
	 * 
	 * //Employee Import Button Spelling
	 * 
	 * try { String AcctualTitleText = EmployeeImportPage.ImportButton.getText();
	 * String ExpectedTitleText = "Import"; System.out.println(" Text:" +
	 * AcctualTitleText); testCase =
	 * extent.createTest("5.EMPLOYEE-IMPORT-BUTTON-SPELLING-TEXT"); try {
	 * 
	 * testCase.log(Status.INFO, "AcctualText :- " + AcctualTitleText);
	 * testCase.log(Status.INFO, "ExpectedText :- " + ExpectedTitleText);
	 * testCase.log(Status.PASS, "Correct element"); } catch(AssertionError e) {
	 * testCase.log(Status.INFO, "AcctualText :- " + AcctualTitleText);
	 * testCase.log(Status.INFO, "ExpectedText :- " + ExpectedTitleText);
	 * testCase.log(Status.FAIL, "Wrong Element"); } } catch (Exception e) {
	 * testCase = extent.createTest("5.EMPLOYEE-IMPORT-BUTTON-SPELLING-TEXT");
	 * testCase.log(Status.FAIL, "No Element"); }
	 * 
	 * //Employee Import Button Position
	 * 
	 * try { Point ActulalLocation = EmployeeImportPage.ImportButton.getLocation();
	 * int actual_x = ActulalLocation.getX(); int actual_y = ActulalLocation.getY();
	 * System.out.println("X axis: " + actual_x); System.out.println("Y axis: " +
	 * actual_y); Point ExpectedLocation = new Point(987, 93);
	 * 
	 * testCase = extent.createTest("6.EMPLOYEE-IMPORT-BUTTON-POSITION"); try {
	 * AssertJUnit.assertEquals(ActulalLocation, ExpectedLocation);
	 * testCase.log(Status.INFO, "ActualFontSize :- " + ActulalLocation);
	 * testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
	 * testCase.log(Status.PASS, "Correct Location"); } catch(AssertionError e){
	 * testCase.log(Status.INFO, "ActualSize :- " + ActulalLocation);
	 * testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
	 * testCase.log(Status.FAIL, "Wrong Location"); } } catch(Exception e) {
	 * testCase = extent.createTest("6.EMPLOYEE-IMPORT-BUTTON-POSITION");
	 * testCase.log(Status.FAIL, "NO ELEMENT");
	 * 
	 * }
	 * 
	 * 
	 * //Employee Import Button Padding
	 * 
	 * try { String Actualpadding =
	 * EmployeeImportPage.ImportButton.getCssValue("padding");
	 * System.out.println("PADDING: "+Actualpadding); String Expectedpadding =
	 * "0px"; testCase = extent.createTest("7.EMPLOYEE-IMPORT-BUTTON-TEXT-PADDING");
	 * try { Assert.assertEquals(Actualpadding, Expectedpadding);
	 * testCase.log(Status.INFO, "Actual padding :- " + Actualpadding);
	 * testCase.log(Status.INFO, "Expected padding :- " + Expectedpadding);
	 * testCase.log(Status.PASS, "padding is Correct"); } catch (AssertionError e) {
	 * testCase.log(Status.INFO, "Actual padding :- " + Actualpadding);
	 * testCase.log(Status.INFO, "Expected padding :- " + Expectedpadding);
	 * testCase.log(Status.FAIL, "padding is Wrong"); } } catch(Exception e) {
	 * testCase = extent.createTest("7.EMPLOYEE-IMPORT-BUTTON-PADDING");
	 * testCase.log(Status.FAIL, "NO ELEMENT"); }
	 * 
	 * 
	 * 
	 * //Employee Import Button Shadow
	 * 
	 * try { String Actualshadow =
	 * EmployeeImportPage.ImportButton.getCssValue("box-shadow");
	 * System.out.println("Text Shadow :" + Actualshadow); String ExpectedShadow =
	 * "none"; testCase = extent.createTest("8.EMPLOYEE-IMPORT-BUTTON-BOX-SHADOW");
	 * try { AssertJUnit.assertEquals(Actualshadow, ExpectedShadow);
	 * testCase.log(Status.INFO, "ActualShadow :- " + Actualshadow);
	 * testCase.log(Status.INFO, "ExpectedShadow :- " + ExpectedShadow);
	 * testCase.log(Status.PASS, "Shadow available"); } catch(AssertionError e){
	 * testCase.log(Status.INFO, "ActualShadow :- " + Actualshadow);
	 * testCase.log(Status.INFO, "ExpectedShadow :- " + ExpectedShadow);
	 * testCase.log(Status.FAIL, "Shadow not available"); } } catch(Exception e) {
	 * testCase = extent.createTest("8.EMPLOYEE-IMPORT-BUTTON-BOX-SHADOW");
	 * testCase.log(Status.FAIL, "No Element"); }
	 * 
	 * 
	 * //Employee Import Button Background Color
	 * 
	 * try { String Actualbackground =
	 * EmployeeImportPage.ImportButton.getCssValue("color");
	 * System.out.println("BACKGROUND COLOR:" + Actualbackground); String
	 * Expectedbackground= "rgba(0, 0, 0, 0.85)";
	 * 
	 * testCase = extent.createTest("9.EMPLOYEE-IMPORT-BUTTON-BACKGROUND COLOR");
	 * try { AssertJUnit.assertEquals(Actualbackground, Expectedbackground);
	 * 
	 * testCase.log(Status.INFO, "Actualbackgroundcolor :- " + Actualbackground);
	 * testCase.log(Status.INFO, "Expectedbackgroundcolor :- " +
	 * Expectedbackground); testCase.log(Status.PASS, "correct"); }
	 * catch(AssertionError e) { testCase.log(Status.INFO,
	 * "Actualbackgroundcolor :- " + Actualbackground); testCase.log(Status.INFO,
	 * "Expectedbackgroundcolor:- " + Expectedbackground); testCase.log(Status.FAIL,
	 * "wrong"); } } catch(Exception e) { testCase.log(Status.FAIL, "No Element");
	 * testCase = extent.createTest("9.EMPLOYEE-IMPORT-BUTTON-BACKGROUND COLOR"); }
	 * 
	 * 
	 * //Employee Import Button BORDER COLOR try { String actualbordercolor =
	 * EmployeeImportPage.ImportButton.getCssValue("border-color");
	 * System.out.println(" border-color:" + actualbordercolor); String
	 * Expectedbordercolor = "rgba(0, 0, 0, 0.85)"; testCase =
	 * extent.createTest("10.EMPLOYEE-IMPORT-BUTTON-BORDER-COLOR"); try {
	 * AssertJUnit.assertEquals(actualbordercolor, Expectedbordercolor);
	 * testCase.log(Status.INFO, "Actualbordercolor :- " + actualbordercolor);
	 * testCase.log(Status.INFO, "Expectedbordercolor :- " + Expectedbordercolor);
	 * testCase.log(Status.PASS, "correct"); } catch(AssertionError e){
	 * testCase.log(Status.INFO, "Actualbordercolor :- " + actualbordercolor);
	 * testCase.log(Status.INFO, "Expectedbordercolor :- " +Expectedbordercolor);
	 * testCase.log(Status.FAIL, "wrong"); } } catch(Exception e) {
	 * testCase.log(Status.FAIL, "NO ELEMENT"); testCase =
	 * extent.createTest("10.EMPLOYEE-IMPORT-BUTTON-BORDER-COLOR"); }
	 * 
	 * 
	 * //Employee Import Button CURSER POINT
	 * 
	 * try { String ActualCursor =
	 * EmployeeImportPage.ImportButton.getCssValue("cursor");
	 * System.out.println("cursor :" + ActualCursor); String Expectedcursor =
	 * "auto"; testCase = extent.createTest("11.EMPLOYEE-IMPORT-BUTTON-CURSOR"); try
	 * { AssertJUnit.assertEquals(ActualCursor, Expectedcursor);
	 * testCase.log(Status.INFO, "ActualCursor :- " + ActualCursor);
	 * testCase.log(Status.INFO, "ActualCursor:- " + Expectedcursor);
	 * testCase.log(Status.PASS, "correct"); } catch(AssertionError e) {
	 * testCase.log(Status.INFO, "ActualCursor :- " + ActualCursor);
	 * testCase.log(Status.INFO, "ActualCursor :- " + Expectedcursor);
	 * testCase.log(Status.FAIL, "wrong"); } } catch(Exception e) {
	 * testCase.log(Status.FAIL, "No Element"); testCase =
	 * extent.createTest("11.EMPLOYEE-IMPORT-BUTTON-CURSOR"); }
	 * 
	 * 
	 * 
	 * //Employee Import Button OPACITY
	 * 
	 * try { String Actualopacity =
	 * EmployeeImportPage.ImportButton.getCssValue("opacity");
	 * System.out.println("OPACITY :" + Actualopacity);
	 * 
	 * String Expectedopacity = "1"; testCase =
	 * extent.createTest("12.EMPLOYEE-IMPORT-BUTTON-OPACITY"); try {
	 * AssertJUnit.assertEquals(Actualopacity, Expectedopacity);
	 * testCase.log(Status.INFO, "ActualTextTransformation :- " + Actualopacity);
	 * testCase.log(Status.INFO, "ExpectedTextTransformation :- " +
	 * Expectedopacity); testCase.log(Status.PASS, "correct"); }
	 * catch(AssertionError e) { testCase.log(Status.INFO,
	 * "ActualTextTransformation :- " + Actualopacity); testCase.log(Status.INFO,
	 * "ExpectedTextTransformation :- " + Expectedopacity);
	 * testCase.log(Status.FAIL, "wrong"); } } catch (Exception e) { testCase =
	 * extent.createTest("12.EMPLOYEE-IMPORT-BUTTON-OPACITY");
	 * testCase.log(Status.FAIL, "No Element"); }
	 * 
	 * 
	 * //Employee Import Button HEIGHT
	 * 
	 * try { String ActualHeight
	 * =EmployeeImportPage.ImportButton.getCssValue("height");
	 * System.out.println("Height :" + ActualHeight); String ExpectedHeight =
	 * "32px"; testCase = extent.createTest("13.EMPLOYEE-IMPORT-BUTTON-HEIGHT"); try
	 * { AssertJUnit.assertEquals(ActualHeight, ExpectedHeight);
	 * testCase.log(Status.INFO, "ActualLineHeight :- " + ActualHeight);
	 * testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedHeight);
	 * testCase.log(Status.PASS, "correct"); } catch(AssertionError e) {
	 * testCase.log(Status.INFO, "ActualLineHeight :- " + ActualHeight);
	 * testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedHeight);
	 * testCase.log(Status.FAIL, "wrong"); } } catch(Exception e) { testCase =
	 * extent.createTest("13.EMPLOYEE-IMPORT-BUTTON-HEIGHT");
	 * testCase.log(Status.FAIL, "No element"); }
	 * 
	 * 
	 * 
	 * //Employee Import Button Width
	 * 
	 * try { String Actualwidth
	 * =EmployeeImportPage.ImportButton.getCssValue("width");
	 * System.out.println("width :" + Actualwidth);
	 * 
	 * String Expectedwidth = "95.5781px"; testCase =
	 * extent.createTest("14.EMPLOYEE-IMPORT-BUTTON-WIDTH"); try {
	 * AssertJUnit.assertEquals(Actualwidth, Expectedwidth);
	 * testCase.log(Status.INFO, "Actualwidth :- " + Actualwidth);
	 * testCase.log(Status.INFO, "Expectedwidth  :- " + Expectedwidth);
	 * testCase.log(Status.PASS, "correct"); } catch(AssertionError e) {
	 * testCase.log(Status.INFO, "Actualwidth  :- " + Actualwidth);
	 * testCase.log(Status.INFO, "Expectedwidth  :- " + Expectedwidth);
	 * testCase.log(Status.FAIL, "wrong"); } } catch(Exception e) { testCase =
	 * extent.createTest("14.EMPLOYEE-IMPORT-BUTTON-WIDTH");
	 * testCase.log(Status.FAIL, "No element"); }
	 * 
	 * 
	 * 
	 * //Employee Import Button Font-weight
	 * 
	 * try { String Actualweight =
	 * EmployeeImportPage.ImportButton.getCssValue("font-weight");
	 * System.out.println("16.Font-weight :" + Actualweight); String Expectedweight
	 * = "400"; testCase =
	 * extent.createTest("15.EMPLOYEE-IMPORT-BUTTON-FONT-WEIGHT"); try {
	 * AssertJUnit.assertEquals(Actualweight, Expectedweight);
	 * testCase.log(Status.INFO, "Actualfontweight :- " + Actualweight);
	 * testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
	 * testCase.log(Status.PASS, "correct"); } catch(AssertionError e) {
	 * testCase.log(Status.INFO, "Actualfontweight :- " + Actualweight);
	 * testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
	 * testCase.log(Status.FAIL, "wrong"); } } catch(Exception e) {
	 * testCase.log(Status.FAIL, "No Element"); testCase =
	 * extent.createTest("15.EMPLOYEE-IMPORT-BUTTON-FONT-WEIGHT"); }
	 * Thread.sleep(2000); //EmployeeImportPage.ImportButton.click(); }
	 */

	/** Employee --> Employee --> ExportButton **/
	/*
	 * @Test public void EmployeeExportButton() throws InterruptedException {
	 * testCase = extent.createTest("Step2:- EMPLOYEE-EXPORT-BUTTON UI PROPERTIES");
	 * try { boolean ExpectedTextVisible=true; System.out.println("IsVisible");
	 * boolean ActualTextVisible=EmployeeImportPage.ExportButton.isDisplayed();
	 * testCase = extent.createTest("1-EMPLOYEE-EXPORT-BUTTON-VISIBLE"); try { //
	 * ExpectedTextVisible=false; Assert.assertEquals(ActualTextVisible,
	 * ExpectedTextVisible); testCase.log(Status.INFO, "Actual Visible :- " +
	 * ActualTextVisible); testCase.log(Status.INFO, "Expected Visible :- " +
	 * ExpectedTextVisible); testCase.log(Status.PASS, " Correct"); } catch
	 * (AssertionError e) { testCase.log(Status.INFO, "ActualVisible :- " +
	 * ActualTextVisible); testCase.log(Status.INFO, "Expected Visible :- " +
	 * ExpectedTextVisible); testCase.log(Status.FAIL, "Wrong"); } } catch(Exception
	 * e) { testCase = extent.createTest("1-VISIBLE"); testCase.log(Status.FAIL,
	 * "No element"); }
	 * 
	 * 
	 * 
	 * //Employee Export Button FONT-COLOR
	 * 
	 * try { String ActualTitleFontColor =
	 * EmployeeImportPage.ExportButton.getCssValue("color");
	 * System.out.println("Font color of button: " + ActualTitleFontColor); String
	 * ExpectedTitleFontColor ="rgba(255, 255, 255, 1)"; testCase =
	 * extent.createTest("2.EMPLOYEE-EXPORT-BUTTON-FONT-COLOUR");
	 * 
	 * try { AssertJUnit.assertEquals(ActualTitleFontColor, ExpectedTitleFontColor);
	 * testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
	 * testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
	 * testCase.log(Status.INFO, "Correct font Colour"); testCase.log(Status.PASS,
	 * "Correct font Colour");
	 * 
	 * } catch(AssertionError e){ testCase.log(Status.INFO, "ActualColour :- " +
	 * ActualTitleFontColor); testCase.log(Status.INFO, "ExpectedColour :- " +
	 * ExpectedTitleFontColor); testCase.log(Status.INFO, "wrong font Colour");
	 * testCase.log(Status.FAIL, "wrong font Colour"); } } catch(Exception e) {
	 * testCase = extent.createTest("2.EMPLOYEE-EXPORT-BUTTON-FONT-COLOUR");
	 * testCase.log(Status.FAIL, "No element"); }
	 * 
	 * //Employee Export Button FONTSIZE
	 * 
	 * 
	 * try { String ActualTitleFontsSize =
	 * EmployeeImportPage.ExportButton.getCssValue("font-size");
	 * System.out.println("Font Size: " + ActualTitleFontsSize); String
	 * ExpectedTitleFontsSize = "14px"; testCase =
	 * extent.createTest("3.EMPLOYEE-EXPORT-BUTTON-FONT-SIZE"); try{
	 * AssertJUnit.assertEquals(ActualTitleFontsSize, ExpectedTitleFontsSize);
	 * testCase.log(Status.INFO, "ActualfontSize :-" + ActualTitleFontsSize);
	 * testCase.log(Status.INFO, "ExpectedfontSize:-" + ExpectedTitleFontsSize);
	 * testCase.log(Status.PASS, "Correct font-size"); testCase.log(Status.PASS,
	 * " Font-size Correct"); }catch(AssertionError e) { testCase.log(Status.INFO,
	 * "ActualfontsSize :- " + ActualTitleFontsSize); testCase.log(Status.INFO,
	 * "ExpectedfontsSize :- " + ExpectedTitleFontsSize); testCase.log(Status.INFO,
	 * "Wrong font-size"); testCase.log(Status.FAIL, "Font-size Wrong");
	 * 
	 * } } catch(Exception e) { testCase =
	 * extent.createTest("3.EMPLOYEE-EXPORT-BUTTON-FONT-SIZE");
	 * testCase.log(Status.FAIL, "No Element"); }
	 * 
	 * 
	 * //Employee Export Button Font-Family
	 * 
	 * try { String ActualElementfamily =
	 * EmployeeImportPage.ExportButton.getCssValue("font-family");
	 * System.out.println("FONT-FAMILY: "+ActualElementfamily); String
	 * ExpectedElementFamily = "Roboto, sans-serif"; testCase =
	 * extent.createTest("4.EMPLOYEE-EXPORT-BUTTON-FONT-FAMILY"); try {
	 * Assert.assertEquals(ActualElementfamily, ExpectedElementFamily);
	 * testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
	 * testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
	 * testCase.log(Status.PASS, "Correct Text"); } catch (AssertionError e) {
	 * testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
	 * testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
	 * testCase.log(Status.FAIL, "wrong Text"); } } catch(Exception e) { testCase =
	 * extent.createTest("4.EMPLOYEE-EXPORT-BUTTON-FONT-FAMILY");
	 * testCase.log(Status.FAIL, "NO ELEMENT"); }
	 * 
	 * 
	 * 
	 * //Employee Export Button Spelling
	 * 
	 * try { String AcctualTitleText = EmployeeImportPage.ExportButton.getText();
	 * String ExpectedTitleText = "Add SBU"; System.out.println(" Text:" +
	 * AcctualTitleText); testCase =
	 * extent.createTest("5.EMPLOYEE-EXPORT-BUTTON-SPELLING-TEXT"); try {
	 * 
	 * testCase.log(Status.INFO, "AcctualText :- " + AcctualTitleText);
	 * testCase.log(Status.INFO, "ExpectedText :- " + ExpectedTitleText);
	 * testCase.log(Status.PASS, "Correct element"); } catch(AssertionError e) {
	 * testCase.log(Status.INFO, "AcctualText :- " + AcctualTitleText);
	 * testCase.log(Status.INFO, "ExpectedText :- " + ExpectedTitleText);
	 * 
	 * testCase.log(Status.FAIL, "Wrong Element"); } } catch (Exception e) {
	 * testCase = extent.createTest("5.EMPLOYEE-EXPORT-BUTTON-SPELLING-TEXT");
	 * testCase.log(Status.FAIL, "No Element"); }
	 * 
	 * //Employee Export Button Position
	 * 
	 * try { Point ActulalLocation = EmployeeImportPage.ExportButton.getLocation();
	 * int actual_x = ActulalLocation.getX(); int actual_y = ActulalLocation.getY();
	 * System.out.println("X axis: " + actual_x); System.out.println("Y axis: " +
	 * actual_y); Point ExpectedLocation = new Point(1106, 93);
	 * 
	 * testCase = extent.createTest("6.EMPLOYEE-EXPORT-BUTTON-POSITION"); try {
	 * AssertJUnit.assertEquals(ActulalLocation, ExpectedLocation);
	 * testCase.log(Status.INFO, "ActualFontSize :- " + ActulalLocation);
	 * testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
	 * testCase.log(Status.PASS, "Correct Location"); } catch(AssertionError e){
	 * testCase.log(Status.INFO, "ActualSize :- " + ActulalLocation);
	 * testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
	 * testCase.log(Status.FAIL, "Wrong Location"); } } catch(Exception e) {
	 * testCase = extent.createTest("6.EMPLOYEE-EXPORT-BUTTON-POSITION");
	 * testCase.log(Status.FAIL, "NO ELEMENT");
	 * 
	 * }
	 * 
	 * 
	 * //Employee Export Button Padding
	 * 
	 * try { String Actualpadding =
	 * EmployeeImportPage.ExportButton.getCssValue("padding");
	 * System.out.println("PADDING: "+Actualpadding); String Expectedpadding =
	 * "4px 16px"; testCase =
	 * extent.createTest("7.EMPLOYEE-EXPORT-BUTTON-TEXT-PADDING"); try {
	 * Assert.assertEquals(Actualpadding, Expectedpadding);
	 * testCase.log(Status.INFO, "Actual padding :- " + Actualpadding);
	 * testCase.log(Status.INFO, "Expected padding :- " + Expectedpadding);
	 * testCase.log(Status.PASS, "padding is Correct"); } catch (AssertionError e) {
	 * testCase.log(Status.INFO, "Actual padding :- " + Actualpadding);
	 * testCase.log(Status.INFO, "Expected padding :- " + Expectedpadding);
	 * testCase.log(Status.FAIL, "padding is Wrong"); } } catch(Exception e) {
	 * testCase = extent.createTest("7.EMPLOYEE-EXPORT-BUTTON-PADDING");
	 * testCase.log(Status.FAIL, "NO ELEMENT"); }
	 * 
	 * 
	 * 
	 * //Employee Export Button Shadow
	 * 
	 * try { String Actualshadow =
	 * EmployeeImportPage.ExportButton.getCssValue("box-shadow");
	 * System.out.println("Text Shadow :" + Actualshadow); String ExpectedShadow =
	 * "rgba(0, 0, 0, 0.043) 0px 2px 0px 0px"; testCase =
	 * extent.createTest("8.EMPLOYEE-EXPORT-BUTTON-BOX-SHADOW"); try {
	 * AssertJUnit.assertEquals(Actualshadow, ExpectedShadow);
	 * testCase.log(Status.INFO, "ActualShadow :- " + Actualshadow);
	 * testCase.log(Status.INFO, "ExpectedShadow :- " + ExpectedShadow);
	 * testCase.log(Status.PASS, "Shadow available"); } catch(AssertionError e){
	 * testCase.log(Status.INFO, "ActualShadow :- " + Actualshadow);
	 * testCase.log(Status.INFO, "ExpectedShadow :- " + ExpectedShadow);
	 * testCase.log(Status.FAIL, "Shadow not available"); } } catch(Exception e) {
	 * testCase = extent.createTest("8.EMPLOYEE-EXPORT-BUTTON-BOX-SHADOW");
	 * testCase.log(Status.FAIL, "No Element"); }
	 * 
	 * 
	 * //Employee Export Button Background Color
	 * 
	 * try { String Actualbackground =
	 * EmployeeImportPage.ExportButton.getCssValue("color");
	 * System.out.println("BACKGROUND COLOR:" + Actualbackground); String
	 * Expectedbackground= "rgba(255, 255, 255, 1)";
	 * 
	 * testCase = extent.createTest("9.EMPLOYEE-EXPORT-BUTTON-BACKGROUND COLOR");
	 * try { AssertJUnit.assertEquals(Actualbackground, Expectedbackground);
	 * 
	 * testCase.log(Status.INFO, "Actualbackgroundcolor :- " + Actualbackground);
	 * testCase.log(Status.INFO, "Expectedbackgroundcolor :- " +
	 * Expectedbackground); testCase.log(Status.PASS, "correct"); }
	 * catch(AssertionError e) { testCase.log(Status.INFO,
	 * "Actualbackgroundcolor :- " + Actualbackground); testCase.log(Status.INFO,
	 * "Expectedbackgroundcolor:- " + Expectedbackground); testCase.log(Status.FAIL,
	 * "wrong"); } } catch(Exception e) { testCase.log(Status.FAIL, "No Element");
	 * testCase = extent.createTest("9.EMPLOYEE-EXPORT-BUTTON-BACKGROUND COLOR"); }
	 * 
	 * 
	 * //Employee Export Button BORDER COLOR try { String actualbordercolor =
	 * EmployeeImportPage.ExportButton.getCssValue("border-color");
	 * System.out.println(" border-color:" + actualbordercolor); String
	 * Expectedbordercolor = "rgb(255, 255, 255)"; testCase =
	 * extent.createTest("10.EMPLOYEE-EXPORT-BUTTON-BORDER-COLOR"); try {
	 * AssertJUnit.assertEquals(actualbordercolor, Expectedbordercolor);
	 * testCase.log(Status.INFO, "Actualbordercolor :- " + actualbordercolor);
	 * testCase.log(Status.INFO, "Expectedbordercolor :- " + Expectedbordercolor);
	 * testCase.log(Status.PASS, "correct"); } catch(AssertionError e){
	 * testCase.log(Status.INFO, "Actualbordercolor :- " + actualbordercolor);
	 * testCase.log(Status.INFO, "Expectedbordercolor :- " +Expectedbordercolor);
	 * testCase.log(Status.FAIL, "wrong"); } } catch(Exception e) {
	 * testCase.log(Status.FAIL, "NO ELEMENT"); testCase =
	 * extent.createTest("10.EMPLOYEE-EXPORT-BUTTON-BORDER-COLOR"); }
	 * 
	 * 
	 * //Employee Export Button CURSER POINT
	 * 
	 * try { String ActualCursor =
	 * EmployeeImportPage.ExportButton.getCssValue("cursor");
	 * System.out.println("cursor :" + ActualCursor); String Expectedcursor =
	 * "pointer"; testCase = extent.createTest("11.EMPLOYEE-EXPORT-BUTTON-CURSOR");
	 * try { AssertJUnit.assertEquals(ActualCursor, Expectedcursor);
	 * testCase.log(Status.INFO, "ActualCursor :- " + ActualCursor);
	 * testCase.log(Status.INFO, "ActualCursor:- " + Expectedcursor);
	 * testCase.log(Status.PASS, "correct"); } catch(AssertionError e) {
	 * testCase.log(Status.INFO, "ActualCursor :- " + ActualCursor);
	 * testCase.log(Status.INFO, "ActualCursor :- " + Expectedcursor);
	 * testCase.log(Status.FAIL, "wrong"); } } catch(Exception e) {
	 * testCase.log(Status.FAIL, "No Element"); testCase =
	 * extent.createTest("11.EMPLOYEE-EXPORT-BUTTON-CURSOR"); }
	 * 
	 * 
	 * 
	 * //Employee Export Button OPACITY
	 * 
	 * try { String Actualopacity =
	 * EmployeeImportPage.ExportButton.getCssValue("opacity");
	 * System.out.println("OPACITY :" + Actualopacity);
	 * 
	 * String Expectedopacity = "1"; testCase =
	 * extent.createTest("12.EMPLOYEE-EXPORT-BUTTON-OPACITY"); try {
	 * AssertJUnit.assertEquals(Actualopacity, Expectedopacity);
	 * testCase.log(Status.INFO, "ActualTextTransformation :- " + Actualopacity);
	 * testCase.log(Status.INFO, "ExpectedTextTransformation :- " +
	 * Expectedopacity); testCase.log(Status.PASS, "correct"); }
	 * catch(AssertionError e) { testCase.log(Status.INFO,
	 * "ActualTextTransformation :- " + Actualopacity); testCase.log(Status.INFO,
	 * "ExpectedTextTransformation :- " + Expectedopacity);
	 * testCase.log(Status.FAIL, "wrong"); } } catch (Exception e) { testCase =
	 * extent.createTest("12.EMPLOYEE-EXPORT-BUTTON-OPACITY");
	 * testCase.log(Status.FAIL, "No Element"); }
	 * 
	 * 
	 * //Employee Export Button HEIGHT
	 * 
	 * try { String ActualHeight
	 * =EmployeeImportPage.ExportButton.getCssValue("height");
	 * System.out.println("Height :" + ActualHeight); String ExpectedHeight =
	 * "32px"; testCase = extent.createTest("13.EMPLOYEE-EXPORT-BUTTON-HEIGHT"); try
	 * { AssertJUnit.assertEquals(ActualHeight, ExpectedHeight);
	 * testCase.log(Status.INFO, "ActualLineHeight :- " + ActualHeight);
	 * testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedHeight);
	 * testCase.log(Status.PASS, "correct"); } catch(AssertionError e) {
	 * testCase.log(Status.INFO, "ActualLineHeight :- " + ActualHeight);
	 * testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedHeight);
	 * testCase.log(Status.FAIL, "wrong"); } } catch(Exception e) { testCase =
	 * extent.createTest("13.EMPLOYEE-EXPORT-BUTTON-HEIGHT");
	 * testCase.log(Status.FAIL, "No element"); }
	 * 
	 * 
	 * 
	 * //Employee Export Button Width
	 * 
	 * try { String Actualwidth
	 * =EmployeeImportPage.ExportButton.getCssValue("width");
	 * System.out.println("width :" + Actualwidth);
	 * 
	 * String Expectedwidth = "94.3906px"; testCase =
	 * extent.createTest("14.EMPLOYEE-EXPORT-BUTTON-WIDTH"); try {
	 * AssertJUnit.assertEquals(Actualwidth, Expectedwidth);
	 * testCase.log(Status.INFO, "Actualwidth :- " + Actualwidth);
	 * testCase.log(Status.INFO, "Expectedwidth  :- " + Expectedwidth);
	 * testCase.log(Status.PASS, "correct"); } catch(AssertionError e) {
	 * testCase.log(Status.INFO, "Actualwidth  :- " + Actualwidth);
	 * testCase.log(Status.INFO, "Expectedwidth  :- " + Expectedwidth);
	 * testCase.log(Status.FAIL, "wrong"); } } catch(Exception e) { testCase =
	 * extent.createTest("14.EMPLOYEE-EXPORT-BUTTON-WIDTH");
	 * testCase.log(Status.FAIL, "No element"); }
	 * 
	 * 
	 * 
	 * //Employee Export Button Font-weight
	 * 
	 * try { String Actualweight =
	 * EmployeeImportPage.ExportButton.getCssValue("font-weight");
	 * System.out.println("16.Font-weight :" + Actualweight); String Expectedweight
	 * = "400"; testCase =
	 * extent.createTest("15.EMPLOYEE-EXPORT-BUTTON-FONT-WEIGHT"); try {
	 * AssertJUnit.assertEquals(Actualweight, Expectedweight);
	 * testCase.log(Status.INFO, "Actualfontweight :- " + Actualweight);
	 * testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
	 * testCase.log(Status.PASS, "correct"); } catch(AssertionError e) {
	 * testCase.log(Status.INFO, "Actualfontweight :- " + Actualweight);
	 * testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
	 * testCase.log(Status.FAIL, "wrong"); } } catch(Exception e) {
	 * testCase.log(Status.FAIL, "No Element"); testCase =
	 * extent.createTest("15.EMPLOYEE-EXPORT-BUTTON-FONT-WEIGHT"); }
	 * Thread.sleep(2000); //EmployeeImportPage.ExportButton.click(); }
	 * 
	 */

	/** Material --> Material --> ImportButton **/

	@Test
	public void MaterialImportButton() throws InterruptedException {

		// Click on Navigation Material Button
		Thread.sleep(2000);
		EmployeeImportPage.NavMaterial.click();

		// Click on Left Material Button
		Thread.sleep(2000);
		EmployeeImportPage.LeftMaterial.click();

		Thread.sleep(2000);
		testCase = extent.createTest("Step1:- MATERIAL-IMPORT-BUTTON UI PROPERTIES");
		try {
			boolean ExpectedTextVisible = true;
			System.out.println("IsVisible");
			boolean ActualTextVisible = EmployeeImportPage.MaterialImportButton.isDisplayed();
			testCase = extent.createTest("1-MATERIAL-IMPORT-BUTTON-VISIBLE");
			try {
				// ExpectedTextVisible=false;
				Assert.assertEquals(ActualTextVisible, ExpectedTextVisible);
				testCase.log(Status.INFO, "Actual Visible :- " + ActualTextVisible);
				testCase.log(Status.INFO, "Expected Visible :- " + ExpectedTextVisible);
				testCase.log(Status.PASS, " Correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualVisible :- " + ActualTextVisible);
				testCase.log(Status.INFO, "Expected Visible :- " + ExpectedTextVisible);
				testCase.log(Status.FAIL, "Wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("1-MATERIAL-IMPORT-BUTTON-VISIBLE");
			testCase.log(Status.FAIL, "No element");
		}

//Material Import Button FONT-COLOR

		try {
			String ActualTitleFontColor = EmployeeImportPage.MaterialImportButton.getCssValue("color");
			System.out.println("Font color of button: " + ActualTitleFontColor);
			String ExpectedTitleFontColor = "rgba(255, 255, 255, 1)";
			testCase = extent.createTest("2.MATERIAL-IMPORT-BUTTON-FONT-COLOUR");

			try {
				AssertJUnit.assertEquals(ActualTitleFontColor, ExpectedTitleFontColor);
				testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
				testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
				testCase.log(Status.INFO, "Correct font Colour");
				testCase.log(Status.PASS, "Correct font Colour");

			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
				testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
				testCase.log(Status.INFO, "wrong font Colour");
				testCase.log(Status.FAIL, "wrong font Colour");
			}
		} catch (Exception e) {
			testCase = extent.createTest("2.MATERIAL-IMPORT-BUTTON-FONT-COLOUR");
			testCase.log(Status.FAIL, "No element");
		}

//Material Import Button FONTSIZE

		try {
			String ActualTitleFontsSize = EmployeeImportPage.MaterialImportButton.getCssValue("font-size");
			System.out.println("Font Size: " + ActualTitleFontsSize);
			String ExpectedTitleFontsSize = "14px";
			testCase = extent.createTest("3.MATERIAL-IMPORT-BUTTON-FONT-SIZE");
			try {
				AssertJUnit.assertEquals(ActualTitleFontsSize, ExpectedTitleFontsSize);
				testCase.log(Status.INFO, "ActualfontSize :-" + ActualTitleFontsSize);
				testCase.log(Status.INFO, "ExpectedfontSize:-" + ExpectedTitleFontsSize);
				testCase.log(Status.PASS, "Correct font-size");
				testCase.log(Status.PASS, " Font-size Correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualfontsSize :- " + ActualTitleFontsSize);
				testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedTitleFontsSize);
				testCase.log(Status.INFO, "Wrong font-size");
				testCase.log(Status.FAIL, "Font-size Wrong");

			}
		} catch (Exception e) {
			testCase = extent.createTest("3.MATERIAL-IMPORT-BUTTON-FONT- SIZE");
			testCase.log(Status.FAIL, "No Element");
		}

//Material Import Button Font-Family 

		try {
			String ActualElementfamily = EmployeeImportPage.MaterialImportButton.getCssValue("font-family");
			System.out.println("FONT-FAMILY: " + ActualElementfamily);
			String ExpectedElementFamily = "Roboto, sans-serif";
			testCase = extent.createTest("4.MATERIAL-IMPORT-BUTTON-FONT-FAMILY");
			try {
				Assert.assertEquals(ActualElementfamily, ExpectedElementFamily);
				testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
				testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
				testCase.log(Status.PASS, "Correct Text");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
				testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
				testCase.log(Status.FAIL, "wrong Text");
			}
		} catch (Exception e) {
			testCase = extent.createTest("4.MATERIAL-IMPORT-BUTTON-FONT-FAMILY");
			testCase.log(Status.FAIL, "NO ELEMENT");
		}

//Material Import Button Spelling	

		try {
			String AcctualTitleText = EmployeeImportPage.MaterialImportButton.getText();
			String ExpectedTitleText = "Import";
			System.out.println(" Text:" + AcctualTitleText);
			testCase = extent.createTest("5.MATERIAL-IMPORT-BUTTON-SPELLING-TEXT");
			try {

				testCase.log(Status.INFO, "AcctualText :- " + AcctualTitleText);
				testCase.log(Status.INFO, "ExpectedText :- " + ExpectedTitleText);
				testCase.log(Status.PASS, "Correct element");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "AcctualText :- " + AcctualTitleText);
				testCase.log(Status.INFO, "ExpectedText :- " + ExpectedTitleText);
				testCase.log(Status.FAIL, "Wrong Element");
			}
		} catch (Exception e) {
			testCase = extent.createTest("5.MATERIAL-IMPORT-BUTTON-SPELLING-TEXT");
			testCase.log(Status.FAIL, "No Element");
		}

//Material Import Button Position

		try {
			Point ActulalLocation = EmployeeImportPage.MaterialImportButton.getLocation();
			int actual_x = ActulalLocation.getX();
			int actual_y = ActulalLocation.getY();
			System.out.println("X axis: " + actual_x);
			System.out.println("Y axis: " + actual_y);
			Point ExpectedLocation = new Point(1004, 93);

			testCase = extent.createTest("6.MATERIAL-IMPORT-BUTTON-POSITION");
			try {
				AssertJUnit.assertEquals(ActulalLocation, ExpectedLocation);
				testCase.log(Status.INFO, "ActualFontSize :- " + ActulalLocation);
				testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
				testCase.log(Status.PASS, "Correct Location");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualSize :- " + ActulalLocation);
				testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
				testCase.log(Status.FAIL, "Wrong Location");
			}
		} catch (Exception e) {
			testCase = extent.createTest("6.MATERIAL-IMPORT-BUTTON-POSITION");
			testCase.log(Status.FAIL, "NO ELEMENT");

		}

//Material Import Button Padding 

		try {
			String Actualpadding = EmployeeImportPage.MaterialImportButton.getCssValue("padding");
			System.out.println("PADDING: " + Actualpadding);
			String Expectedpadding = "4px 16px";
			testCase = extent.createTest("7.MATERIAL-IMPORT-BUTTON-TEXT-PADDING");
			try {
				Assert.assertEquals(Actualpadding, Expectedpadding);
				testCase.log(Status.INFO, "Actual padding :- " + Actualpadding);
				testCase.log(Status.INFO, "Expected padding :- " + Expectedpadding);
				testCase.log(Status.PASS, "padding is Correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual padding :- " + Actualpadding);
				testCase.log(Status.INFO, "Expected padding :- " + Expectedpadding);
				testCase.log(Status.FAIL, "padding is Wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("7.MATERIAL-IMPORT-BUTTON-PADDING");
			testCase.log(Status.FAIL, "NO ELEMENT");
		}

//Material Import Button Shadow

		try {
			String Actualshadow = EmployeeImportPage.MaterialImportButton.getCssValue("box-shadow");
			System.out.println("Text Shadow :" + Actualshadow);
			String ExpectedShadow = "rgba(0, 0, 0, 0.043) 0px 2px 0px 0px";
			testCase = extent.createTest("8.MATERIAL-IMPORT-BUTTON-BOX-SHADOW");
			try {
				AssertJUnit.assertEquals(Actualshadow, ExpectedShadow);
				testCase.log(Status.INFO, "ActualShadow :- " + Actualshadow);
				testCase.log(Status.INFO, "ExpectedShadow :- " + ExpectedShadow);
				testCase.log(Status.PASS, "Shadow available");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualShadow :- " + Actualshadow);
				testCase.log(Status.INFO, "ExpectedShadow :- " + ExpectedShadow);
				testCase.log(Status.FAIL, "Shadow not available");
			}
		} catch (Exception e) {
			testCase = extent.createTest("8.MATERIAL-IMPORT-BUTTON-BOX-SHADOW");
			testCase.log(Status.FAIL, "No Element");
		}

//Material Import Button Background Color

		try {
			String Actualbackground = EmployeeImportPage.MaterialImportButton.getCssValue("color");
			System.out.println("BACKGROUND COLOR:" + Actualbackground);
			String Expectedbackground = "rgba(255, 255, 255, 1)";

			testCase = extent.createTest("9.MATERIAL-IMPORT-BUTTON-BACKGROUND COLOR");
			try {
				AssertJUnit.assertEquals(Actualbackground, Expectedbackground);

				testCase.log(Status.INFO, "Actualbackgroundcolor :- " + Actualbackground);
				testCase.log(Status.INFO, "Expectedbackgroundcolor :- " + Expectedbackground);
				testCase.log(Status.PASS, "correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actualbackgroundcolor :- " + Actualbackground);
				testCase.log(Status.INFO, "Expectedbackgroundcolor:- " + Expectedbackground);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase.log(Status.FAIL, "No Element");
			testCase = extent.createTest("9.MATERIAL-IMPORT-BUTTON-BACKGROUND COLOR");
		}

//Material Import Button BORDER COLOR
		try {
			String actualbordercolor = EmployeeImportPage.MaterialImportButton.getCssValue("border-color");
			System.out.println(" border-color:" + actualbordercolor);
			String Expectedbordercolor = "rgb(255, 255, 255)";
			testCase = extent.createTest("10.MATERIAL-IMPORT-BUTTON-BORDER-COLOR");
			try {
				AssertJUnit.assertEquals(actualbordercolor, Expectedbordercolor);
				testCase.log(Status.INFO, "Actualbordercolor :- " + actualbordercolor);
				testCase.log(Status.INFO, "Expectedbordercolor :- " + Expectedbordercolor);
				testCase.log(Status.PASS, "correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actualbordercolor :- " + actualbordercolor);
				testCase.log(Status.INFO, "Expectedbordercolor :- " + Expectedbordercolor);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase.log(Status.FAIL, "NO ELEMENT");
			testCase = extent.createTest("10.MATERIAL-IMPORT-BUTTON-BORDER-COLOR");
		}

//Material Import Button CURSER POINT	 

		try {
			String ActualCursor = EmployeeImportPage.MaterialImportButton.getCssValue("cursor");
			System.out.println("cursor :" + ActualCursor);
			String Expectedcursor = "pointer";
			testCase = extent.createTest("11.MATERIAL-IMPORT-BUTTON-CURSOR");
			try {
				AssertJUnit.assertEquals(ActualCursor, Expectedcursor);
				testCase.log(Status.INFO, "ActualCursor :- " + ActualCursor);
				testCase.log(Status.INFO, "ActualCursor:- " + Expectedcursor);
				testCase.log(Status.PASS, "correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualCursor :- " + ActualCursor);
				testCase.log(Status.INFO, "ActualCursor :- " + Expectedcursor);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase.log(Status.FAIL, "No Element");
			testCase = extent.createTest("11.MATERIAL-IMPORT-BUTTON-CURSOR");
		}

//Material Import Button OPACITY 

		try {
			String Actualopacity = EmployeeImportPage.MaterialImportButton.getCssValue("opacity");
			System.out.println("OPACITY :" + Actualopacity);

			String Expectedopacity = "1";
			testCase = extent.createTest("12.MATERIAL-IMPORT-BUTTON-OPACITY");
			try {
				AssertJUnit.assertEquals(Actualopacity, Expectedopacity);
				testCase.log(Status.INFO, "ActualTextTransformation :- " + Actualopacity);
				testCase.log(Status.INFO, "ExpectedTextTransformation :- " + Expectedopacity);
				testCase.log(Status.PASS, "correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualTextTransformation :- " + Actualopacity);
				testCase.log(Status.INFO, "ExpectedTextTransformation :- " + Expectedopacity);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("12.MATERIAL-IMPORT-BUTTON-OPACITY");
			testCase.log(Status.FAIL, "No Element");
		}

//Material Import Button HEIGHT

		try {
			String ActualHeight = EmployeeImportPage.MaterialImportButton.getCssValue("height");
			System.out.println("Height :" + ActualHeight);
			String ExpectedHeight = "32px";
			testCase = extent.createTest("13.MATERIAL-IMPORT-BUTTON-HEIGHT");
			try {
				AssertJUnit.assertEquals(ActualHeight, ExpectedHeight);
				testCase.log(Status.INFO, "ActualLineHeight :- " + ActualHeight);
				testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedHeight);
				testCase.log(Status.PASS, "correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualLineHeight :- " + ActualHeight);
				testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedHeight);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("13.MATERIAL-IMPORT-BUTTON-HEIGHT");
			testCase.log(Status.FAIL, "No element");
		}

//Material Import Button Width

		try {
			String Actualwidth = EmployeeImportPage.MaterialImportButton.getCssValue("width");
			System.out.println("width :" + Actualwidth);

			String Expectedwidth = "95.5781px";
			testCase = extent.createTest("14.MATERIAL-IMPORT-BUTTON-WIDTH");
			try {
				AssertJUnit.assertEquals(Actualwidth, Expectedwidth);
				testCase.log(Status.INFO, "Actualwidth :- " + Actualwidth);
				testCase.log(Status.INFO, "Expectedwidth  :- " + Expectedwidth);
				testCase.log(Status.PASS, "correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actualwidth  :- " + Actualwidth);
				testCase.log(Status.INFO, "Expectedwidth  :- " + Expectedwidth);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("14.MATERIAL-IMPORT-BUTTON-WIDTH");
			testCase.log(Status.FAIL, "No element");
		}

//Material Import Button Font-weight

		try {
			String Actualweight = EmployeeImportPage.MaterialImportButton.getCssValue("font-weight");
			System.out.println("16.Font-weight :" + Actualweight);
			String Expectedweight = "400";
			testCase = extent.createTest("15.MATERIAL-IMPORT-BUTTON-FONT-WEIGHT");
			try {
				AssertJUnit.assertEquals(Actualweight, Expectedweight);
				testCase.log(Status.INFO, "Actualfontweight :- " + Actualweight);
				testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
				testCase.log(Status.PASS, "correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actualfontweight :- " + Actualweight);
				testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase.log(Status.FAIL, "No Element");
			testCase = extent.createTest("15.MATERIAL-IMPORT-BUTTON-FONT-WEIGHT");
		}
		Thread.sleep(2000);
		// EmployeeImportPage.ImportButton.click();
	}

	/** Material --> Material --> ExportButton **/

	@Test
	public void MaterialExportButton() throws InterruptedException {
		testCase = extent.createTest("Step5:- MATERIAL-EXPORT-BUTTON UI PROPERTIES");
		try {
			boolean ExpectedTextVisible = true;
			System.out.println("IsVisible");
			boolean ActualTextVisible = EmployeeImportPage.MaterialExportButton.isDisplayed();
			testCase = extent.createTest("1-MATERIAL-EXPORT-BUTTON-VISIBLE");
			try {
				// ExpectedTextVisible=false;
				Assert.assertEquals(ActualTextVisible, ExpectedTextVisible);
				testCase.log(Status.INFO, "Actual Visible :- " + ActualTextVisible);
				testCase.log(Status.INFO, "Expected Visible :- " + ExpectedTextVisible);
				testCase.log(Status.PASS, " Correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualVisible :- " + ActualTextVisible);
				testCase.log(Status.INFO, "Expected Visible :- " + ExpectedTextVisible);
				testCase.log(Status.FAIL, "Wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("1-MATERIAL-EXPORT-BUTTON-VISIBLE");
			testCase.log(Status.FAIL, "No element");
		}

//Material Export Button FONT-COLOR

		try {
			String ActualTitleFontColor = EmployeeImportPage.MaterialExportButton.getCssValue("color");
			System.out.println("Font color of button: " + ActualTitleFontColor);
			String ExpectedTitleFontColor = "rgba(255, 255, 255, 1)";
			testCase = extent.createTest("2.MATERIAL-EXPORT-BUTTON-FONT-COLOUR");

			try {
				AssertJUnit.assertEquals(ActualTitleFontColor, ExpectedTitleFontColor);
				testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
				testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
				testCase.log(Status.INFO, "Correct font Colour");
				testCase.log(Status.PASS, "Correct font Colour");

			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
				testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
				testCase.log(Status.INFO, "wrong font Colour");
				testCase.log(Status.FAIL, "wrong font Colour");
			}
		} catch (Exception e) {
			testCase = extent.createTest("2.MATERIAL-EXPORT-BUTTON-FONT-COLOUR");
			testCase.log(Status.FAIL, "No element");
		}

//Material Export Button FONTSIZE

		try {
			String ActualTitleFontsSize = EmployeeImportPage.MaterialExportButton.getCssValue("font-size");
			System.out.println("Font Size: " + ActualTitleFontsSize);
			String ExpectedTitleFontsSize = "14px";
			testCase = extent.createTest("3.MATERIAL-EXPORT-BUTTON-FONT-SIZE");
			try {
				AssertJUnit.assertEquals(ActualTitleFontsSize, ExpectedTitleFontsSize);
				testCase.log(Status.INFO, "ActualfontSize :-" + ActualTitleFontsSize);
				testCase.log(Status.INFO, "ExpectedfontSize:-" + ExpectedTitleFontsSize);
				testCase.log(Status.PASS, "Correct font-size");
				testCase.log(Status.PASS, " Font-size Correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualfontsSize :- " + ActualTitleFontsSize);
				testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedTitleFontsSize);
				testCase.log(Status.INFO, "Wrong font-size");
				testCase.log(Status.FAIL, "Font-size Wrong");

			}
		} catch (Exception e) {
			testCase = extent.createTest("3.MATERIAL-EXPORT-BUTTON-FONT-SIZE");
			testCase.log(Status.FAIL, "No Element");
		}

//Material Export Button Font-Family 

		try {
			String ActualElementfamily = EmployeeImportPage.MaterialExportButton.getCssValue("font-family");
			System.out.println("FONT-FAMILY: " + ActualElementfamily);
			String ExpectedElementFamily = "Roboto, sans-serif";
			testCase = extent.createTest("4.MATERIAL-EXPORT-BUTTON-FONT-FAMILY");
			try {
				Assert.assertEquals(ActualElementfamily, ExpectedElementFamily);
				testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
				testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
				testCase.log(Status.PASS, "Correct Text");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
				testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
				testCase.log(Status.FAIL, "wrong Text");
			}
		} catch (Exception e) {
			testCase = extent.createTest("4.MATERIAL-EXPORT-BUTTON-FONT-FAMILY");
			testCase.log(Status.FAIL, "NO ELEMENT");
		}

//Material Export Button Spelling	

		try {
			String AcctualTitleText = EmployeeImportPage.MaterialExportButton.getText();
			String ExpectedTitleText = "Add SBU";
			System.out.println(" Text:" + AcctualTitleText);
			testCase = extent.createTest("5.MATERIAL-EXPORT-BUTTON-SPELLING-TEXT");
			try {

				testCase.log(Status.INFO, "AcctualText :- " + AcctualTitleText);
				testCase.log(Status.INFO, "ExpectedText :- " + ExpectedTitleText);
				testCase.log(Status.PASS, "Correct element");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "AcctualText :- " + AcctualTitleText);
				testCase.log(Status.INFO, "ExpectedText :- " + ExpectedTitleText);

				testCase.log(Status.FAIL, "Wrong Element");
			}
		} catch (Exception e) {
			testCase = extent.createTest("5.MATERIAL-EXPORT-BUTTON-SPELLING-TEXT");
			testCase.log(Status.FAIL, "No Element");
		}

//Material Export Button Position

		try {
			Point ActulalLocation = EmployeeImportPage.MaterialExportButton.getLocation();
			int actual_x = ActulalLocation.getX();
			int actual_y = ActulalLocation.getY();
			System.out.println("X axis: " + actual_x);
			System.out.println("Y axis: " + actual_y);
			Point ExpectedLocation = new Point(1126, 91);

			testCase = extent.createTest("6.MATERIAL-EXPORT-BUTTON-POSITION");
			try {
				AssertJUnit.assertEquals(ActulalLocation, ExpectedLocation);
				testCase.log(Status.INFO, "ActualFontSize :- " + ActulalLocation);
				testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
				testCase.log(Status.PASS, "Correct Location");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualSize :- " + ActulalLocation);
				testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
				testCase.log(Status.FAIL, "Wrong Location");
			}
		} catch (Exception e) {
			testCase = extent.createTest("6.MATERIAL-EXPORT-BUTTON-POSITION");
			testCase.log(Status.FAIL, "NO ELEMENT");

		}

//Material Export Button Padding 

		try {
			String Actualpadding = EmployeeImportPage.MaterialExportButton.getCssValue("padding");
			System.out.println("PADDING: " + Actualpadding);
			String Expectedpadding = "4px 16px";
			testCase = extent.createTest("7.MATERIAL-EXPORT-BUTTON-TEXT-PADDING");
			try {
				Assert.assertEquals(Actualpadding, Expectedpadding);
				testCase.log(Status.INFO, "Actual padding :- " + Actualpadding);
				testCase.log(Status.INFO, "Expected padding :- " + Expectedpadding);
				testCase.log(Status.PASS, "padding is Correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual padding :- " + Actualpadding);
				testCase.log(Status.INFO, "Expected padding :- " + Expectedpadding);
				testCase.log(Status.FAIL, "padding is Wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("7.MATERIAL-EXPORT-BUTTON-PADDING");
			testCase.log(Status.FAIL, "NO ELEMENT");
		}

//Material Export Button Shadow

		try {
			String Actualshadow = EmployeeImportPage.MaterialExportButton.getCssValue("box-shadow");
			System.out.println("Text Shadow :" + Actualshadow);
			String ExpectedShadow = "rgba(0, 0, 0, 0.043) 0px 2px 0px 0px";
			testCase = extent.createTest("8.MATERIAL-EXPORT-BUTTON-BOX-SHADOW");
			try {
				AssertJUnit.assertEquals(Actualshadow, ExpectedShadow);
				testCase.log(Status.INFO, "ActualShadow :- " + Actualshadow);
				testCase.log(Status.INFO, "ExpectedShadow :- " + ExpectedShadow);
				testCase.log(Status.PASS, "Shadow available");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualShadow :- " + Actualshadow);
				testCase.log(Status.INFO, "ExpectedShadow :- " + ExpectedShadow);
				testCase.log(Status.FAIL, "Shadow not available");
			}
		} catch (Exception e) {
			testCase = extent.createTest("8.MATERIAL-EXPORT-BUTTON-BOX-SHADOW");
			testCase.log(Status.FAIL, "No Element");
		}

//Material Export Button Background Color

		try {
			String Actualbackground = EmployeeImportPage.MaterialExportButton.getCssValue("color");
			System.out.println("BACKGROUND COLOR:" + Actualbackground);
			String Expectedbackground = "rgba(255, 255, 255, 1)";

			testCase = extent.createTest("9.MATERIAL-EXPORT-BUTTON-BACKGROUND COLOR");
			try {
				AssertJUnit.assertEquals(Actualbackground, Expectedbackground);

				testCase.log(Status.INFO, "Actualbackgroundcolor :- " + Actualbackground);
				testCase.log(Status.INFO, "Expectedbackgroundcolor :- " + Expectedbackground);
				testCase.log(Status.PASS, "correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actualbackgroundcolor :- " + Actualbackground);
				testCase.log(Status.INFO, "Expectedbackgroundcolor:- " + Expectedbackground);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase.log(Status.FAIL, "No Element");
			testCase = extent.createTest("9.MATERIAL-EXPORT-BUTTON-BACKGROUND COLOR");
		}

//Material Export Button BORDER COLOR
		try {
			String actualbordercolor = EmployeeImportPage.MaterialExportButton.getCssValue("border-color");
			System.out.println(" border-color:" + actualbordercolor);
			String Expectedbordercolor = "rgb(255, 255, 255)";
			testCase = extent.createTest("10.EMPLOYEE-EXPORT-BUTTON-BORDER-COLOR");
			try {
				AssertJUnit.assertEquals(actualbordercolor, Expectedbordercolor);
				testCase.log(Status.INFO, "Actualbordercolor :- " + actualbordercolor);
				testCase.log(Status.INFO, "Expectedbordercolor :- " + Expectedbordercolor);
				testCase.log(Status.PASS, "correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actualbordercolor :- " + actualbordercolor);
				testCase.log(Status.INFO, "Expectedbordercolor :- " + Expectedbordercolor);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase.log(Status.FAIL, "NO ELEMENT");
			testCase = extent.createTest("10.EMPLOYEE-EXPORT-BUTTON-BORDER-COLOR");
		}

//Material Export Button CURSER POINT	 

		try {
			String ActualCursor = EmployeeImportPage.MaterialExportButton.getCssValue("cursor");
			System.out.println("cursor :" + ActualCursor);
			String Expectedcursor = "pointer";
			testCase = extent.createTest("11.EMPLOYEE-EXPORT-BUTTON-CURSOR");
			try {
				AssertJUnit.assertEquals(ActualCursor, Expectedcursor);
				testCase.log(Status.INFO, "ActualCursor :- " + ActualCursor);
				testCase.log(Status.INFO, "ActualCursor:- " + Expectedcursor);
				testCase.log(Status.PASS, "correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualCursor :- " + ActualCursor);
				testCase.log(Status.INFO, "ActualCursor :- " + Expectedcursor);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase.log(Status.FAIL, "No Element");
			testCase = extent.createTest("11.EMPLOYEE-EXPORT-BUTTON-CURSOR");
		}

//Material Export Button OPACITY 

		try {
			String Actualopacity = EmployeeImportPage.MaterialExportButton.getCssValue("opacity");
			System.out.println("OPACITY :" + Actualopacity);

			String Expectedopacity = "1";
			testCase = extent.createTest("12.EMPLOYEE-EXPORT-BUTTON-OPACITY");
			try {
				AssertJUnit.assertEquals(Actualopacity, Expectedopacity);
				testCase.log(Status.INFO, "ActualTextTransformation :- " + Actualopacity);
				testCase.log(Status.INFO, "ExpectedTextTransformation :- " + Expectedopacity);
				testCase.log(Status.PASS, "correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualTextTransformation :- " + Actualopacity);
				testCase.log(Status.INFO, "ExpectedTextTransformation :- " + Expectedopacity);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("12.EMPLOYEE-EXPORT-BUTTON-OPACITY");
			testCase.log(Status.FAIL, "No Element");
		}

//Material Export Button HEIGHT

		try {
			String ActualHeight = EmployeeImportPage.MaterialExportButton.getCssValue("height");
			System.out.println("Height :" + ActualHeight);
			String ExpectedHeight = "32px";
			testCase = extent.createTest("13.EMPLOYEE-EXPORT-BUTTON-HEIGHT");
			try {
				AssertJUnit.assertEquals(ActualHeight, ExpectedHeight);
				testCase.log(Status.INFO, "ActualLineHeight :- " + ActualHeight);
				testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedHeight);
				testCase.log(Status.PASS, "correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualLineHeight :- " + ActualHeight);
				testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedHeight);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("13.EMPLOYEE-EXPORT-BUTTON-HEIGHT");
			testCase.log(Status.FAIL, "No element");
		}

//Material Export Button Width

		try {
			String Actualwidth = EmployeeImportPage.MaterialExportButton.getCssValue("width");
			System.out.println("width :" + Actualwidth);

			String Expectedwidth = "94.3906px";
			testCase = extent.createTest("14.EMPLOYEE-EXPORT-BUTTON-WIDTH");
			try {
				AssertJUnit.assertEquals(Actualwidth, Expectedwidth);
				testCase.log(Status.INFO, "Actualwidth :- " + Actualwidth);
				testCase.log(Status.INFO, "Expectedwidth  :- " + Expectedwidth);
				testCase.log(Status.PASS, "correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actualwidth  :- " + Actualwidth);
				testCase.log(Status.INFO, "Expectedwidth  :- " + Expectedwidth);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("14.EMPLOYEE-EXPORT-BUTTON-WIDTH");
			testCase.log(Status.FAIL, "No element");
		}

//Material Export Button Font-weight

		try {
			String Actualweight = EmployeeImportPage.MaterialExportButton.getCssValue("font-weight");
			System.out.println("16.Font-weight :" + Actualweight);
			String Expectedweight = "400";
			testCase = extent.createTest("15.EMPLOYEE-EXPORT-BUTTON-FONT-WEIGHT");
			try {
				AssertJUnit.assertEquals(Actualweight, Expectedweight);
				testCase.log(Status.INFO, "Actualfontweight :- " + Actualweight);
				testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
				testCase.log(Status.PASS, "correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actualfontweight :- " + Actualweight);
				testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase.log(Status.FAIL, "No Element");
			testCase = extent.createTest("15.EMPLOYEE-EXPORT-BUTTON-FONT-WEIGHT");
		}
		Thread.sleep(2000);
		// EmployeeImportPage.ExportButton.click();
	}

	//Material SBU CSV Export
	@Test
	public static void MaterialSBUFilter() throws InterruptedException {
		
		Thread.sleep(3000);
		EmployeeImportPage.SBUIcon.click();
		
		Thread.sleep(2000);
		EmployeeImportPage.SBUFilterInput.sendKeys("INNOVATION");
		
		Thread.sleep(2000);
		EmployeeImportPage.SBUSearchButton.click();
		
		Thread.sleep(2000);
		EmployeeImportPage.MaterialExportButton.click();
		
		File fileLocation = new File("C:\\Users\\hp\\Downloads");
		boolean isFileExist = false;
		// List the total files
		File[] totalFiles = fileLocation.listFiles();
		for (File file : totalFiles) {
			if (file.getName().equals("material.csv")) {
				System.out.println("File is downloaded");
				// if find the file name stop the loop
				isFileExist = true;
				break;

			}
		}
		testCase = extent.createTest("Step3: MATERIAL SBU EXPORT");
		boolean Expectedweight = true;
		testCase = extent.createTest("1.MATERIAL SBU EXPORT FILE NAME");
		if (isFileExist == true) {
			AssertJUnit.assertEquals(isFileExist, Expectedweight);
			System.out.println(isFileExist);
			System.out.println(Expectedweight);
			testCase.log(Status.INFO, "Actualfontweight :- " + isFileExist);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
			testCase.log(Status.PASS, "correct");
		} else {
			testCase.log(Status.INFO, "Actualfontweight :- " + isFileExist);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
			testCase.log(Status.FAIL, "wrong");
		}
		EmployeeImportPage.SBUSearchResetAllButton.click();
	}
	
	
	//Material Plant CSV Export
		@Test
		public static void MaterialPlantFilter() throws InterruptedException {
			
			Thread.sleep(3000);
			EmployeeImportPage.PlantIcon.click();
			
			Thread.sleep(2000);
			EmployeeImportPage.PlantFilterInput.sendKeys("Trincomalee Innovation plant");
			
			Thread.sleep(2000);
			EmployeeImportPage.PlantSearchButton.click();
			
			Thread.sleep(2000);
			EmployeeImportPage.MaterialExportButton.click();
			
			File fileLocation = new File("C:\\Users\\hp\\Downloads");
			boolean isFileExist = false;
			// List the total files
			File[] totalFiles = fileLocation.listFiles();
			for (File file : totalFiles) {
				if (file.getName().equals("material.csv")) {
					System.out.println("File is downloaded");
					// if find the file name stop the loop
					isFileExist = true;
					break;

				}
			}
			testCase = extent.createTest("Step4: MATERIAL PLANT EXPORT");
			boolean Expectedweight = true;
			testCase = extent.createTest("1.MATERIAL PLANT EXPORT FILE NAME");
			if (isFileExist == true) {
				AssertJUnit.assertEquals(isFileExist, Expectedweight);
				System.out.println(isFileExist);
				System.out.println(Expectedweight);
				testCase.log(Status.INFO, "Actualfontweight :- " + isFileExist);
				testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
				testCase.log(Status.PASS, "correct");
			} else {
				testCase.log(Status.INFO, "Actualfontweight :- " + isFileExist);
				testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
				testCase.log(Status.FAIL, "wrong");
			}
			EmployeeImportPage.SBUSearchResetAllButton.click();
		}
	
// Import CSV
	public static void UploadCSV() throws InterruptedException, AWTException, IOException {
		Thread.sleep(3000);
		EmployeeImportPage.MaterialImportButton.click();

//		Thread.sleep(2000);
//		String file = "C:\\Users\\hp\\Downloads\\material.csv";
//
//		StringSelection selection = new StringSelection(file);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
//
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		Thread.sleep(3000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);

		// EmployeeImportPage.MaterialImportButton.sendKeys("D:\QDMS-AUTOMATION\QDMS-Semi\src\test\resources\files\Plant SBU.csv");
		// Thread.sleep(3000);

		
	      // Navigate to the web page containing the CSV upload form
       // driver.get("https://example.com/upload");

        // Read the contents of the CSV file into a string
        BufferedReader reader = new BufferedReader(new FileReader("D:\\QDMS-AUTOMATION\\QDMS-Semi\\src\\test\\resources\\files\\Plant SBU.csv"));
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append("\n");
        }
        String csvContents = stringBuilder.toString();
        reader.close();

        // Copy the contents of the CSV file to the clipboard
        StringSelection selection = new StringSelection(csvContents);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

        // Find the text field element and paste the contents of the clipboard
        WebElement textField = driver.findElement(By.id("text-field"));
        textField.sendKeys(Keys.chord(Keys.CONTROL, "v"));

        // Submit the form
        WebElement submitButton = driver.findElement(By.id("submit-button"));
        submitButton.click();

        // Wait for the page to load after submitting the form
        // This may vary depending on the website
        // For example:
        // WebDriverWait wait = new WebDriverWait(driver, 10);
        // wait.until(ExpectedConditions.titleIs("Upload Successful"));

        // Close the browser
        driver.quit();
    }

	

	/** Export Data CSV File */
	public static void ExportCSV() throws InterruptedException {

		EmployeeImportPage.MaterialExportButton.click();

		Thread.sleep(3000);

		File fileLocation = new File("C:\\Users\\hp\\Downloads");
		boolean isFileExist = false;
		// List the total files
		File[] totalFiles = fileLocation.listFiles();
		for (File file : totalFiles) {
			if (file.getName().equals("material.csv")) {
				System.out.println("File is downloaded");
				// if find the file name stop the loop
				isFileExist = true;
				break;

			}
		}
		testCase = extent.createTest("Step2: MATERIAL EXPORT FILE ");
		boolean Expectedweight = true;
		testCase = extent.createTest("1.EXPORT FILE ");
		if (isFileExist == true) {
			AssertJUnit.assertEquals(isFileExist, Expectedweight);
			System.out.println(isFileExist);
			System.out.println(Expectedweight);
			testCase.log(Status.INFO, "Actualfontweight :- " + isFileExist);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
			testCase.log(Status.PASS, "correct");
		} else {
			testCase.log(Status.INFO, "Actualfontweight :- " + isFileExist);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
			testCase.log(Status.FAIL, "wrong");
		}
	}

	/** Import Data from CSV File */

	public static void ImportCSV() throws InterruptedException, FileNotFoundException {

		String filename = "D:\\QDMS-AUTOMATION\\QDMS-Semi\\src\\test\\resources\\files\\material.csv";
		// Read the CSV File
		CSVReader reader = new CSVReader(new FileReader(filename));
		String[] celll = null;

		for (int i = 0; i < 1; i++) {
			System.out.println(celll[i]);
			System.out.println(celll[i + 1]);
			System.out.println(celll[i + 2]);

		}

	}

	public static void SBUTableDataFilter() {
		PageFactory.initElements(driver, table);
	
		
		// locate the table element
				WebElement table = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div/div[2]/div[2]"));

				// get all rows of the table
				List<WebElement> rows = table.findElements(By.tagName("tr"));

				// loop through each row
				for (WebElement row : rows) {
				    // get all cells in the row
				    List<WebElement> cells = row.findElements(By.tagName("td"));
				    

				    for (int i = 0; i < cells.size(); i++) {
				    
				    	// check if this is the 8th cell
				    	if (i == 8) {
				    		// print the text of the 8th cell			    	
					    	String da=cells.get(i).getText();
					    	System.out.println(da);
					    	//break;
				    	}
				    }
			}
}
	
	

	/** Customer --> Delivery **/
	
	@Test
	public static void DeliveryButton() throws InterruptedException {
		// home button
		Thread.sleep(4000);
		EmployeeImportPage.NavHomeButton.click();

		// Click on Master card
		Thread.sleep(2000);
		EmployeeImportPage.master.click();

		// Click on LogoutAdmin Button
		Thread.sleep(2000);
		EmployeeImportPage.NavCustomer.click();

		// Click on Logout Button
		Thread.sleep(2000);
		EmployeeImportPage.LeftDelivery.click();

	}

	/*************************************************************************/
	/*** Pagination for Delivery */
	@Test
	public static void DefaultIndexPage() throws InterruptedException {

		// Default Index Page
		Thread.sleep(2000);
		testCase = extent.createTest("Step6:PAGINATION ");
		boolean ActualDefaultPageIndex = EmployeeImportPage.DefaultPaginationPage.isDisplayed();
		boolean ExpectedDefaultPageIndex = true;
		testCase = extent.createTest("1.PAGINATION-DEFAULT-PAGE-INDEX");
		try {
			Assert.assertEquals(ActualDefaultPageIndex, ExpectedDefaultPageIndex);
			testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualDefaultPageIndex);
			testCase.log(Status.INFO, "Expected Default Index Page :- " + ExpectedDefaultPageIndex);
			testCase.log(Status.PASS, "Correct Default Index Page");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualDefaultPageIndex);
			testCase.log(Status.INFO, "Expected Default Index Page:- " + ExpectedDefaultPageIndex);
			testCase.log(Status.FAIL, "Wrong Default Index Page");

		}
	}

	@Test
	public static void RefreshDefaultPage() throws InterruptedException {

		EmployeeImportPage.NextPageBtn.click();
		Thread.sleep(20000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		boolean ActualDefaultPageIndex1 = EmployeeImportPage.DefaultPaginationPage.isDisplayed();
		boolean ExpectedDefaultPageIndex1 = true;
		testCase = extent.createTest("2.PAGINATION-REFERESH-INTO-DEFAULT-PAGE");
		try {
			Assert.assertEquals(ActualDefaultPageIndex1, ExpectedDefaultPageIndex1);
			testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualDefaultPageIndex1);
			testCase.log(Status.INFO, "Expected Default Index Page :- " + ExpectedDefaultPageIndex1);
			testCase.log(Status.PASS, "Correct Default Index Page");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualDefaultPageIndex1);
			testCase.log(Status.INFO, "Expected Default Index Page:- " + ExpectedDefaultPageIndex1);
			testCase.log(Status.FAIL, "Wrong Default Index Page");
		}
	}

//	Page Redirect to the next page 

	@Test
	public static void PageRedrict() throws InterruptedException {

		EmployeeImportPage.NextPageBtn.click();
		Thread.sleep(2000);
		boolean ActualSecoundPageIndex = EmployeeImportPage.PaginationSecoundPage.isDisplayed();
		boolean ExpectedSecoundPageIndex = true;
		testCase = extent.createTest("3.PAGINATION-PAGE-REDIRECT-TO-NEXT-PAGE");
		try {
			Assert.assertEquals(ActualSecoundPageIndex, ExpectedSecoundPageIndex);
			testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualSecoundPageIndex);
			testCase.log(Status.INFO, "Expected Default Index Page :- " + ExpectedSecoundPageIndex);
			testCase.log(Status.PASS, "Correct Default Index Page");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualSecoundPageIndex);
			testCase.log(Status.INFO, "Expected Default Index Page:- " + ExpectedSecoundPageIndex);
			testCase.log(Status.FAIL, "Wrong Default Index Page");
		}
	}

//	Previous Button Displayed
	@Test
	public static void PreButtonDispaly() throws InterruptedException {

		boolean ActualVisiblePreviousButton = EmployeeImportPage.PreviousPageBtn.isDisplayed();
		boolean ExpectedVisiblePreviousButton = true;
		testCase = extent.createTest("4.PAGINATION-PREVIOUS-BUTTON-VISIBLE");
		try {
			Assert.assertEquals(ActualVisiblePreviousButton, ExpectedVisiblePreviousButton);
			testCase.log(Status.INFO, "ActualElement :- " + ActualVisiblePreviousButton);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisiblePreviousButton);
			testCase.log(Status.INFO, "Element Available");
			testCase.log(Status.PASS, "Correct element");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualElement :- " + ActualVisiblePreviousButton);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisiblePreviousButton);
			testCase.log(Status.INFO, "Element not available");
			testCase.log(Status.FAIL, "Not Visible Element");
		}
	}

//	Next Button Displayed
	@Test
	public static void NextButtonDispaly() throws InterruptedException {

		boolean ActualVisibleNextButton = EmployeeImportPage.NextPageBtn.isDisplayed();
		boolean ExpectedVisibleNextButton = true;
		testCase = extent.createTest("5.PAGINATION-NEXT-BUTTON-VISIBLE");
		try {
			Assert.assertEquals(ActualVisibleNextButton, ExpectedVisibleNextButton);
			testCase.log(Status.INFO, "ActualElement :- " + ActualVisibleNextButton);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisibleNextButton);
			testCase.log(Status.INFO, "Element Available");
			testCase.log(Status.PASS, "Correct element");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualElement :- " + ActualVisibleNextButton);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisibleNextButton);
			testCase.log(Status.INFO, "Element not available");
			testCase.log(Status.FAIL, "Not Visible Element");
		}
	}

//Next Button Enable
	@Test
	public static void NextButtonEanble() throws InterruptedException {

		boolean ActualNextBtnEnable = EmployeeImportPage.NextPageBtn.isEnabled();
		boolean ExpectedNextBtnEnable = true;
		testCase = extent.createTest("6.PAGINATION-NEXT-BUTTON-ENABLE");
		try {
			Assert.assertEquals(ActualNextBtnEnable, ExpectedNextBtnEnable);
			testCase.log(Status.INFO, "ActualElement :- " + ActualNextBtnEnable);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedNextBtnEnable);
			testCase.log(Status.PASS, "Enable element");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualElement :- " + ActualNextBtnEnable);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedNextBtnEnable);
			testCase.log(Status.FAIL, "Not Enable Element");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

	}

//Before move to 2nd page, previous button disable
	@Test
	public static void SecPagepreButDisable() throws InterruptedException {
		Thread.sleep(2000);
		boolean ActualPreviousBtnDisable = EmployeeImportPage.PreviousPageBtn.isEnabled();
		boolean ExpectedPreviousBtnDisable = false;
		testCase = extent.createTest("7.PAGINATION-PREVIOUS-BUTTON-DISABLE-BEFORE MOVE THE 2ND PAGE");
		try {
			Assert.assertEquals(ActualPreviousBtnDisable, ExpectedPreviousBtnDisable);
			testCase.log(Status.INFO, "ActualElement :- " + ActualPreviousBtnDisable);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPreviousBtnDisable);
			testCase.log(Status.PASS, "Enable element");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualElement :- " + ActualPreviousBtnDisable);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPreviousBtnDisable);
			testCase.log(Status.FAIL, "Not Enable Element");
		}

	}

//	After move to 2nd page, previous button Enable
	@Test
	public static void AfterMovetoSecPagepreButEnable() throws InterruptedException {

		EmployeeImportPage.NextPageBtn.click();
		Thread.sleep(2000);
		boolean ActualPreviousBtnEnable = EmployeeImportPage.PreviousPageBtn.isEnabled();
		boolean ExpectedPreviousBtnEnable = true;
		testCase = extent.createTest("8.PAGINATION-PREVIOUS-BUTTON-DISABLE-AFTER MOVE THE 2ND PAGE");
		try {
			Assert.assertEquals(ActualPreviousBtnEnable, ExpectedPreviousBtnEnable);
			testCase.log(Status.INFO, "ActualElement :- " + ActualPreviousBtnEnable);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPreviousBtnEnable);
			testCase.log(Status.PASS, "Enable element");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualElement :- " + ActualPreviousBtnEnable);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPreviousBtnEnable);
			testCase.log(Status.FAIL, "Not Enable Element");
		}

		driver.navigate().refresh();
		Thread.sleep(2000);
	}

	@Test
	public static void TotalPage() throws InterruptedException {

		int ActualTotalPage = 1;
		boolean Enablity = EmployeeImportPage.NextPageBtn.isEnabled();
		while (Enablity) {
			Thread.sleep(1000);
			EmployeeImportPage.NextPageBtn.click();
			ActualTotalPage = ActualTotalPage + 1;
			if(ActualTotalPage==5)
			{
				Enablity = EmployeeImportPage.NextPageBtn.isEnabled();
				break;
			}
		}
		System.out.println(ActualTotalPage);
		Thread.sleep(2000);
	}

}
