package tests.firstTest;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import tests.testClasses.TestClasses;

@Epic("Main Page")
@Feature("AOpen Main Page")

public class FirstTest extends TestClasses {
    @Story("All buttons count in top menu - Administrator")
    @Description("Check all buttons count in top menu - Administrator")
    @Test
    public void openDropMain() {
        mainPage = openHomePage();
    }
}
