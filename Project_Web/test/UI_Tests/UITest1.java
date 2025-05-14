package UI_Tests;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UITest1 extends BaseTest1 {

    private final static String SearchString = "Automated Mobile Testing in testRigor";
    private final static String Open_URL = "https://www.toolsqa.com/testrigor/automated-mobile-testing-in-testrigor";
    private final static String Demo_URL = "https://demoqa.com/";
    private final static String Elements_URL = "https://demoqa.com/elements";
    private final static String TextBox_URL = "https://demoqa.com/text-box";
    private final static String CheckBox_URL = "https://demoqa.com/checkbox";
    private final static String RadioButton_URL = "https://demoqa.com/radio-button";
    private final static String WebTables_URL = "https://demoqa.com/webtables";
    private final static String Buttons_URL = "https://demoqa.com/buttons";
    private final static String Links_URL = "https://demoqa.com/links";
    private final static String BrokenLinks_URL = "https://demoqa.com/broken";
    private final static String UploadAndDownload_URL = "https://demoqa.com/upload-download";
    private final static String DynamicProperties_URL = "https://demoqa.com/dynamic-properties";

    @Test
    public void checkHref() {

        MainPage mainPage = new MainPage(driver); //Ініціалізуємо MainPage, щоб використовувати його методи

        //Створюємо об'єкт класу MainPage. driver – це екземпляр WebDriver, який дозволяє керувати браузером.
        // Він використовується для взаємодії з веб-сторінкою: відкривати URL-адресу, натискати на кнопки, вводити текст у поля і т.д.
        // Таким чином, "отримуємо доступ" до дій, які можна виконати на головній сторінці, які виконує driver.

//        mainPage.openWebSite(Base_URL); // Відкриваємо сайт
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
        Assert.assertEquals("Elements URL не співпадає", Elements_URL, driver.getCurrentUrl());

        elementsPage.clickTextBox(TextBox_URL);
        Assert.assertEquals("TextBox URL не співпадає", TextBox_URL, driver.getCurrentUrl());

        elementsPage.clickCheckBox(CheckBox_URL);
        Assert.assertEquals("CheckBox URL не співпадає", CheckBox_URL, driver.getCurrentUrl());

        elementsPage.clickRadioButton(RadioButton_URL);
        Assert.assertEquals("RadioButton URL не співпадає", RadioButton_URL, driver.getCurrentUrl());

        elementsPage.clickWebTables(WebTables_URL);
        Assert.assertEquals("WebTables URL не співпадає", WebTables_URL, driver.getCurrentUrl());

        elementsPage.clickButtons(Buttons_URL);
        Assert.assertEquals("Buttons URL не співпадає", Buttons_URL, driver.getCurrentUrl());

        elementsPage.clickLinks(Links_URL);
        Assert.assertEquals("Links URL не співпадає", Links_URL, driver.getCurrentUrl());

        elementsPage.clickBrokenLinks(BrokenLinks_URL);
        Assert.assertEquals("BrokenLinks URL не співпадає", BrokenLinks_URL, driver.getCurrentUrl());

        elementsPage.clickUploadAndDownload(UploadAndDownload_URL);
        Assert.assertEquals("UploadAndDownload URL не співпадає", UploadAndDownload_URL, driver.getCurrentUrl());

        elementsPage.clickDynamicProperties(DynamicProperties_URL);
        Assert.assertEquals("DynamicProperties URL не співпадає", DynamicProperties_URL, driver.getCurrentUrl());

    }
}
