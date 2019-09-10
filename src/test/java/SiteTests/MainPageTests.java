package SiteTests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import planetakino.pages.Auth;
import planetakino.pages.Cabinet;
import planetakino.pages.Header;
import planetakino.pages.MainPage;
import planetakinoCabinetTests.BaseSettings;

public class MainPageTests extends BaseSettings {

    private MainPage mainPage;


    @BeforeMethod
    public void setupMainPage(){
//        this.driver = super.driver;
//        this.header = new Header(driver);
//        this.cabinet = new Cabinet(driver);
//        auth = new Auth(driver);
        mainPage = new MainPage(driver);
    }


    @Test
    public void isMainPageLoadFull() throws InterruptedException {
//        Thread.sleep(10000);

        Assert.assertTrue(mainPage.isChatBotDisplayed());
    }
}
