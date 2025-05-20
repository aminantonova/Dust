package UiTest.Tests;
import UiTest.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

        public HomePage(WebDriver driver) {
            super(driver);
        }

//ElEMENTS

 public WebElement bookStoreCategory = findByXpath("//h5[contains(text(),'Book')]/ancestor::div[contains(@class,'mt-4')]");
//        public WebElement loginElement = findByXpath("//span [text()='Login']");
//METHOD


        public void openBookStoreCategory(){
            scrollAndClick(bookStoreCategory);
        }
//        public void openLoginElement() {
//            scrollAndClick(loginElement);
//        }
    }
