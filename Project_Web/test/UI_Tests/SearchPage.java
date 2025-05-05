package UI_Tests;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {

    private final SelenideElement OpenTitle = $x("//a [@class= 'article']");
    public void Title (String openString){

        OpenTitle.click(); //встановлюємо значення
    }
}
