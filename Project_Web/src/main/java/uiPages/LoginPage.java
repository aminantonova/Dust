package uiPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//h5[contains(text(),'Book')]/ancestor::div[contains(@class,'mt-4')]")
    private WebElement bookStoreCategory;

    @FindBy(xpath = "//span[text()='Login']")
    private WebElement login;

    @FindBy(xpath = "//input[@id='userName']")
    private WebElement loginUserName;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//button [text()='Login']")
    private WebElement loginButton;

    @FindBy(xpath = "//label[@id='userName-value']")
    private WebElement loggedInUserName;

    @FindBy(xpath = "//button[text()='Log out']")
    private WebElement logOut;

    public void clickBookStoreCategory () {
        scrollAndClick(bookStoreCategory);
    }
    public void enterLogin () {
        scrollAndClick(login);
    }

    public void enterUserName(String UserName) {
        loginUserName.sendKeys(UserName);
    }

    public void enterPassword (String Password) {
        password.sendKeys(Password);
    }

    public void clickLogin() {
        click(loginButton);
    }

    public boolean checkIsLoginSuccess() {
        return loggedInUserName.isDisplayed();
    }
}

