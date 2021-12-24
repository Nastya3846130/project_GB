package HomeWork8Selenide;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.codeborne.selenide.Selenide.*;

public class IndexPage {
    //private final static String pipleButton = "//button[@icontype='accountChristmasUnfilled']";

    private SelenideElement userArea = $(By.xpath("//a[.='Личный кабинет']"));

    private SelenideElement pipleButton =
            $(By.xpath("//button[@icontype='accountChristmasUnfilled']"));

   // @Step
    public IndexPage pipleButtonClick() {
        pipleButton.hover();
        userArea.click();
        return page(IndexPage.class);
    }


    private SelenideElement womenPage = $(By.id("women-floor"));

    private SelenideElement buttonByInIndexPage = $(By.xpath("//span[.='КУПИТЬ']"));

    private SelenideElement likeOneCard = $(By.xpath("//button[@data-auto-id = 'saveForLater'][1]"));

    private SelenideElement favoriteButton = $(By.xpath("//a[@aria-label='Отложено']"));

    public IndexPage likeRandomCard(){
        womenPage.click();
        buttonByInIndexPage.click();
        likeOneCard.click();
        favoriteButton.click();
        return page(IndexPage.class);
    }
}
