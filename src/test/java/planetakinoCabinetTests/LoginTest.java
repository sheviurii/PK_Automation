package planetakinoCabinetTests;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import planetakino.pages.Auth;
import planetakino.pages.Cabinet;
import planetakino.pages.Header;
import planetakino.pages.MainPage;


public class LoginTest extends BaseSettings {

    private WebDriver driver;
    private Header header;
    private Auth auth;
    private Cabinet cabinet;




    @BeforeMethod
    public void setupMainPage(){
        this.driver = super.driver;
        this.header = new Header(driver);
        this.cabinet = new Cabinet(driver);
        auth = new Auth(driver);

    }

    @Test
    public void loginTest() {

        header.clickOnAuth();
        auth.loginInput("380971225580")
        .passwordInput("Qwerty123")
        .clickloginButton();
        cabinet.checkVirtualCard();



        String actualResult = cabinet.checkVirtualCard();
        String expectedResult = "378263851544";

        Assert.assertEquals(expectedResult, actualResult);
    }
}
