package com.hrms.testbase;


import com.hrms.pages.LanguagesPageElements;
import com.hrms.pages.LoginPageElements;



public class PageInitializer extends BaseClass {
	public static LoginPageElements login;
	public static LanguagesPageElements languages;
	

	public static void initialize() {

		login = new LoginPageElements();
		languages= new LanguagesPageElements();
		

	}
}
