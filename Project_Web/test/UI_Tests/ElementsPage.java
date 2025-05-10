package UI_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class ElementsPage {
    private final WebDriver driver;

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void Elements(String expectedUrl) {

        WebElement openElements = driver.findElement(By.xpath("//h5[text()='Elements']/ancestor::div[contains(@class, 'mt')]"));
        openElements.click();

        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.urlToBe(expectedUrl));


//        WebElement openElements = driver.findElement(By.xpath("//div [contains(text(), 'Elements')]"));
//        openElements.click();

        String currentUrl = driver.getCurrentUrl();
        if (!currentUrl.equals(expectedUrl)) {
            throw new AssertionError("Expected URL: " + expectedUrl + " but got: " + currentUrl);

        }
    }
}

