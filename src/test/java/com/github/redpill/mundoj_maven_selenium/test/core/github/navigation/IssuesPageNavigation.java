package com.github.redpill.mundoj_maven_selenium.test.core.github.navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.github.redpill.mundoj_maven_selenium.test.core.BaseTest;

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
