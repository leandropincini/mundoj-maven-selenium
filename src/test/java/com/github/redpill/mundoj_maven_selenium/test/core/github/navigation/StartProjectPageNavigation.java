package com.github.redpill.mundoj_maven_selenium.test.core.github.navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.github.redpill.mundoj_maven_selenium.test.core.BaseTest;

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
