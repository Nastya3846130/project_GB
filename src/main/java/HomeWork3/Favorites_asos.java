package HomeWork3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Favorites_asos {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.asos.com/ru/women/");
        driver.findElement(By.xpath("//p[text()='CHARLOTTE TILBURY']")).click();
        driver.findElement(By.xpath("//article[@id='product-20838213']//button")).click();
        driver.findElement(By.xpath("//a[@aria-label='Отложено']")).click();

        Thread.sleep(5000);

        driver.quit();

    }
}
