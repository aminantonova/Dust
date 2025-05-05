package UI_Tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;

abstract public class BaseTest {
    //створимо базовий клас з тестами
    //всього три методи: ініціалізація selenide

    public void setUp(){ //метод для налаштування, ініціалізацію браузера та його встановлення.
// спочатку треба встановити chrome driver, для цього в нас вже є залежність webdrivermanager

        WebDriverManager.chromedriver().setup();
        //скачали chrome driver, автоматично вкажемо шлях та зробимо основні налаштування
        Configuration.browser = "chrome"; // вказали конфігурацію браузера
        // обрати саме com.codeborne.selenide
        Configuration.browserSize = "1440х900";
        // розмір вікна нашого браузера, відповідає за розмір вікна буде відкрите при виконувані тесту
        Configuration.headless = false; //створює віртуальний екран де запускає chrome
        //чи будемо бачити сам браузер при виконувані тесту
        // в середині цього віртуального простору виконується вся тестова логіка
        // якщо ми хочемо своїми очима бачити що відбувається ставимо true, якщо ні – false
    }

    //метод який викликаємо до початку тесту
    // треба поставити анотацію – @

    @Before
    public void init() {
        setUp(); // перед кожним запуском тестів буде виконуватись ініціалізація web driver
    }

    //те що відбувається після
    @After
    public void tearDown() { //закрити браузер
        Selenide.closeWebDriver();
    //основний тестовий клас готовий
    //основа для всіх тестових класів
    // кожен раз будемо від цього класу наслідуватись
    }
}
