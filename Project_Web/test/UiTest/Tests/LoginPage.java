package UiTest.Tests;

import UiTest.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

//    @FindBy(xpath = "//div[contains(@class,'pannel')]")
//    private WebElement listsOfElements;

    @FindBy(xpath = "//span [text()='Login']")
    private static WebElement login;

    @FindBy(xpath = "//input[@id='userName']")
    private WebElement loginUserName;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@id='login']")
    private WebElement loginButton;
//"//button[text()='Login']"
    @FindBy(xpath = "//label[@id='userName-value']")
    private WebElement loggedInUserName;

    @FindBy(xpath = "//button [text()='Log out']")
    private WebElement logOut;

//    public boolean isListsOfElementsDisplayed() {
//        return isDisplayed(listsOfElements);
//    }

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
    public void clickLogOut() {
        click(logOut);
}
    public boolean isLoginSuccessful() {
        return loginUserName.isDisplayed(); // или другой элемент на странице логина
    }
}

