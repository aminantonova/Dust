//package UiTest.Tests;
//
//import UiTest.BasePage;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class ElementsPage extends BasePage {
//
//    @FindBy(xpath ="//h5 [text()='Elements']")
//    private WebElement Elements;
////"//div [@class= 'card-body']/h5 [text()='Elements']"
//
//    @FindBy(xpath = "//span[text()= 'Text Box']")
//    private WebElement TextBox;
//
//    @FindBy(xpath = "//span[text()= 'Check Box']")
//    private WebElement CheckBox;
//
//    @FindBy(xpath = "//span[text()= 'Radio Button']")
//    private WebElement RadioButton;
//
//    @FindBy(xpath = "//span[text()= 'Web Tables']")
//    private WebElement WebTables;
//
//    @FindBy(xpath = "//span[text()= 'Buttons']")
//    private WebElement Buttons;
//
//    @FindBy(xpath = "//span[text()= 'Links']")
//    private WebElement Links;
//
//    @FindBy(xpath = "//span[contains(text(), 'Broken Links')]")
//    private WebElement BrokenLinks;
//
//    @FindBy(xpath = "//span[text()= 'Upload and Download']")
//    private WebElement UploadAndDownload;
//
//    @FindBy(xpath = "//span[text()= 'Dynamic Properties']")
//    private WebElement DynamicProperties;
//
//    public ElementsPage() {
//        driver.get("https://demoqa.com/");
//        PageFactory.initElements(driver, this);
//    }
//
//    public ElementsPage ElementsClick() {
//
//        ScrollAndClick(Elements);
//
//        safeClick(TextBox);
//        safeClick(CheckBox);
//        safeClick(RadioButton);
//        safeClick(WebTables);
//        safeClick(Buttons);
//        safeClick(Links);
//        safeClick(BrokenLinks);
//        safeClick(UploadAndDownload);
//        safeClick(DynamicProperties);
//
//        return this;
//    }
//    public boolean isAtElementsPage() {
//        return Elements.isDisplayed();
//    }
//}