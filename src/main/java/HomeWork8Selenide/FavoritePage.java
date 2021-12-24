package HomeWork8Selenide;

import HomeWork6.FavoritPage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;


public class FavoritePage {

    private SelenideElement saveFavorite = $(By.xpath("//div[.='1 шт. сохранено']"));


    public FavoritPage successSaveFavoriteThing(){
        saveFavorite.shouldBe(visible);
        return page(FavoritPage.class);
    }
}
