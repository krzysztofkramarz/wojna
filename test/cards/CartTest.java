package cards;

import static org.testng.Assert.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author krzysztof.kramarz
 */
//TODO: ola - good for you for testing :)
public class CartTest
{

   @Test
   public void testCompareLower(){

      Cart cart2 = new Cart(CartColor.CLUB, CartValue.CART_2);
      Cart cart4 = new Cart(CartColor.CLUB, CartValue.CART_4);

      int i = cart2.compareTo(cart4);
      assertEquals(i, -1);

   }

   @Test
   public void testCompareGreater(){

      Cart cart2 = new Cart(CartColor.CLUB, CartValue.CART_2);
      Cart cart4 = new Cart(CartColor.CLUB, CartValue.CART_4);

      int i = cart4.compareTo(cart2);
      assertEquals(i, 1);

   }

}