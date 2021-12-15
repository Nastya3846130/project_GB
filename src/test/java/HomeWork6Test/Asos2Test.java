package HomeWork6Test;

import HomeWork6.IndexPage;
import HomeWork6.LoginBlock;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asos2Test {
    WebDriver driver;
    IndexPage indexPage;
    LoginBlock loginBlock;
    public final static String BASE_SITE = "https://www.asos.com/ru/";


    @BeforeAll
    static void registerDriver(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setUpDriver(){
        driver = new ChromeDriver();
        indexPage = new IndexPage(driver);
        loginBlock = new LoginBlock(driver);
        driver.get(BASE_SITE);
    }

    @Test
    void enterAccount(){
        new IndexPage(driver).pipleButtonClick();
    }
    @Test
    void clickRandom(){
        new IndexPage(driver).womenPageClick().presentClick();

    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

}
