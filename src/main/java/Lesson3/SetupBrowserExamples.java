package Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.*;

public class SetupBrowserExamples {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");//запустить браузер без интерфейса
        options.addArguments("--disable-notifications"); // заблокировать нотификации
        options.addArguments("user-agent=Googlebot/2.1 (+http://www.google.com/bot.html)"); //"прикинуться" поисковым роботом
        WebDriver driver = new ChromeDriver(options); // передаем настройки в конструктор драйвера
        driver.get("https://google.com");
        Thread.sleep(5000);
        //driver.quit();

        ((JavascriptExecutor) driver).executeScript("window.open()"); // открыть новую страницу в бразуере через JS
        List<String> tubs = new ArrayList<>(driver.getWindowHandles());//Получили список дескрипторов открытых окон (дескриптор-просто набор символов, уникальный для каждой вкладки)
        //driver.switchTo().alert(); // переключиться на всплывающее окно
        // driver.switchTo().alert().sendKeys("tttt"); // переключиться на всплывающее и передать текст
        driver.switchTo().window(tubs.get(0)); // переключиться в первое окно полученной индексации
        driver.quit();

    }
}


