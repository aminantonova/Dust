package UiTest.Tests;

import com.example.selenium.UserName;
import org.junit.Assert;
import org.junit.Test;
import uiPages.MainPage;

public class MainTest extends BaseTest {
    @Test
    public void checkRegister() {

        MainPage mainPage = new MainPage(driver);
        UserName user = UserName.AMINA;

        mainPage.clickBookStoreCategory();
        mainPage.clickLogin();
        mainPage.clickNewUser();
        mainPage.enterFirstName(user.getFirstName());
        mainPage.enterLastName(user.getLastName());
        mainPage.enterUserName(user.getUserName());
        mainPage.enterPassword(user.getPassword());
        mainPage.clickRegister();

        Assert.assertTrue(mainPage.isRedirectedToLogin());
    }
}
