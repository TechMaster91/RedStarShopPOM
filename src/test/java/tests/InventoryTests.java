package tests;


import org.testng.Assert;
import pages.BasePage;
import pages.InventoryPage;
import org.testng.annotations.Test;
import pages.Locators;
import pages.LogginPage;
import setup.Base;

public class InventoryTests extends Base {

    @Test
    /* Test Steps :
    1.Enter on the Home Page
    2.Choose Red Star Home Jersey
    3.Select size of jersey
    4.Validate that the apropriate size is choosen
     */
    public void AddingOneItemToTheCart() {
        {
            LogginPage logginPage = new LogginPage(driver);
            print("You are on Inventory Page");
            InventoryPage inventoryPage = new InventoryPage(driver);
            print("Choose the Red Star Home Jersey");
            inventoryPage.clickDresCZV();
            print("Choose size of jersey");
            inventoryPage.clickSsize();
            print("Validate that you have choosen right jersey");
            Assert.assertEquals(driver.getCurrentUrl(), Locators.VELICINA_DRESA);
        }

    }

    @Test
    public void AddingOneItemToTheCartAndSelectSizeAndAmount() {
        /*
        Test Steps :
        1.Choose sorts from Inventory Page
        2.Choose size of Jersey (M)
        3.Choose amount of Jersey's (1)
        4.Validate that the right Jersey appear and the size and amount are correct
         */

        BasePage basePage=new BasePage(driver);
        print("You are on Inventory Page");
        InventoryPage inventoryPage=new InventoryPage(driver);
        print("click gostujuci dres");
        inventoryPage.clickThirdKittJersey();
        print("click on size of the Jersey (M)");
        inventoryPage.clickMsizeThirdJersey();
        print("Choose amount of Jersey's (1)");
        inventoryPage.clickKolicinaMenu();
        print("Verify that choosen Jersey is selected so as size and amount");
        Assert.assertEquals(driver.getCurrentUrl() ,Locators.VELICINA_GOSTUJUCEG_DRESA);

    }



    @Test
    public void AddingOneItemToTheCartAndFinish () {
        /*
        Test Steps :
        1.Enter on the Inventory Page
        2.Choose Trenerka section
        3.Choose Plava Trenerka
        4.Add Plava Trenerka to the cart
        5.Verify that right number from the cart apears (1)
         */
        print("You are on Inventory Page");
        InventoryPage inventoryPage=new InventoryPage(driver);
        print("Addint specific trenerka (plava) in to the cart");
        inventoryPage.clickTrenerkeSekcija();
        print("Verifying that the right trenerka is choosen and add to the cart");
        inventoryPage.getBrojIzKorpe();
        assert Locators.BROJ_IZ_KORPE.equals("1"); print("Error: Wrong number in the cart");
    }



    }






