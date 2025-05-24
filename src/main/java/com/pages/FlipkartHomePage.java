package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base;

public class FlipkartHomePage extends Base{
	
	@FindBy(xpath = "//input[@title='Search for products, brands and more']")
	private WebElement txtSearch;
	
	
	public FlipkartHomePage()
	{
		 PageFactory.initElements(GetDriver(), this);
	}
    
	public void EnterItem()
	{
		this.txtSearch.sendKeys("Mobile");
	}
	
}
