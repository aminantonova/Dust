package UiTest.Tests;

import UiTest.BasePage;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//span [text()='Login']")
    private WebElement Login;

    @FindBy(xpath = "//input[@id='userName']")
    private WebElement LoginUserName;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement LoginPassword;

    @FindBy(xpath = "//button [text()='Login']")
    private WebElement LoginButton;

//    @FindBy (xpath = "//div [@class='text-left button']//button")
//    private WebElement GotoStore;

    @FindBy( xpath = "//label [@id = 'userName-value']")
    private WebElement LoggedInUserName;

    //     (id = "userName-value")
    //" //button[@id='login']"

    @FindBy(xpath = "//button [text()='Log out']")
    private WebElement LogOut;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public LoginPage createLogin(String login, String password) {

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login")));

        click(Login);
        type(LoginUserName, login);
        type(LoginPassword, password);
        safeClick(LoginButton);
//        safeClick(GotoStore);
//        click(LoggedInUserName);
        click(LogOut);
        return this;

    }

    public boolean isLoginSuccessful() {
        return LoginUserName.isDisplayed(); // или другой элемент на странице логина
    }
}

