package com.github.redpill.mundoj_maven_selenium.unit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.experimental.categories.Category;

import com.github.redpill.mundoj_maven_selenium.core.category.JUnitCategory;

/**
 * Unit test for simple App.
 */
@Category(JUnitCategory.class)
public class AppTest extends TestCase {
    /**
     * Create the test case
     * 
     * @param testName
     *            name of the test case
     */
    public AppTest(final String testName) {
	super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
	return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
	assertTrue(true);
    }
}
