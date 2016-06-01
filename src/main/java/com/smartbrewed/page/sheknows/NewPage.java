package com.smartbrewed.page.sheknows;

import lombok.Data;
import org.openqa.selenium.WebDriver;

/**
 * Elements and actions that appear on sheknows.com/new
 *
 * @author Joshua.Farrell
 * @version 1.0
 */
@Data
public class NewPage extends MainPage {
    public NewPage(WebDriver driver) {
        super(driver);
    }
}
