package com.github.redpill.mundoj_maven_selenium.test.core.github;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.github.redpill.mundoj_maven_selenium.test.core.github.navigation.StartProjectPageNavigation;

public class StartProjectPage extends StartProjectPageNavigation {

    public boolean openHomePage() {

	return "https://github.com/redpill/mundoj-maven-selenium"
		.equals(getDriver().getCurrentUrl());
    }

    public boolean verifyReadme() {
	final WebElement readme = getDriver().findElement(By.id("readme"));

	return !(null == readme.getText() && "".equals(readme.getText()));
    }

    public boolean verifyIssuesLink() {
	final WebElement issues = getDriver().findElement(
		By.partialLinkText("Issues"));

	return !(null == issues.getText() && "".equals(issues.getText()));
    }

    public boolean verifyClickedIssuesLink() {
	clickIssuesLink();

	return "https://github.com/redpill/mundoj-maven-selenium/issues"
		.equals(getDriver().getCurrentUrl());
    }

    public StartProjectPage() {
	super();
    }
}
