import HomeWork8Selenide.FavoritePage;
import HomeWork8Selenide.IndexPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;

public class MyStepdefs {
    @When("Я перехожу на главной странице в раздел Женское")
    public void clickButtonWomen() {
        open("https://www.asos.com/ru/");
        new IndexPage().likeRandomCard();
    }

    @And("Я кликаю на кнопку Купить на главной странице")
    public void clickButtonBuy() {
    }

    @And("Я кликаю на сердечко у любого товара")
    public void clickHeart() {
    }

    @And("Я переходу на страницу сайта Избранное")
    public void clickButtonFavorite() {
    }

    @Then("Я вижу, что выбранный товар появился в избранном")
    public void iSeeMyFavoriteThing() {
        new FavoritePage().successSaveFavoriteThing();
    }
}
