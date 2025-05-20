package UiTest.Tests;

import UiTest.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class MainTest extends BaseTest {
    @Test
    public void checkRegister() {

        HomePage homePage = new HomePage(driver);
        // створюємо екземпляр класу MainPage
        //Ініціалізуємо HomePage, щоб використовувати його методи
        homePage.openBookStoreCategory();

        MainPage mainPage = new MainPage(driver);// створюємо екземпляр класу MainPage
        //Ініціалізуємо MainPage, щоб використовувати його методи

//        mainPage.isListsOfElementsDisplayed();
//        mainPage.enterBookStore();
        mainPage.clickLogin();
        mainPage.clickNewUser();
        mainPage.enterFirstName("Amina");
        mainPage.enterLastName("Antonova");
        mainPage.enterUserName("amina antonova");
        mainPage.enterPassword("A1b@cdef");
//        mainPage.isCaptchaDisplayed();
        mainPage.clickRegister();

        Assert.assertTrue(mainPage.isRedirectedToLogin());

    }
}
