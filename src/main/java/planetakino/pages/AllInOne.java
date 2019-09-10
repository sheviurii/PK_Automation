package planetakino.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllInOne {

    public WebDriver driver;

    public AllInOne (WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//a[contains(text(),'Вхід')]")
    private WebElement MenuAuth;

    public AllInOne clickOnAuth1() {
        MenuAuth.click();
        return this;
    }
}
