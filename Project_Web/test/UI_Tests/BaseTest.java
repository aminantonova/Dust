package UI_Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected static final String Base_URL = "https://www.toolsqa.com/selenium-training/";
    protected WebDriver driver;
    //створимо базовий клас з тестами

    @Before
    public void setUp() { //метод для налаштування, ініціалізацію браузера та його встановлення.
        // спочатку треба встановити chrome driver, для цього в нас вже є залежність webdrivermanager

        WebDriverManager.chromedriver().setup(); //скачали chrome driver
        driver = new ChromeDriver(); //створюємо новий екземпляр, використовуючи driver підготовлений в минулому рядку
        driver.manage().window().maximize();
        driver.get(Base_URL);
    }

    @After
    public void tearDown() { //закрити браузер
        if (driver != null) {
            driver.quit();
        }
        //основа для всіх тестових класів
        // кожен раз будемо від цього класу наслідуватись
    }
}
