package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class LanguagesPageElements extends CommonMethods{
	@FindBy(xpath="//a[@id='menu_admin_viewAdminModule']")
	public WebElement clickOnAdmin;
	
	@FindBy(xpath="//a[@id='menu_admin_Qualifications']")
	public WebElement cliclOnQualifications;
	
	@FindBy(xpath="//a[@id='menu_admin_viewLanguages']")
	public WebElement clickOnLanguages;
	
	@FindBy(xpath="//input[@id='btnAdd']")
	public WebElement add;
	
	@FindBy(xpath="//input[@id='language_name']")
	public WebElement typeLanguages;
	
    @FindBy(xpath="//input[@id='btnSave']")
    public WebElement btnSave;
	
 public LanguagesPageElements() {
	 PageFactory.initElements(BaseClass.driver, this);
 }
	
}
