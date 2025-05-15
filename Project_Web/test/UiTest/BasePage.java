package UiTest;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected static WebDriver driver;

    public static void setDriver(WebDriver webDriver) {
    // метод який присвоїть налаштування з base test
    driver = webDriver; //присвоїть web driver який ініціалізували в base test
    //щоб це запрацювало треба в base test в методі set up викликати цей метод

        //це клас який застосовується в кожному page class
}
    }
