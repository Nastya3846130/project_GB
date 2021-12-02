package HomeWork3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToBasket_asos {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.asos.com/ru/women/");
        driver.findElement(By.xpath("//div[@class='salesBanner__buttons']//a[1]")).click();
        driver.findElement(By.id("product-201096374")).click();
        driver.findElement(By.xpath("//span[text()='Добавить в корзину']")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
