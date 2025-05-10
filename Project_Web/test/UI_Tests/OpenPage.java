package UI_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenPage {
    private final WebDriver driver;

    public OpenPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openDemoSite(String expectedUrl) {
    WebElement openDemoSite = driver.findElement(By.xpath("//div [@class= 'col-auto']//a [@rel= 'noopener']"));
        openDemoSite.click();

        // Метод для відкриття нового вікна
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }

//        String currentUrl = driver.getCurrentUrl();
//        if (!currentUrl.equals(expectedUrl)) {
//            throw new AssertionError("Expected URL: " + expectedUrl + " but got: " + currentUrl);
        }
    }
