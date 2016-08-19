package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Step;
import utils.ConfigProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by B on 8/1/2016.
 */
public class SignInPage extends PageAbstract {

    public SignInPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void open() {
        driver.get(ConfigProperties.getProperty("base.url"));
    }

    @FindBy(name = "username")
    public WebElement usernameField;

    @FindBy(name = "password")
    public WebElement passwordField;

    @FindBy(css = "button[type=\"submit\"]")
    public WebElement signIn;

   @FindBy(className = "home-title")
   public WebElement homeTitle;

    public void ClickSignIn(){
        type(usernameField, "qa.test133@gmail.com");
        type(passwordField, "123456");
        signIn.click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("home-title"))));
    }

    @Step
    public void openbrowser(){
        open();
        String title = driver.getTitle();
        System.out.println(title);
        String cururla = driver.getCurrentUrl();
        System.out.println(cururla);
    }

    @Step
    public void openHome(){
        ClickSignIn();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().equals("http://ui-ng-test.fastlaneams.com/#/"));
    }

}
