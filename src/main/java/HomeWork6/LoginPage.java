package HomeWork6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Base{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@name='Username']")
    WebElement loginInput;

    @FindBy(xpath = "//input[@autocomplete='off']")
    WebElement passwordInput;

    @FindBy (xpath = "//div[@class='submit']//input")
    WebElement loginButton;

    public LoginPage authorizationClick(){
        loginInput.sendKeys("iv4nivanov2311@ya.ru");
        passwordInput.sendKeys("t==mSh11113");
        loginButton.click();
        return this;
    }

}
