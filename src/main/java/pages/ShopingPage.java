package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopingPage extends BasePage{


    //Lokatori
    @FindBy (xpath = "//a[text()='Крик страсти и маршеви тријумфа – Лука Мичета']")
    WebElement knjigaLukaMiceta;

    @FindBy (xpath = "//button[text()='Додај у корпу']")
    WebElement cartButton;

    @FindBy (xpath = "//li[@class='woocommerce-mini-cart-item mini_cart_item']")
    WebElement itemInTheCart;

    @FindBy (xpath = "//ul[@id='menu-glavni-meni']//span[text()='Одећа']")
    WebElement odecaField;

    @FindBy (xpath = "//span[@class='price']")
    WebElement priceList;



    //Konstruktor
    public ShopingPage(WebDriver driver) {
        super(driver);
        driver.get("https://www.redstarshop.rs/");
        PageFactory.initElements(driver, this);
    }

    //Metode

    public void clickKnjigaLukaMiceta () {
        print("Klik na knjigu");
        knjigaLukaMiceta.click();
    }

    public void clickCartButton () {
        print("klik na korpu");
        cartButton.click();
    }

    public String getItemInTheCart () {
        print("Metoda koja ceka da se element pojavi i asertuje  element po tekstu");
        waitFOrElement(itemInTheCart);
        return itemInTheCart.getText();
    }

    public void clickOdecaField () {
        odecaField.click();
    }




    }





