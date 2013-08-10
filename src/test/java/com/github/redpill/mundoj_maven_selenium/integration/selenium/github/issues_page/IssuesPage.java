package com.github.redpill.mundoj_maven_selenium.integration.selenium.github.issues_page;


public class IssuesPage extends IssuesPageNavigation {

    public boolean verifyClickedEveryonesIssuesLink() {
	clickEveryonesIssuesLink();

	return "https://github.com/redpill/mundoj-maven-selenium/issues?state=open"
		.equals(getDriver().getCurrentUrl());
    }

    public IssuesPage() {
	super();
    }
}
