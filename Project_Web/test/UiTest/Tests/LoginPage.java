package UiTest.Tests;

import UiTest.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//span [text()='Login']")
    private WebElement Login;

    @FindBy(xpath = "//input[@id='userName']")
    private WebElement LoginUserName;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement LoginPassword;

    @FindBy(xpath = " //button[@id='login']")
    private WebElement LoginButton;

    @FindBy(id = "userName-value")
    private WebElement LoggedInUserName;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public LoginPage createLogin(String login, String password) {
        click(Login);
        type(LoginUserName, login);
        type(LoginPassword, password);
        click(LoginButton);
        return this;

        }
    public boolean isLoginSuccessful() {
        return LoggedInUserName.isDisplayed();
    }
    }

