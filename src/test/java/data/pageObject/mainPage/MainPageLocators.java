package data.pageObject.mainPage;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPageLocators {
    public static final SelenideElement PAGE_TITLE = $x("//span[text()='Create a Drop']");
}
