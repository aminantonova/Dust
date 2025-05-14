package UiTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected WebDriver driver;
    //зміна з типом WebDriver і цю зміну треба ініціалізувати та присвоїти відповідний тип – chromedriver

    @Before
    public void setUp() { //метод для налаштування, ініціалізації браузера та його встановлення.

        WebDriverManager.chromedriver().setup(); // скачати chrome driver за допомогою залежності webdrivermanager
        //chromedriver – обираєм chrome, setup – метод установки
        driver = new ChromeDriver(); // ініціалізували зміну driver та присвоїли відповідний тип – chromedriver
    }
}
