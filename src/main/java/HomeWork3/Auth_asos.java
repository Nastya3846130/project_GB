package HomeWork3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auth_asos {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://my.asos.com/identity/login");
        driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("iv4nivanov2311@ya.ru");
        driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("t==mSh11113");
        driver.findElement(By.xpath("//div[@class='submit']//input")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
