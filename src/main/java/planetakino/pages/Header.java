package planetakino.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {


    private final WebDriver driver;
    @FindBy(css = "header a.icon-logo")
    public WebElement Logo;

    public Header(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Header clickOnLogo() {
        Logo.click();
        return this;
    }

    @FindBy(css = "header a[href='/kiev/showtimes/")
    private WebElement menuShowtimes;

    public Header clickShowtimes() {
        menuShowtimes.click();
        return this;
    }

    @FindBy(xpath = "//a[@href='/kiev/movies/")
    private WebElement menuFilms;

    public Header clickFilms() {
        menuFilms.click();
        return this;
    }

    @FindBy(css = "header a[href='/relux/']")
    private WebElement menuRelux;

    public Header clickRelux() {
        menuRelux.click();
        return this;
    }

    @FindBy(css = "header a[href='/imax/']")
    private WebElement menuIMAX;

    public Header clickImax() {
        menuIMAX.click();
        return this;
    }

    @FindBy(css = "header a[href='/4dx/']")
    private WebElement menu4DX;

    public Header click4DX() {
        menu4DX.click();
        return this;
    }

    @FindBy(css = "header a[href='/cinetech/']")
    private WebElement menuCinetech;

    public Header clickCinetech() {
        menuCinetech.click();
        return this;
    }

    @FindBy(css = "header a[href='/svidok/']")
    private WebElement menuSchos;

    public Header clickSchos() {
        menuSchos.click();
        return this;
    }

    @FindBy(css = "header a[href='/club/']")
    private WebElement menuClub;

    @FindBy(css = "header a[href='#']")
    private WebElement menuOthers;

    @FindBy(css = "header a[href='/theatres/']")
    private WebElement menuTheatres;

    @FindBy(css = "header a[href='/about/faq/']")
    private WebElement menuHelpAndAnswers;

    @FindBy(css = "header a[href='/i/sale/']")
    private WebElement menuDiscounts;

    @FindBy(css = "header a[href='/i/gift-certificate/']")
    private WebElement menuGiftCertificate;

    @FindBy(css = "header a[href='/events/']")
    private WebElement menuEvents;

    @FindBy(css = "header a[href='/about/']")
    private WebElement menuAboutPlanetakino;

    @FindBy(css = "header a[href='/about/vacancy/']")
    private WebElement menuWorkAtUs;

    @FindBy(xpath = "//div[@class='city-selector']")
    private WebElement menuCitySelect;

    @FindBy(xpath = "//ul[@class='addon-menu']")
    private WebElement menuOtherCitySelect;

    @FindBy(xpath = "//li[@class='addon-menu__list-item active']//a[contains(text(),'Київ')]")
    private WebElement menuOtherCityKiev;

    @FindBy(xpath = "//a[contains(text(),'Київ (River Mall)')]")
    private WebElement menuOtherCityRiverMall;

    @FindBy(xpath = "///a[contains(text(),'Одеса (Котовського)')]")
    private WebElement menuOtherCityOdessa;

    @FindBy(xpath = "//a[contains(text(),'Одеса (Таїрова)')]")
    private WebElement menuOtherCityOdessa2;

    @FindBy(xpath = "//a[contains(text(),'Львів (King Cross)')]")
    private WebElement menuOtherCityLvov;

    @FindBy(xpath = "//a[contains(text(),'Львів (FORUM LVIV)')]")
    private WebElement menuOtherCityLvov2;

    @FindBy(xpath = "//a[contains(text(),'Харків')]")
    private WebElement menuOtherCityKharkov;

    @FindBy(xpath = "//a[contains(text(),'Суми')]")
    private WebElement menuOtherCitySumy;

    @FindBy(xpath = "//a[contains(text(),'Вхід')]")
    private WebElement menuAuth;

    public Header clickOnAuth() {
        menuAuth.click();
        return this;
    }

    @FindBy(xpath = "//a[@class='register-link']")
    private WebElement menuRegistration;
}
