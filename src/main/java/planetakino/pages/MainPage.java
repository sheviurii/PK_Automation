package planetakino.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Set;

public class MainPage implements WebDriver {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
//        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//a[@role='button'][@data-slide='prev'][@href='#slider-block-main']")
    private WebElement SliderMovieButtonLeft;

    @FindBy (xpath = "//a[@role='button'][@data-slide='next'][@href='#slider-block-main']")
    private WebElement SliderMovieButtonRight;

//    @FindBy (xpath = "/html/body/div[7]/div/span")
//    private WebElement ChatBot;

    private final static String ChatBot = "/html/body/div[7]/div/span";

//    @FindBy (css = "body > div.lt-label.lt-label-event.lt-online > div > span")
//    private String ChatBot;


    public boolean isChatBotDisplayed(){
        return this.driver.findElement(By.xpath(ChatBot)).isDisplayed();
    }


    public void get(String s) {

    }

    public String getCurrentUrl() {
        return null;
    }

    public String getTitle() {
        return null;
    }

    public List<WebElement> findElements(By by) {
        return null;
    }

    public WebElement findElement(By by) {
        return null;
    }

    public String getPageSource() {
        return null;
    }

    public void close() {

    }

    public void quit() {

    }

    public Set<String> getWindowHandles() {
        return null;
    }

    public String getWindowHandle() {
        return null;
    }

    public TargetLocator switchTo() {
        return null;
    }

    public Navigation navigate() {
        return null;
    }

    public Options manage() {
        return null;
    }
}
