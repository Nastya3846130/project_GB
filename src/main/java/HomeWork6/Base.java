package HomeWork6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Base {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;
    public final static String BASE_SITE = "https://www.asos.com/ru/";

    public Base(WebDriver driver) {
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        this.actions = new Actions(driver);
    }
}
