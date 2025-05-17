package UiTest.Tests;

import UiTest.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BasePage {

    @FindBy(xpath = "//h5 [text()='Book Store Application']")
    private WebElement BookStore;

    @FindBy(xpath = "//span [text()='Login']")
    private WebElement Login;
    //"//li[@class='btn btn-light active']//span"

    @FindBy (xpath = "//div [@class= 'text-right button']//button [text()='New User']")
    private WebElement NewUser;

//"//div[@class='mt-2 buttonWrap row']//button [text()='New User']"
//"//button[@id='newUser']"
//"//button [text()='New User']"

    //анотація Find
    @FindBy(xpath = "//input [@id='firstname']") //можно id та css
    // дозволяє знайти саме елемент на сторінці: робити пошук саме тоді, коли ми будемо звертатися до цього елементу
    private WebElement FirstName; //відбувається ініціалізація елементу FirstName тоді коли ми до нього звертаємось
    // тоесть не нужно присваивать ему какие-то значения

    @FindBy(xpath = "//input[@id='lastname']")
    private WebElement LastName;

    @FindBy(xpath = "//input[@id='userName']")
    private WebElement UserName;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement Password;

    @FindBy(xpath = "//div[contains(@class,'border')]//ancestor::span")
    private WebElement Robot;
    //div[contains(@class, 'border')]//ancestor::span
    //div[@class= 'recaptcha-checkbox-border']

    @FindBy(xpath = "//button[@id='register']")
    private WebElement Register;

    //Page Factory зазвичай будується на конструкторі (control+enter)>constructor>select none
    public MainPage() { // метод для ініціалізації всіх елементів через Page Factory
        driver.get("https://demoqa.com/");
        //коли ми створемо екземпляр класу MainPage то відкриється ця URL, і відбудеться ініціалізація
        PageFactory.initElements(driver, this); // this – цей клас, або вказати назву потрібного класу
        //зміна driver береться з Base Page який цей клас наслідує, і там driver вже є в змінній
        //модифікатор доступу цієї змінної protected який доступний в класах наследниках
    }

    public MainPage Register(String first, String last, String user, String pass) {
        // метод який заповнить поля які ми зазначили
        // ці поля ми будемо передавати через тестовий клас

        ScrollAndClick(BookStore);
//        click(BookStore);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", BookStore);
//        //принудительное прокручивание к нужному элементу, так как его перекрывает реклама
//        BookStore.click();

//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Login);

//        WebElement Login = findByXpath("//span [text()='Login']");

//        ScrollAndClick(Login);
        safeClick(Login);
        safeClick(NewUser);
        type(FirstName, first);
        type(LastName, last);
        type(UserName, user);
        type(Password, pass);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement clickRobot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='recaptcha-checkbox-border']")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Robot);

        click(Robot);

        click(Register);
        return this; //повертаємо сторінку, бо з нею ще працюємо
    }
    public boolean isRedirectedToLogin() {
        return Login.isDisplayed(); // или другой элемент на странице логина
    }

}


//        driver.findElement(By.xpath("//h5 [text()='Elements']")).click();
