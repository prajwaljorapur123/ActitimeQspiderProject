package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskList {
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addbtn;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement addcustomerbtn;
	
	@FindBy(xpath="//input[@placeholder=\"Enter Customer Name\" and @class]")
	private WebElement customertb;
	
	@FindBy(xpath="//textarea[@placeholder=\"Enter Customer Description\" ]")
	private WebElement customerdescription;
	
	
	@FindBy(xpath="//div[@class=\"emptySelection\"]")
	private WebElement clickdropdown;
	
	@FindBy(xpath="//div[.='Big Bang Company' and @class=\"itemRow cpItemRow \"]")
	private WebElement selectdropdown;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement clickcreate;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualCustomerCreated;

	
	public TaskList(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getAddbtn() {
		return addbtn;
	}


	public WebElement getAddcustomerbtn() {
		return addcustomerbtn;
	}


	public WebElement getCustomertb() {
		return customertb;
	}


	public WebElement getCustomerdescription() {
		return customerdescription;
	}


	public WebElement getClickdropdown() {
		return clickdropdown;
	}


	public WebElement getSelectdropdown() {
		return selectdropdown;
	}
	
	public WebElement getClickCreate() {
		return clickcreate;
	}
	public WebElement getActualCustomerCreated() {
		return actualCustomerCreated;
	}
}
