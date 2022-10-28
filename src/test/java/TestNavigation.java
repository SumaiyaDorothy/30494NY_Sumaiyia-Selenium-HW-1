import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagelibrary.HomePage;
import pagelibrary.SignInPage;

public class TestNavigation extends BasePage {

    @Test
    public void testNavigationToSignInPage() {
        HomePage homePage = new HomePage();

        SignInPage signInPage = homePage.clickSignInButton();

        Assert.assertTrue(isElementVisible(signInPage.createAccountButton));
    }

}
