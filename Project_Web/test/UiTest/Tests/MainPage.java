package UiTest.Tests;

import UiTest.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Login']")
    private WebElement login;

    @FindBy(xpath = "//button[text()='New User']")
    private WebElement newUser;

    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='lastname']")
    private WebElement lastName;

    @FindBy(xpath = "//div[@id='userName-wrapper']//input")
    private WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@id='register']")
    private WebElement register;


    public void clickLogin() {
        scrollAndClick(login);
    }

    public void clickNewUser() {
        scrollAndClick(newUser);
    }

    public void enterFirstName(String FirstName) {
        firstName.sendKeys(FirstName);
    }

    public void enterLastName(String LastName) {
        lastName.sendKeys(LastName);
    }

    public void enterUserName(String UserName) {
        userName.sendKeys(UserName);
    }

    public void enterPassword(String Password) {
        password.sendKeys(Password);
    }

    public void clickRegister() {
        scrollAndClick(register);
    }

    public boolean isRedirectedToLogin() {
        return userName.isDisplayed();
    }
}




