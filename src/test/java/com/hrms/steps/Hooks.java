package com.hrms.steps;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

import io.cucumber.java.*;

public class Hooks {
	@Before
	public static void start() {
		BaseClass.setUp();
	}

	@After
	public static void end(Scenario scenario) {
		byte[] pic;
		if (scenario.isFailed()) {
			pic = CommonMethods.takeScreenshot("failed/" + scenario.getName());
		} else {
			pic = CommonMethods.takeScreenshot("passed/" + scenario.getName());
		}
		scenario.attach(pic, "image/png", scenario.getName());
		BaseClass.tearDown();

	}
}
