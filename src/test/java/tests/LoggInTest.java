package tests;

import pages.LogginPage;
import pages.Locators;
import org.testng.Assert;
import org.testng.annotations.Test;
import setup.Base;

/* Test Steps :
1.Enter on the Log in Page
2.Enter on the home page
3. Enter valid username (e-mail adress)
4.Enter valid password
5.Click Log in button
6.Verify that you are loged in
*/
public class LoggInTest extends Base {

    @Test(priority = 0)
    public void LoggInWithValidCreds() {

        print("Navigate to loggin page");
        LogginPage logginPage = new LogginPage(driver);
        print("Enter on the homepage with valid creds");
        logginPage.MojNalogFieldclick();
        print("Enter valid username");
        logginPage.enterUsername(Locators.valid_username);
        print("Enter valid password");
        logginPage.enterPassword(Locators.valid_password);
        logginPage.clickLogginButton();
        print("Verify that URL is correct");
        Assert.assertEquals(driver.getCurrentUrl(), Locators.LOGIN_PAGE_ACOUNT_URL); print("Error : Invalid e-mail adress");
    }


    @Test(priority = 1)
    public void LoggOutTest() {
        LogginPage logginPage=new LogginPage(driver);
        logginPage.LoggInWithValidCredentials();
        logginPage.clickLoggOutButton();
        Assert.assertEquals(driver.getCurrentUrl() , Locators.LOG_OUT_PAGE_URL );
    }
}

