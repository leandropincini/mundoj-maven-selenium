package com.github.redpill.new_jee_skeleton.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.github.redpill.new_jee_skeleton.core.util.PropertyUtil;

public class BaseTest {

    private static final String LOCAL_URL = "http://127.0.0.1:8000/";
    private static final int TIMEOUT = 200;

    private static WebDriver driver;
    private static final String TARGET_URL = PropertyUtil.getTargetURL();
    private static final String TARGET_ENVIRONMENT = PropertyUtil
	    .getTargetEnvironment();

    @BeforeClass
    public static void setUp() throws Exception {
	driver = getEnvironmentDriver();
	driver.manage().timeouts()
		.implicitlyWait(TIMEOUT, TimeUnit.MILLISECONDS);
    }

    @AfterClass
    public static void tearDown() throws Exception {
	driver.quit();
	driver = null;
    }

    public WebDriver getDriver() {
	return driver;
    }

    public void setURL(final String url) {
	if (null == TARGET_URL) {
	    driver.get(LOCAL_URL);
	} else {
	    driver.get(TARGET_URL);
	}
    }

    private static WebDriver getEnvironmentDriver() {
	if (null == TARGET_ENVIRONMENT) {
	    return new FirefoxDriver();
	} else {
	    try {
		return new RemoteWebDriver(new URL(driver.getCurrentUrl()),
			DesiredCapabilities.firefox());
	    } catch (final MalformedURLException me) {
		me.printStackTrace();
		return null;
	    }
	}
    }
}
