package UI_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private final WebDriver driver; //це оголошення змінної, яка зберігатиме об'єкт браузера WebDriver.

    // Конструктор, принимающий WebDriver
    public MainPage(WebDriver driver) {
    //це конструктор, який ініціалізує цю змінну, передаючи об'єкт браузера під час створення об'єкта MainPage.
        this.driver = driver; //ініціалізація змінної класу значенням, переданим конструктор.
    }

    // Метод для поиска по сайту
    public void SearchInPut(String searchString) {
        WebElement textboxInput = driver.findElement(By.xpath("//input[@class='navbar__search--input']"));
        //input [contains(@class, 'navbar')] [not(contains(@class, 'w-100'))]
        textboxInput.sendKeys(searchString); // Вводим текст в поле поиска
        textboxInput.sendKeys(Keys.ENTER); // Нажимаем Enter
        //sendKeys — це метод, який використовується для введення тексту.
        //По типу: textboxInput.sendKeys("Hello World");
        //Keys.ENTER — це спеціальна клавіша, яка імітує натискання клавіші Enter.
    }

    // Метод для открытия сайта
    public void openWebSite(String url) {
        driver.get(url); //відкриваємо сайт
    }
}