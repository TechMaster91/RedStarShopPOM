package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;



import java.util.List;

public class InventoryPage extends BasePage {


    //Lokatori

    @FindBy(xpath = "//a[text()='Макрон дрес ЦЗ 21/22']")
    WebElement dresCZV;

    @FindBy(xpath = "//a[text()='Макрон дрес 21/22 – Гарнитура 3']")
    WebElement thirdKittJersey;

    @FindBy(xpath = "//h2[text()='Знојница']")
    WebElement znojnica;

    @FindBy(xpath = "//select[@id='pa_size']")
    WebElement velicinaMenu;

    @FindBy(xpath = "//select[@id='pa_igrac']")
    WebElement imeIgracaMenu;

    @FindBy(xpath = "//div[text()='S']")
    WebElement sSize;

    @FindBy(xpath = "//div[text()='M']")
    WebElement mSizeThirdJersey;

    @FindBy(xpath = "//input[@type='number']")
    WebElement kolicinaMenu;

    @FindBy(xpath = "//select[@id='pa_size']")
    WebElement velicinaDropdown;

    @FindBy(xpath = "//h2[text()='Макрон голмански дрес плави за сезону 2021/22.']")
    WebElement awayJersey;

    @FindBy(xpath = "//option[@value='m']")
    WebElement sizeAwayJersey;


    @FindBy (xpath = "//article[@id='post-45310']//div[@class='vc_column-inner vc_custom_1505911763176']")
    WebElement trenerkeSekcija;

    @FindBy (xpath = "//div[@data-id='59467']")
    WebElement donjiDeoTrenerkePlavi;

    @FindBy (xpath = "//button[text()='Додај у корпу']")
    WebElement korpaButton;

    @FindBy (xpath = "//input[@value='1']")
    WebElement brojIzKorpe;

    //Konstruktor

    public InventoryPage(WebDriver driver) {
        super(driver);
        driver.get("https://www.redstarshop.rs/");
        PageFactory.initElements(driver, this);
    }

    //Metode



    public void clickDresCZV() {
        print("Metoda za click na dres CZV");
        dresCZV.click();
    }

    public void clickThirdKittJersey () {
        print("Metoda za click na treci set dresova");
        thirdKittJersey.click();
    }



    public void clickSsize() {
        print("Metoda za click na velicinu dresa");
        sSize.click();
    }

    public void clickMsizeThirdJersey() {
        print("Metoda za klik na M velicinu treceg seta dresova");
        mSizeThirdJersey.click();
    }

    public void clickKolicinaMenu() {
        print("Metoda za click na kolicina meni");
        kolicinaMenu.click();
    }



    public void selectVelicinaMenu(String velicina) {
        print("Metoda za odabir iz DropDown-a putem select klase");
        Select size = new Select(velicinaDropdown);
        size.selectByVisibleText(velicina);
    }




    public String getFirstItemPrice() {
        print("Metoda za dohvatanje cene prvog elementa sa stranice");
        List<WebElement> items = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By.xpath("//span[@class='price']"))));
        String firstItem = items.get(0).getText();
        print(firstItem);
        return firstItem;


    }

    public void clickTrenerkeSekcija () {
        print("Metoda za click na trenerka sekciju + high level metoda sa odabirom dela trenerka i klikom na korpu");
        trenerkeSekcija.click();
        clickDonjiDeoTrenerkePlavi();
        clickKorpaButton();
        driver.switchTo().alert().accept();
    }

    public void clickDonjiDeoTrenerkePlavi () {
        print("Metoda za click na donji deo trenerke-plavi");
        donjiDeoTrenerkePlavi.click();
    }

    public void clickKorpaButton () {
        print("Metoda za click na korpu");
        korpaButton.click();
    }

     public String getBrojIzKorpe (){
        print("Metoda za dohvatanje broja iz korpe i asertaciju");
        return brojIzKorpe.getText();
    }








}
