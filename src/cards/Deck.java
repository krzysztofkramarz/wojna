package cards;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

/**
 * @author krzysztof.kramarz
 */
@Getter
@SuppressWarnings("NewClassNamingConvention")
public class Deck
{

    private final List<Cart> deck = new ArrayList<>();

    // TODO Brakuje możliwości ponownego tasowanie decku Kuba


   //TODO Niepotrzebny pusty konstruktor - Bartosz
   public Deck()
   {

   }
//TODO Zostana dodane 4 jokery, jokery nie maja swojego koloru - Bartosz
   //TODO: ola - you can create deck in constructor
   public void createFullDeck()
   {


      for (CartColor cartColor : CartColor.values())
      {
         for (CartValue cartValue : CartValue.values())
         {
            deck.add(new Cart(cartColor, cartValue));
         }

      }

   }

   public void addCartToDeck(Cart newCart)
   {
      deck.add(newCart);
   }
}
