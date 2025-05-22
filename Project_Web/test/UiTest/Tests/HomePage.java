package UiTest.Tests;
import UiTest.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

        public HomePage(WebDriver driver) {
            super(driver);
        }

 public WebElement bookStoreCategory = findByXpath("//h5[contains(text(),'Book')]/ancestor::div[contains(@class,'mt-4')]");

        public void openBookStoreCategory(){
            scrollAndClick(bookStoreCategory);
        }
    }
