package com.automationpractice.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Selenium-Java\\automationpractice\\src\\main\\java\\com\\automationpractice\\features\\Test.feature", glue = {
		"com/automationpractice/stepdefinationfile" }, format = { "pretty", "html:test-output",
				"json:json_output/cucumber.json",
				"junit:junit_xml/cucumber.xml" }, monochrome = true, strict = true, dryRun = false, tags = { "@test" })
public class Runner {

}
