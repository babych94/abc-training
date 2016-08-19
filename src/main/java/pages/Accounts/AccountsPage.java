package pages.Accounts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PageAbstract;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by B on 8/3/2016.
 */
public class AccountsPage extends PageAbstract{
    public AccountsPage(WebDriver driver) {
        super(driver);

    }

    public void open() {

    }

    @FindBy(xpath = ".//div[3]/div/div[3]/div[1]/div[1]/a")
    public WebElement addBtn;

    @Step
    public void OpenCreateAccount(){
        driver.navigate().to("http://ui-ng-test.fastlaneams.com/#/accounts");
       // driver.findElement(By.xpath(".//div[3]/div/div[3]/div[1]/div[1]/a")).click();
        refreshElements();
        addBtn.click();
    }
}
