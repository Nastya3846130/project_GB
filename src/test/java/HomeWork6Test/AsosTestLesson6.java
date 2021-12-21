package HomeWork6Test;

import HomeWork6.FavoritPage;
import HomeWork6.IndexPage;
import HomeWork6.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AsosTestLesson6 {
    WebDriver driver;
    IndexPage indexPage;
    LoginPage loginBlock;
    FavoritPage favoritPage;
    public final static String BASE_SITE = "https://www.asos.com/ru/";


    @BeforeAll
    static void registerDriver(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setUpDriver(){
        driver = new ChromeDriver();
        indexPage = new IndexPage(driver);
        loginBlock = new LoginPage(driver);
        driver.get(BASE_SITE);
    }

    @Test
    void authorization() {
        new IndexPage(driver).pipleButtonClick();
        new LoginPage(driver).authorizationClick();

    }

    @Test
    void likeRandomCards(){
        new IndexPage(driver).likeRandomCard();
        new FavoritPage(driver).successSaveFavoriteThing();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }




}
