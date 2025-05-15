package UI_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ElementsPage {
    private final WebDriver driver;

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void Elements(String expectedUrl) {

        JavascriptExecutor js = (JavascriptExecutor) driver; //метод прокрутки страницы
        js.executeScript("window.scrollBy(0,250)", "");

        driver.findElement(By.xpath("//h5 [text()='Elements']")).click();
//        new WebDriverWait(driver, Duration.ofSeconds(5))
//                .until(ExpectedConditions.urlToBe(expectedUrl));
    }

    public void clickTextBox(String expectedUrl) {

        driver.findElement(By.xpath("//span[text()= 'Text Box']")).click();
    }

    //        driver.findElement(By.xpath("//div [@class= 'header-wrapper'][1]")).click();

    public void clickCheckBox(String expectedUrl) {
        driver.findElement(By.xpath("//span[text()= 'Check Box']")).click();
    }

    public void clickRadioButton(String expectedUrl) {
        driver.findElement(By.xpath("//span[text()= 'Radio Button']")).click();
    }

    public void clickWebTables(String expectedUrl) {
        driver.findElement(By.xpath("//span[text()= 'Web Tables']")).click();
    }

    public void clickButtons(String expectedUrl) {
        driver.findElement(By.xpath("//span[text()= 'Buttons']")).click();
    }

    public void clickLinks(String expectedUrl) {
//
        WebElement element = driver.findElement(By.xpath("//span[text()= 'Links']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        //принудительное прокручивание к нужному элементу, так как его перекрывает реклама
//
        driver.findElement(By.xpath("//span[text()= 'Links']")).click();
    }
    public void clickBrokenLinks(String expectedUrl){

//        ((JavascriptExecutor) driver).executeScript("document.getElementById('fixedban').style.display='none';"); //закрытие рекламы

//        WebElement element = driver.findElement(By.xpath("//span[text()= 'BrokenLinks']"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        JavascriptExecutor js = (JavascriptExecutor) driver; //метод прокрутки страницы
        js.executeScript("window.scrollBy(0,500)", "");
//
//        new WebDriverWait(driver, Duration.ofSeconds(5))
//                .until(ExpectedConditions.urlToBe(expectedUrl));
    driver.findElement(By.xpath("//span[contains(text(), 'Broken Links')]")).click();


    }
    public void clickUploadAndDownload(String expectedUrl){
    driver.findElement(By.xpath("//span[text()= 'Upload and Download']")).click();
    }


    public void clickDynamicProperties (String expectedUrl){

        WebElement element = driver.findElement(By.xpath("//span[text()='Dynamic Properties']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();

        JavascriptExecutor js = (JavascriptExecutor) driver; //метод прокрутки страницы
        js.executeScript("window.scrollBy(0,500)", "");

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("fixedban")));

        driver.findElement(By.xpath("//span[text()= 'Dynamic Properties']")).click();
    }
}

