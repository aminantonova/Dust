package UiTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected WebDriver driver;
    //зміна з типом WebDriver і цю зміну треба ініціалізувати та присвоїти відповідний тип – chromedriver
    //цю зміну треба постійно використовувати в кожному класі в якому збираємось взаємодіяти з елементами
    //до екземпляра web driver присвоїли якісь значення нижче driver.
    //треба щоб ці налаштування продовжували бути актуальними на усіх сторінках

    @Before
    public void setUp() { //метод для налаштування, ініціалізації браузера та його встановлення.

        WebDriverManager.chromedriver().setup();
        //скачати chrome driver за допомогою залежності webdrivermanager
        //chromedriver – обираєм chrome, setup – метод установки
        driver = new ChromeDriver();
        // ініціалізували зміну driver та присвоїли відповідний тип – chromedriver
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
    }

    @After
            public void tearDown () {
        driver.close();//закриваємо driver
        driver.quit();//закриваємо браузер

    }
}
