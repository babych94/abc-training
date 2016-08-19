package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by B on 8/1/2016.
 */
public abstract class PageAbstract {

    public WebDriver driver;

    public PageAbstract (WebDriver driver){
        this.driver=driver;
    }

    public void type (WebElement element, String text){
        element.click();
        element.clear();
        element.sendKeys(text);


        element.click();

    }

    public abstract void open();

    public boolean isElementPresent(WebElement element){
        try {
            element.isDisplayed();
            return true;

        }catch (NoSuchElementException e){
            return false;

        }
    }

    public void refreshElements(){
        PageFactory.initElements(this.driver, this);
    }

}
