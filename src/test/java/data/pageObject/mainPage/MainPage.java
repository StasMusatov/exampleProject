package data.pageObject.mainPage;

import com.codeborne.selenide.Condition;

public class MainPage {

    public MainPage() {
        MainPageLocators.PAGE_TITLE.shouldBe(Condition.visible);
    }

}
