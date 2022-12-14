package tests;

import com.codeborne.selenide.Configuration;
import data.pageObject.mainPage.MainPage;
import io.qameta.allure.Step;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.FileDownloadMode.FOLDER;
import static com.codeborne.selenide.FileDownloadMode.PROXY;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.driver;

public class TestBase {
    public final static String MAIN_PAGE = "https://drope.me/";

    @BeforeClass
    public void setUp() {

        Configuration.startMaximized = true;
        Configuration.timeout = 5000;
        Configuration.pageLoadStrategy = "normal";
        Runtime.getRuntime().addShutdownHook(new Thread(driver()::close));
       }

    @AfterClass
    public static void quitDriver() {
        driver().close();
    }
    @Step
    public MainPage openHomePage() {
        open(MAIN_PAGE);
        return new MainPage();
    }
    }

