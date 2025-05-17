package UiTest;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected static WebDriver driver;
    protected WebDriverWait wait;

    // Привязываем драйвер, например из BaseTest
    public static void setDriver(WebDriver webDriver) {
    // метод який присвоїть налаштування з base test
    driver = webDriver; //присвоїть web driver який ініціалізували в base test
    //щоб це запрацювало треба в base test в методі set up викликати цей метод

        //це клас який застосовується в кожному page class
}
    // Конструктор: инициализация WebDriverWait с универсальным таймаутом
    public BasePage() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    // Универсальный метод клика с ожиданием кликабельности
    public void click(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    // Ввод текста с ожиданием видимости
    public void type(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    //Принудительная прокрутка страницы к нужному элементу.
    public void scroll(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    // Скролл к элементу
    public void ScrollAndClick(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }

    // Безопасный клик с обработкой исключений (если элемент перекрыт)
    public void safeClick(WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
        } catch (ElementClickInterceptedException e) {
            // Если элемент перекрыт, можно попробовать кликнуть через JavaScript
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        }
    }

    // Метод для безпечної перевірки наявності CAPTCHA (reCAPTCHA)
    public void checkCaptcha(String xpath) {
        try {
            // Створюємо об'єкт WebDriverWait, який чекатиме до 10 секунд на появу CAPTCHA
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            // Очікуємо, поки CAPTCHA стане видимою на сторінці (знаходимо її за XPath)

            WebElement captcha = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

            // Перевіряємо, чи дійсно CAPTCHA відображена (видима користувачу)
            if (captcha.isDisplayed()) {
                // Якщо CAPTCHA видно — виводимо повідомлення в консоль і не взаємодіємо з нею
                System.out.println("CAPTCHA відображена, пропускаємо взаємодію.");
            }
        } catch (Exception e) {
            // Якщо CAPTCHA не з'явилась або не знайдена — просто виводимо повідомлення
            System.out.println("CAPTCHA не знайдена або не відображена.");
        }
    }

    // Проверка видимости элемента
    public boolean isVisible(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return element.isDisplayed();
        } catch (TimeoutException e) {
            return false;
        }

    }
    // Поиск элемента по XPath с ожиданием
    public WebElement findByXpath(String xpath) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    // Очистка поля с ожиданием видимости
    public void clear(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element)).clear();
    }

    // Получение текста с ожиданием видимости
    public String getText(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element)).getText();
    }
}

