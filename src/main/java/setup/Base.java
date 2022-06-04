package setup;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class Base {
     public WebDriver driver;
    @BeforeMethod
    public void startBrowser () {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        driver= new ChromeDriver(options) ;

    }
    @AfterMethod
    public void quitBrowser () {
  //     driver.quit();
    }

    public void print (String s) {
        System.out.println(s);
    }


}


