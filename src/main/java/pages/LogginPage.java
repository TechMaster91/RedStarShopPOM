package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogginPage extends BasePage {
    WebDriver driver;



    //lokatori
    @FindBy (xpath = " //a[@href='https://www.redstarshop.rs/my-account/']")
    WebElement mojNalogField;

    @FindBy (xpath = "//input[@id='username']")
    WebElement usernameField;

    @FindBy (xpath = "//input[@id='password']")
    WebElement passwordField;

    @FindBy (xpath = "//button[text()='Пријавите се']")
    WebElement logginButton;

    @FindBy (xpath = "//a[text()='Одјавитe се']//parent::li")
    WebElement loggOutButton;

    @FindBy (xpath = "//span[contains(text() ,'Login / Register')]//parent::a")
    WebElement accountButton;

    //konstruktor
    public LogginPage ( WebDriver driver) {
        super(driver);
        print("Open Home Page");
        driver.get("https://www.redstarshop.rs/");
        PageFactory.initElements(driver , this);
    }

    //metode

    public void MojNalogFieldclick () {
        print("Click on Moj Nalog field");
        moveToElement(mojNalogField);
       mojNalogField.click();
    }

    public void enterUsername(String valid_username) {
        print("Enter Username");
        usernameField.sendKeys(valid_username);
    }

    public void enterPassword(String valid_password){
        print("Valid password");
        passwordField.sendKeys(valid_password);
    }


    public void clickLogginButton (){
        print("Click Log in button");
        logginButton.click();
    }

    public void clickLoggOutButton () {
        loggOutButton.click();
    }

    public void clickAccountButton () {
        accountButton.click();
    }

    public void LoggInWithValidCredentials () {
        mojNalogField.click();
        enterUsername(Locators.valid_username);
        enterPassword(Locators.valid_password);
        logginButton.click();

    }


}

