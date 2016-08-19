import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.Accounts.AccountsPage;
import utils.ConfigProperties;
import pages.*;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 * Created by B on 8/1/2016.
 */
public class BasicTest {

    protected SignInPage signInPage = new SignInPage(getWebDriver());
    protected HomePage homePage = new HomePage(getWebDriver());
    protected AccountsPage accountsPage = new AccountsPage(getWebDriver());

    protected WebDriver driver;

    protected WebDriver getWebDriver() {
        if (driver == null) {
            String OS = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);
            if ((OS.indexOf("mac") >= 0) || (OS.indexOf("darwin") >= 0)) {
                System.setProperty("webdriver.chrome.driver", "chromedrivermac");
            } else if (OS.indexOf("win") >= 0) {
             //   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
                System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
                System.out.println(OS);
            } else if (OS.indexOf("nux") >= 0) {
                System.setProperty("webdriver.chrome.driver", "chromedriver");
            } else {
                System.out.println("NOT SUPPORTED OS");
            }

            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigProperties.getProperty("imp.wait")), TimeUnit.SECONDS);
        }
        return driver;
    }


    @AfterClass
    public  void tearDown() {

     //   driver.quit();

    }

}
