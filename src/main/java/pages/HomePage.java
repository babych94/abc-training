package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigProperties;

/**
 * Created by B on 8/1/2016.
 */
public class HomePage extends PageAbstract {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(ConfigProperties.getProperty("base.url"));
    }

    public boolean CheckHomePage(){

        return  driver.getCurrentUrl().equals("http://ui-test2.fastlaneams.com/#/");
    }


}
