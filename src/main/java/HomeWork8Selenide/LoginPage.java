package HomeWork8Selenide;


import HomeWork6.FavoritPage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {


    private SelenideElement loginInput = $(By.xpath("//input[@name='Username']"));

    private SelenideElement passwordInput = $(By.xpath("//input[@autocomplete='off']"));

    private SelenideElement loginButton = $(By.xpath("//div[@class='submit']//input"));

    public IndexPage authorizationClick(){
        loginInput.sendKeys("iv4nivanov2311@ya.ru");
        passwordInput.sendKeys("t==mSh11113");
        loginButton.click();
        return page(IndexPage.class);


    }

    private SelenideElement successAutxXpath = $(By.xpath("//span[.='Личный Кабинет']"));

    public LoginPage successAuthorization(){
        successAutxXpath.shouldBe(visible);
        return page(LoginPage.class);
    }



}
