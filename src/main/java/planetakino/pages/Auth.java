package planetakino.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Auth {
    public WebDriver driver;

    @FindBy (xpath = "//*[@id=\"loginform-login\"]")
    private WebElement LoginInput;

    public Auth(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Auth loginInput(String phone) {
        LoginInput.sendKeys(phone);
        return this;
    }

    @FindBy (xpath = "//*[@id=\"loginform-password\"]")
    private WebElement passwordInput;

    public Auth passwordInput(String password){
        passwordInput.sendKeys(password);
        return this;
    }

    @FindBy (xpath = "//*[@class =\"btn-small auth-submit\"]")
    private WebElement loginButton;

    public Auth clickloginButton(){
        loginButton.click();
        return this;
    }

}
