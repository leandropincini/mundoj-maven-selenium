package com.github.redpill.mundoj_maven_selenium.selenium.github;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.github.redpill.mundoj_maven_selenium.core.category.SeleniumFastCategory;

@Category(SeleniumFastCategory.class)
public class IssuesPageTest extends IssuesPage {

    @Test
    public void verifyClickedEveryonesIssuesLinkTest() {
	Assert.assertTrue(verifyClickedEveryonesIssuesLink());
    }
}
