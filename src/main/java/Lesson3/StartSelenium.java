package Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StartSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.quit(); // закрыть браузер полностью
        //driver.close(); // закрыть вкладку

        WebDriverManager.firefoxdriver().setup(); // Регистрация драйвера с помощью webdriverManager, который скачает нужный драйвер за нас
        WebDriver firefox = new FirefoxDriver();
        firefox.get("https://ya.ru");
        firefox.quit();
    }
}
