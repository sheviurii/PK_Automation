package planetakino.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Cabinet {

    public WebDriver driver;

    @FindBy (xpath = "//*[@id=\"page-content\"]/div[2]/div[2]/div[4]/div/p")
    public WebElement virtualCard;

    public Cabinet(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String checkVirtualCard(){
      return virtualCard.getText();
    }

}
