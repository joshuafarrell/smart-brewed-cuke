package com.smartbrewed.page.sheknows.advertising;

import com.smartbrewed.page.AVeryAbstractPage;
import lombok.Data;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Data
public class FullAd extends AVeryAbstractPage {
    private static final Logger LOGGER = LogManager.getLogger(FullAd.class);

    @FindBy(xpath = "//div[contains(@class,'dfp-interstitial-modal')]")
    public WebElement divFullAd;
    @FindBy(xpath = "//span[contains(@class,'btn-close')]")
    private WebElement lnkCloseFullAd;

    public FullAd(WebDriver driver) {
        super(driver, 60);
    }

    /**
     * Wait for the take-over ad to appear and then dismiss it.
     */
    public void waitAndCloseFullAd() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 15);

            wait.until(ExpectedConditions.elementToBeClickable(lnkCloseFullAd)).click();

            LOGGER.info("Full ad closed.");
        } catch (TimeoutException e) {
            LOGGER.info(e);
        } catch (StaleElementReferenceException e) {
            try {
                lnkCloseFullAd.click();
            } catch (NoSuchElementException ex) {
                LOGGER.info(ex);
            }
        } catch (NoSuchElementException e) {
            LOGGER.info(e);
        }
    }

}
