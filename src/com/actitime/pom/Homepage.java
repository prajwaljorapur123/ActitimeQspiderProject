package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(id="logoutLink")
	private WebElement lobtn;
	
	@FindBy(id="container_tasks")
	private WebElement taskbtn;
	
	
	@FindBy(id="container_tasks")
	private WebElement tasktab;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clicktask()
	{
		taskbtn.click();
	}
	
	public void setLogout()
	{
		
		lobtn.click();
	}
	
	public void settask()
	{
		taskbtn.click();
	}
	

}
