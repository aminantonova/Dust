package UiTest.Tests;

import UiTest.BaseTest;
import org.junit.Assert;
import org.junit.Test;


public class UITest extends BaseTest {

    @Test
    public void checkRegister() {

        String FirstName = "Amina";
        String LastName = "Antonova";
        String UserName = "amina antonova";
        String Password = "A1b@cdef";
//
//        ElementsPage elementsPage = new ElementsPage();
//        elementsPage.ElementsClick();


//        driver.get("https://demoqa.com/");
        MainPage mainPage = new MainPage(); // створюємо екземпляр класу MainPage
        //Ініціалізуємо MainPage, щоб використовувати його методи
//        mainPage.waitForPageToLoad();       // ожидание загрузки страницы
        mainPage.Register(FirstName, LastName, UserName, Password);
        //звертаємось до цього екземпляру та викликаємо метод з цього класу

        LoginPage loginPage = new LoginPage();
        loginPage.createLogin(UserName,Password);

        Assert.assertTrue(loginPage.isLoginSuccessful());
        Assert.assertTrue(mainPage.isRedirectedToLogin());
//        Assert.assertTrue(elementsPage.isAtElementsPage());


    }
}