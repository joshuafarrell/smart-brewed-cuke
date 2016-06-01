package com.smartbrewed.page.stylecaster;

import com.smartbrewed.page.AbstractPage;
import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Elements and actions that appear on www.stylecaster.com
 *
 * @author Joshua.Farrell
 * @version 1.0
 */
@Data
public class HomePage extends AbstractPage {

    @FindBy(css = "#oas_Top2")
    private WebElement divTop;

    public HomePage(WebDriver driver) {
        super(driver);
    }

}
