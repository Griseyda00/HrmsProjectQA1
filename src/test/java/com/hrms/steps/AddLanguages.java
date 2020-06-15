package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddLanguages extends CommonMethods {

	@Given("user is logged with valid admin credentials")
	public void user_is_logged_with_valid_admin_credentials() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
	}

	@Given("user navigate to Qualifications page")
	public void user_navigate_to_Qualifications_page() {
		click(languages.clickOnAdmin);
		click(languages.cliclOnQualifications);
		click(languages.clickOnLanguages);
	}

	@Given("user add languages")
	public void user_click_on_add_languages(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> elements = dataTable.asMaps();
		for (Map<String, String> list : elements) {
			click(languages.add);
			wait(1);
			String language1 = list.get("Language1");
			String language2 = list.get("Language2");
			sendText(languages.typeLanguages, language1);
			click(languages.btnSave);
			wait(2);
			click(languages.add);
			wait(2);
			sendText(languages.typeLanguages, language2);
			click(languages.btnSave);

		}
	}

	@Then("user can see language is Displayed and {string}")
	public void user_can_see_language_is_Displayed_and(String string) {
		String expected = "Urdu";

		List<WebElement> savedLanguages = driver.findElements(By.xpath("//table[@id='recordsListTable']/tbody/tr/td "));
		for (WebElement names : savedLanguages) {
			if (names.getText().equals(expected)) {
				String actual = names.getText();
				System.out.println("language is" + actual);
				Assert.assertEquals("language is not added", expected, actual);
			}
		}
		takeScreenshot(string);

	}

}
