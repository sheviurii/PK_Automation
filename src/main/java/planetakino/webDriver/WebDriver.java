package planetakino.webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.Element;


public class WebDriver {

    public WebDriver driver;

    public WebDriver(WebDriver driver) {
        this.driver = driver;
    }


    public WebDriver waitToLoadingUserMainPage() {

        new WebDriverWait((org.openqa.selenium.WebDriver) driver, 1).
                until(ExpectedConditions.
                        visibilityOfElementLocated(By.xpath("//*[@id=\"summary_products_quantity\"][contains(text(),'2 Products')]"))).
                getText();
        return this;
    }
}
