package UiTest.Tests;

import com.example.selenium.UserName;
import org.junit.Assert;
import org.junit.Test;
import uiPages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void checkSuccessLogin() {

        LoginPage loginPage = new LoginPage(driver);
        UserName user = UserName.AMINA;

        loginPage.clickBookStoreCategory();
        loginPage.enterLogin();
        loginPage.enterUserName(user.getUserName());
        loginPage.enterPassword(user.getPassword());
        loginPage.clickLogin();

        Assert.assertTrue(loginPage.checkIsLoginSuccess());
    }
}
