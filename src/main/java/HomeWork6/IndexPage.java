package HomeWork6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class IndexPage extends Base {
    public IndexPage(WebDriver driver) {
        super(driver);
    }


    private final static String pipleButton = "//button[@icontype='accountChristmasUnfilled']";

    @FindBy(xpath = "//a[.='Личный кабинет']")
    WebElement userArea;

    public IndexPage pipleButtonClick() {
        actions.moveToElement(driver.findElement(By.xpath(pipleButton)))
                .build()
                .perform();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='Личный кабинет']")));
        userArea.click();
        return this;
    }


    @FindBy(id = "women-floor")
    WebElement womenPage;

    @FindBy(xpath = "//span[.='КУПИТЬ']")
    WebElement buttonByInIndexPage;

    private final static String LIKE_CARD_LOCATOR = "//button[@data-auto-id = 'saveForLater'][1]";

    @FindBy(xpath = LIKE_CARD_LOCATOR)
    WebElement likeOneCard;

    @FindBy(xpath = "//a[@aria-label='Отложено']")
    WebElement favoriteButton;

    public IndexPage likeRandomCard(){
        womenPage.click();
        buttonByInIndexPage.click();
        likeOneCard.click();
        favoriteButton.click();


        return this;
    }

}
