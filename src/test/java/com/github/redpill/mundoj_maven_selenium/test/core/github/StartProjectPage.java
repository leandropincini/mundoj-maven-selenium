package com.github.redpill.mundoj_maven_selenium.test.core.github;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.github.redpill.mundoj_maven_selenium.test.core.github.navigation.StartProjectPageNavigation;

public class StartProjectPage extends StartProjectPageNavigation {

    private static final String README_TEXT = "README.md\n"
	    + "mundoj-maven-selenium\n"
	    + "Aplicação de exemplo para o artigo \"Escolher quais testes rodar através do JUnit e profiles do Maven\" para revista Mundo J";

    public boolean openHomePage() {
	final WebElement readme = getDriver().findElement(By.id("readme"));

	System.out.println(README_TEXT.equals(readme.getText()));

	return !(null == readme.getText() && "".equals(readme.getText()));
    }

    public StartProjectPage() {
	super();
    }
}
