/**
 * Головна сторінка сайту demoqa.com
 */
package UI_Tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    //створити веб елемент до якого будемо звертатися
private final SelenideElement textboxInput = $x("//input [@class= 'navbar__search--input']");
    // кнопка (форма) пошуку, вибрати import static method
    // тип елементу – SelenideElement, назва – searchButton, локатор – //input [@class= 'navbar__search--input']
    // к цим елементам ми не можемо звертатись в самому класі – searchButton
    // щоб взаємодіяти з елементами треба створити метод і в ньому щось робити

    /**
     *Виконується пошук на сайті серед статей і натискається кнопка enter
     * @param searchString пошукова строка
     */
    public void Search(String searchString) {
// тепер можемо визвати textboxInput і будуть доступні до нього різні методи
    textboxInput.setValue(searchString); //встановлюємо значення
    textboxInput.sendKeys(Keys.ENTER); //вводимо в поле те що треба
//click – нажать, sendkeys – вписати текст, setValue – встановити значення, isDisplayed – видим он или нет
}
// створити метод який відкриє ссилку
public void openWebSite(String url) { // в аргументі () ми передамо нашу силку (тип данних і назву)
Selenide.open(url);
// після того як ми викличемо метод openWebSite і вкажемо ссилку в аргументі, то відкриється браузер і сторінка

}

}
