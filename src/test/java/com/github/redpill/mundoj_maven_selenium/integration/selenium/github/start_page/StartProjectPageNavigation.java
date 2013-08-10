package com.github.redpill.mundoj_maven_selenium.integration.selenium.github.start_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.github.redpill.mundoj_maven_selenium.core.BaseTest;

public class StartProjectPageNavigation extends BaseTest {

    public void clickIssuesLink() {
	final WebElement link = getDriver().findElement(
		By.partialLinkText("Issues"));
	link.click();
    }

    public StartProjectPageNavigation() {
	super();
	setURL("");
    }
}
