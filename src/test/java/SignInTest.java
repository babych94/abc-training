import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by B on 8/3/2016.
 */
public class SignInTest extends BasicTest {

    @Test
    public void SimpleSignIn() throws Exception{
        signInPage.openbrowser();
        signInPage.openHome();
    }




}
