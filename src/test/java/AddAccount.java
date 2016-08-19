import org.testng.annotations.Test;
import pages.Accounts.AccountsPage;
import pages.Accounts.CreateAccountPage;

/**
 * Created by B on 8/4/2016.
 */
public class AddAccount extends BasicTest {

    protected AccountsPage accountsPage = new AccountsPage(getWebDriver());
    protected CreateAccountPage createAccountPage = new CreateAccountPage(getWebDriver());

    @Test(priority = 1)
    public void SimpleSignIn() throws Exception{
        signInPage.openbrowser();
        signInPage.openHome();
    }

    @Test(dependsOnMethods = "SimpleSignIn")
    public void AddAccount() throws Exception {
        accountsPage.OpenCreateAccount();
        createAccountPage.fillData();
    }


}
