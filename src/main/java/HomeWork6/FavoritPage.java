package HomeWork6;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.hamcrest.MatcherAssert.assertThat;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.isDisplayed;

public class FavoritPage extends Base{
    public FavoritPage(WebDriver driver) {
        super(driver);
    }

    private final static String SAVE_FAVORITE = "//div[.='1 шт. сохранено']";

    @FindBy (xpath = SAVE_FAVORITE)
    private WebElement saveFavorite;


    public FavoritPage successSaveFavoriteThing(){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SAVE_FAVORITE)));
        assertThat(saveFavorite, isDisplayed());
        return this;
    }
}
