package UiTest.Tests;

import UiTest.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class MainTest extends BaseTest {
    @Test
    public void checkRegister() {

        HomePage homePage = new HomePage(driver);
        homePage.openBookStoreCategory();

        MainPage mainPage = new MainPage(driver);

        mainPage.clickLogin();
        mainPage.clickNewUser();
        mainPage.enterFirstName("Amina");
        mainPage.enterLastName("Antonova");
        mainPage.enterUserName("amina antonova");
        mainPage.enterPassword("A1b@cdef");
        mainPage.clickRegister();

        Assert.assertTrue(mainPage.isRedirectedToLogin());

    }
}
