package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.Locators;
import setup.Base;

public class SortingTests extends Base {

    @Test
    /*
    Test Steps :
    1.Go to the inventory Page
    2.Choose the price of the first item on the page and verify it
  */
    public void getFirstItemPriceFromItem () {
        print("You are on Inventory Page");
        InventoryPage inventoryPage=new InventoryPage(driver);
        print("Choose the first item from inventory page selected by price and verify it");
        Assert.assertEquals(inventoryPage.getFirstItemPrice(), Locators.CENA_PRVOG_PROIZVODA); print("Error:Difference price is shown than expected");
    }
}
