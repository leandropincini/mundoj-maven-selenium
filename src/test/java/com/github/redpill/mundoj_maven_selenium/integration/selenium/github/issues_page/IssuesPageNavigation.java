package com.github.redpill.mundoj_maven_selenium.integration.selenium.github.issues_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.github.redpill.mundoj_maven_selenium.core.BaseTest;

public class IssuesPageNavigation extends BaseTest {

    public void clickEveryonesIssuesLink() {
	final WebElement link = getDriver().findElement(
		By.partialLinkText("Everyone’s Issues"));
	link.click();
    }

    public IssuesPageNavigation() {
	super();
	setURL("/issues");
    }
}
