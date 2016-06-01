package com.smartbrewed.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public abstract class AVeryAbstractPage {
    private static final Logger LOGGER = LogManager.getLogger(AVeryAbstractPage.class);

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected JavascriptExecutor js;

    public AVeryAbstractPage(final WebDriver driver, final int timeout) {
        this.wait = new WebDriverWait(driver, timeout);
        this.js = (JavascriptExecutor) driver;
        this.driver = driver;
    }
}
