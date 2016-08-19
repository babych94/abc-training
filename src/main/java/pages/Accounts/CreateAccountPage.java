package pages.Accounts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by B on 8/10/2016.
 */
public class CreateAccountPage extends AccountsPage {
    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "name")
    public WebElement accountName;

    @FindBy(name = "code")
    public WebElement accountCode;

    public void fillData(){
//        System.out.println(driver.findElement(By.xpath(".//*[@id='app']/div/div[3]/div/div[3]/div/form/div[2]/div/input")).getText());
//        driver.findElement(By.xpath(".//*[@id='app']/div/div[3]/div/div[3]/div/form/div[2]/div/input")).click();
//        driver.findElement(By.xpath(".//*[@id='app']/div/div[3]/div/div[3]/div/form/div[2]/div/input")).sendKeys("Acc Name");

        type(driver.findElement(By.name("name")), "asdasdad");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        type(driver.findElement(By.name("code")), "das");
//        driver.findElement(By.name("name")).click();
//        driver.findElement(By.name("name")).sendKeys("Acc.name");
//        driver.findElement(By.name("code")).click();
//        driver.findElement(By.name("code")).sendKeys("G11");
//        driver.findElement(By.name("address")).sendKeys("Babych street");
//        driver.findElement(By.name("address2")).sendKeys("Vasyl street");
//        driver.findElement(By.name("city")).sendKeys("Uzhgorod");
//        driver.findElement(By.name("zip")).sendKeys("88000");

    }
}
