package com.actitime.testscript;

import static org.testng.Assert.fail;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.Homepage;
import com.actitime.pom.TaskList;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CreateCustomer extends BaseClass {
	
	@Test
	public void testcreatecustomer() throws InterruptedException, EncryptedDocumentException, IOException
	{
	FileInputStream fis = new FileInputStream("./data/actitime.xlsx");
	         Workbook wb = WorkbookFactory.create(fis);
	         String customername = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	         String discription = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	       
		Homepage h =new Homepage(driver);
		h.clicktask();
		String ExpectedResult = customername;
		
		
		TaskList t = new TaskList(driver);
		t.getAddbtn().click();
		t.getAddcustomerbtn().click();
		t.getCustomertb().sendKeys(ExpectedResult);
		t.getCustomerdescription().sendKeys(discription);
		t.getClickdropdown().click();
		t.getSelectdropdown();
		t.getClickCreate().click();
		Thread.sleep(5000);
		String ActualResult = t.getActualCustomerCreated().getText();
		System.out.println(ActualResult);
		Assert.assertEquals(ExpectedResult, ActualResult);
	
		
	}

}
