package UiTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    //зміна з типом WebDriver і цю зміну треба ініціалізувати та присвоїти відповідний тип – chromedriver
    //цю зміну треба постійно використовувати в кожному класі в якому збираємось взаємодіяти з елементами
    //до екземпляра web driver присвоїли якісь значення нижче driver.
    //треба щоб ці налаштування продовжували бути актуальними на усіх сторінках

    @Before
    public void setUp() { //метод для налаштування, ініціалізації браузера та його встановлення.

        WebDriverManager.chromedriver().setup(); // скачати chrome driver за допомогою залежності webdrivermanager
        //chromedriver – обираєм chrome, setup – метод установки
        driver = new ChromeDriver(); // ініціалізували зміну driver та присвоїли відповідний тип – chromedriver
        //два налаштування: завантаження сторінки та таймаут для взаємодії з елементами
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //timeout – метод який дозволяє вписувати очікування
        //pageLoadTimeout – дозволяє очікувати завантаження сторінки до якогось моменту
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //час очікування елементів на сторінці
        BasePage.setDriver(driver); //визиваємо метод setDriver з Base Page, аргумент protected WebDriver driver

    }

    @After
            public void tearDown () {
        driver.close(); //закриваємо driver
        driver.quit(); //закриваємо браузер

    }

}
