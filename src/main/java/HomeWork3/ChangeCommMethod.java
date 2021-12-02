package HomeWork3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeCommMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://my.asos.com/identity");

        //пройти авторизацию
        driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("iv4nivanov2311@ya.ru");
        driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("t==mSh11113");
        driver.findElement(By.xpath("//div[@class='submit']//input")).click();
        Thread.sleep(5000);

        //изменение способа связи
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[1]/div[1]/div/div/div[1]/nav/ul[3]/li[5]/a/div[2]")).click();

        //driver.quit();

    }
}
