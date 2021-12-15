package HomeWork6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage extends Base{
    public IndexPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "women-floor")
    WebElement womenPage;

    public IndexPage womenPageClick(){
        womenPage.click();
        return this;
    }
    private final static String pipleButton = "//button[@icontype='accountUnfilled']";
    @FindBy(xpath = pipleButton)
    private WebElement piple;

    @FindBy(xpath = "//a[.='Личный кабинет']")
    WebElement userArea;

    @FindBy(xpath = "//p[.='ПОДАРКИ НА ЛЮБОЙ ВКУС']")
    WebElement presents;

    public IndexPage presentClick(){
        presents.click();
        return this;
    }

    public IndexPage pipleButtonClick(){
        actions.moveToElement(driver.findElement(By.xpath(pipleButton)))
                .build().
                perform();
        userArea.click();
        return this;

    }
}
