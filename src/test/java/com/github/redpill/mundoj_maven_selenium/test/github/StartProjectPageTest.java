package com.github.redpill.mundoj_maven_selenium.test.github;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.github.redpill.mundoj_maven_selenium.test.core.category.SeleniumCategory;
import com.github.redpill.mundoj_maven_selenium.test.core.github.StartProjectPage;

@Category(SeleniumCategory.class)
public class StartProjectPageTest extends StartProjectPage {

    @Test
    public void openHomePageTest() {
	Assert.assertTrue(openHomePage());
    }

    public StartProjectPageTest() {
	super();
    }
}
