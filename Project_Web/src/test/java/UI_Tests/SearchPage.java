package UI_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    private final WebDriver driver;

    // Конструктор, принимающий WebDriver
    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    // Метод для перехода по ссылке на статью
    public void clickOnFirstArticle(String expectedUrl) {
  //це параметр методу, в який ти передаєш очікувану адресу сторінки, щоб потім порівняти його з фактичною URL-адресою після кліка.
        // потім ми в assert порівняємо expectedUrl та driver.getCurrentUrl()

        WebElement openFirstArticle = driver.findElement(By.xpath("//a[@class='article']"));
        //знаходить першу статтю на сторінці результатів пошуку.
        //WebElement це вид змінної, openFirstArticle – назва

        openFirstArticle.click(); // відкриваємо першу статтю

        }
    }
