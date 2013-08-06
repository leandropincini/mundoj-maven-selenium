package com.github.redpill.mundoj_maven_selenium.test.core.github;

import com.github.redpill.mundoj_maven_selenium.test.core.github.navigation.IssuesPageNavigation;

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
