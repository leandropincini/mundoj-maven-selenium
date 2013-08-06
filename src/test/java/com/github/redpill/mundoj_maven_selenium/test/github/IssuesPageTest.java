package com.github.redpill.mundoj_maven_selenium.test.github;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.github.redpill.mundoj_maven_selenium.test.core.category.SeleniumFastCategory;
import com.github.redpill.mundoj_maven_selenium.test.core.github.IssuesPage;

@Category(SeleniumFastCategory.class)
public class IssuesPageTest extends IssuesPage {

    @Test
    public void verifyClickedEveryonesIssuesLinkTest() {
	Assert.assertTrue(verifyClickedEveryonesIssuesLink());
    }
}
