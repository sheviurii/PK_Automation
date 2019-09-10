package planetakinoCabinetTests;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import planetakino.utils.Config;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public abstract class BaseSettings {

    public WebDriver driver;
    private final Properties config = Config.loadProperties("src/main/resources/test.properties");

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", config.getProperty("chromedriver"));
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(config.getProperty("baseurl"));
    }


    @AfterMethod
    public void cleanup() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
