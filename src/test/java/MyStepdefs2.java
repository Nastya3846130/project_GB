import HomeWork8Selenide.IndexPage;
import HomeWork8Selenide.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs2 {
    @Given("Действия в ЛК")
    public void действияВЛК() {
    }

    @When("Навожу курсор на кнопку с человечком, кликаю Войти")
    public void hoverAndClickPipleButton() {
        new IndexPage().pipleButtonClick();
    }

    @And("Заполняю поля валидными данными")
    public void takeValidLogin() {
        new LoginPage().authorizationClick();
    }

    @Then("Вижу, что откралась страница ЛК")
    public void seeSuccessMessage() {
        new LoginPage().successAuthorization();
    }
}
