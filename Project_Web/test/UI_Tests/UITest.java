package UI_Tests;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UITest extends BaseTest {

    private final static String SearchString = "Automated Mobile Testing in testRigor";
    private final static String Open_URL = "https://www.toolsqa.com/testrigor/automated-mobile-testing-in-testrigor";
    private final static String Demo_URL = "https://demoqa.com/";
    private final static String Elements_URL = "https://demoqa.com/elements";

    @Test
    public void checkHref() {

        MainPage mainPage = new MainPage(driver); //Ініціалізуємо MainPage, щоб використовувати його методи

        //Створюємо об'єкт класу MainPage. driver – це екземпляр WebDriver, який дозволяє керувати браузером.
        // Він використовується для взаємодії з веб-сторінкою: відкривати URL-адресу, натискати на кнопки, вводити текст у поля і т.д.
        // Таким чином, "отримуємо доступ" до дій, які можна виконати на головній сторінці, які виконує driver.

        mainPage.openWebSite(Base_URL); // Відкриваємо сайт
        // Викликаємо метод openWebSite() об'єкта mainPage і передаєм URL із змінної Base_URL, щоб відкрити сайт.

        Assert.assertEquals("URL не співпадає", Base_URL, driver.getCurrentUrl());
        // Перевіряємо, чи відкрився правильний сайт: порівнюємо очікуваний URL із фактичним

        mainPage.SearchInPut(SearchString); // виконуєм пошук на сайта

        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickOnFirstArticle(Open_URL);

        Assert.assertEquals("Невірний URL статті", Open_URL, driver.getCurrentUrl());

        OpenPage openPage = new OpenPage(driver);
        openPage.openDemoSite(Demo_URL);

        Assert.assertEquals("Demo Site URL не співпадає", Demo_URL, driver.getCurrentUrl());

//Assert.assertEquals(...) – метод, який порівнює два значення ( очікуване та фактичне).
//Якщо вони не співпадають тест впаде з помилкою та покаже повідовлення у «».
//
//Пример вывода в консоль:
//makefile
//КопироватьРедактировать
//java.lang.AssertionError: Demo Site URL не совпадает
//Expected: https://demoqa.com/
//Actual: https://toolsqa.com/incorrect-url
//
//Demo_URL – це моя зміна в яку я завчасно записала очікуваний URL
//driver.getCurrentUrl() – це реальний URL на який браузер попав в момент виконування тесту, чи дійсно ми опинились на потрібній сторінці.

        ElementsPage elementsPage = new ElementsPage(driver);
        elementsPage.Elements(Elements_URL);
    }
}
