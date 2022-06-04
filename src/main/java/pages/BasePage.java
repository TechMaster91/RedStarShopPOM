package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        driver.get("https://www.redstarshop.rs/");
        this.wait = new WebDriverWait(driver, 10);
    }




    public void scrollInToView(WebElement element) {
        print("Metoda za skrolovanje do odredjenog elementa na stranici");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", element);
    }

    public WebElement waitForWebElement(String locator) {
        print("Metoda za cekanje elemenata na stranici");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }

    public void print(String s) {
        System.out.println(s);
    }

    //Lokatori

    @FindBy(xpath = "//img[@alt='logo']/parent :: div")
    WebElement logoPic;

    @FindBy(xpath = "//div[@class='whb-main-header']//a[@href='javascript:void(0);']")
    WebElement searchButton;

    @FindBy(xpath = "//div[@class='basket-item-count']")
    WebElement basketItemCart;

    @FindBy(xpath = "//a[@class='fa fa-facebook']")
    WebElement socialNetworkButton;


    //Metode

    public void clickLogoPic() {
        logoPic.click();

    }

    public void clickSearchButton () {
        searchButton.click();
    }

    public void clickBasketItemCart() {
        basketItemCart.click();
    }

    public void clickSocialNetworkButton() {
        socialNetworkButton.click();
    }

    public void moveToElement(WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public void waitFOrElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }



}

