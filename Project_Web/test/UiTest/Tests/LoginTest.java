package UiTest.Tests;

import UiTest.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void checkLogin() {

        HomePage homePage = new HomePage(driver);
        homePage.openBookStoreCategory();

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterLogin();
        loginPage.enterUserName("amina antonova");
        loginPage.enterPassword("A1b@cdef");
        loginPage.clickLogin();
        loginPage.clickLogOut();

        Assert.assertTrue(loginPage.isLoginSuccessful());
    }
}
