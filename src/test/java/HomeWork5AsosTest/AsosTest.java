package HomeWork5AsosTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AsosTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;
    private final static String HEADER_SITE = "https://www.asos.com/ru/";

    @BeforeAll
    static void registerDriver(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupDriver(){
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
        driver.get(HEADER_SITE);
    }

    @Test
    void likeRandomThing() throws InterruptedException {
        //login();
        driver.findElement(By.id("women-floor")).click();
        driver.findElement(By.xpath("//p[.='ПОДАРКИ НА ЛЮБОЙ ВКУС']")).click();
        driver.findElement(By.xpath("//button[@data-auto-id='saveForLater'][1]")).click();
        driver.findElement(By.xpath("//a[@aria-label='Отложено']")).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[.='Набор для макияжа глаз Charlotte Tilbury – Push Up And Recover']")));
        Assertions.assertEquals(driver.findElement(By.xpath("//p[.='Набор для макияжа глаз Charlotte Tilbury – Push Up And Recover']")).isDisplayed(),true);
        Thread.sleep(5000);

    }

    @Test
    void addToBag() throws InterruptedException {
        //login();
        driver.findElement(By.id("women-floor")).click();
        driver.findElement(By.xpath("//p[.='ПОДАРКИ НА ЛЮБОЙ ВКУС']")).click();
        driver.findElement(By.xpath("//div/img[1]")).click();
        driver.findElement(By.xpath("//span[.='Добавить в корзину']")).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Просмотреть Корзину']")));
        driver.findElement(By.xpath("//span[.='Просмотреть Корзину']")).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='Набор для макияжа глаз Charlotte Tilbury – Push Up And Recover']")));
        Assertions.assertEquals(driver.findElement(By.xpath("//a[.='Набор для макияжа глаз Charlotte Tilbury – Push Up And Recover']")).isDisplayed(),true);


    }

    void login() throws InterruptedException {
        actions.moveToElement(driver.findElement(By.xpath("//button[@icontype='accountUnfilled']")))
                .build() // завершили перечисление всех метолов, которые необходимо выполнить
                .perform();// выполнение всех перечисленных методов
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='Личный кабинет']")));
        driver.findElement(By.xpath("//a[.='Личный кабинет']")).click();
        driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("iv4nivanov2311@ya.ru");
        driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("t==mSh11113");
        driver.findElement(By.xpath("//div[@class='submit']//input")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//header//div//div//div//div//a[contains(@href, 'asos.com/ru')]")).click();

    }

    @AfterEach
    void tearDown(){
        driver.quit();
    }


}
