package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Locators;
import pages.ShopingPage;
import setup.Base;

public class ShopingTests extends Base {

    @Test
    public void addingItemToTheCartAndVerifyingCartBox () {
        /*
        Test Steps :
        1.Go on the Shoping Page
        2.Choose the right book
        3.Put the book to the cart
        4.Check if the right book is in the cart by the name of the book
         */
        print("You are on the Shoping Page");
        ShopingPage shopingPage=new ShopingPage(driver);
        print("Choose the proper book (Luka Miceta's book");
        shopingPage.clickKnjigaLukaMiceta();
        print("Click add to cart button");
        shopingPage.clickCartButton();
        print("Check if proper book is put in the cart by the name of the book");
        shopingPage.getItemInTheCart();
        print("Verify that the right book is choosen");
        Assert.assertEquals(driver.getCurrentUrl() , Locators.IME_KNJIGE , "Invalid Item in the cart");
    }

    @Test
    public void findigPriceOfItemsThroughTheLoop () {
        ShopingPage shopingPage=new ShopingPage(driver);
        shopingPage.clickOdecaField();

    }


}
