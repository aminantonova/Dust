package UI_Tests;

import org.junit.Test;

public class UITest extends BaseTest {
    // клас для виконування логіки перевірки: вказання якихось змінних та порівняння чогось
    // наслідує BaseTest
    // логіка взаємодії з елементами відбувається в Page class (класи зі сторінками)
    // треба вирішити які page класи треба створити
    // патерн page object – кожну сторінку розбиваємо на класи, щоб було зручніше
    // нам треба зробити всього два класи: основної сторінки та с результатами пошуку
    // Для page class завжди робити назву з закінчення page, щоб у великому проєкті було легше знайти


    // треба позначити що саме ми винесемо в окремі змінні, як константи – незмінні змінні
    // бо будь-яка інформація яка кудись вбивається, десь використовується її бажано виносити в змінні,
    // щоб потім її було легко знайти та змінити

    // треба винеси ссилку на наш сайт

    private final static String Base_URL = "https://www.toolsqa.com/selenium-training/";
    //ми позначили константу, щоб нею користуватись
    //private – досупна тільки в цьому класі
    //final – не можемо перевизначити цю зміну
    //static – зміна ініціалізується до ініціалізації класу, тобто завжди є
    private final static String SearchString = "Automated Mobile Testing in testRigor";
    // винести те що будемо шукати в пошуку
    private final static String Open_URL = "https://www.toolsqa.com/testrigor/automated-mobile-testing-in-testrigor";

    @Test
    public void checkHref() { //Href – це атрибут HTML для вказання посилання на URL адресу
    // якщо так запустити, то нічого не буде бо в нас пусте тіло
    // але виконається метод setUp в BaseTest(встановиться chromedriver та відбудуться якісь налаштування)
    // ми ніяк з цим не працюємо, воно просто викликається

    // щоб викликати метод з MainPage треба створити екземпляр цього класу
    MainPage mainPage = new MainPage();
    mainPage.openWebSite(Base_URL);
//так як у нас є екземпляр MainPage, то можемо і інший метод звідти визвати
    mainPage.Search(SearchString);

    SearchPage SearchPage = new SearchPage();
    SearchPage.Title(Open_URL);
//        Assert.assertTrue(href.conatins("automated-mobile"));
    }
}
