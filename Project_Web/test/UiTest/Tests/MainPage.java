package UiTest.Tests;

import UiTest.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class MainPage extends BasePage {

    //Page Factory будується на конструкторі (control+enter)>constructor>select none
    public MainPage(WebDriver driver) { // ініціалізація елементів
        super(driver); //вызов конструктора Webdriver родительского класса в BasePage
        PageFactory.initElements(driver, this);
        //зміна driver береться з Base Page який цей клас наслідує, і там driver вже є в змінній
    }

//    @FindBy(xpath = "//div[contains(@class,'pannel')]")
//    private WebElement listsOfElements;

//    @FindBy(xpath = "//h5[contains(text(),'Book')]/ancestor::div[contains(@class,'mt-4')]")
//    private WebElement bookStore;

    @FindBy(xpath = "//span [text()='Login']")
    private static WebElement login;
//"//li[contains(@class,'active')]"
    @FindBy(xpath = "//button[text()='New User']")
    private WebElement newUser;
//    "//div[contains(@class,'text-right')]//button [@id='newUser']"
    //"//button[@id='newUser']"
//    "//div [@class= 'text-right button']//button [text()='New User']"
//button[text()='New User']
    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='lastname']")
    private WebElement lastName;

    @FindBy(xpath = "//div[@id='userName-wrapper']//input")
    private WebElement userName;

//"//div[contains(@class,'col-md-9')]//input[@id='userName']"
//"//input[@id='userName']"
//"//button[text()='New User']"
//"//div[@id='userName-wrapper']//descendant::input"

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
    private WebElement captcha;

    @FindBy(xpath = "//button[@id='register']")
    private WebElement register;



//    public boolean isListsOfElementsDisplayed() {
//        return isDisplayed(listsOfElements);
//    }

//    public void enterBookStore() {
//        click(bookStore);
//    }

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

//    public boolean isCaptchaDisplayed() {
//        return captcha.isDisplayed();
//    }

    public void clickRegister() {
        scrollAndClick(register);
    }

    public boolean isRedirectedToLogin() {
        return userName.isDisplayed();
    }
}




