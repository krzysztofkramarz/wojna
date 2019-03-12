package crupier;

import java.util.List;
import java.util.Random;

import cards.Cart;
import cards.Deck;

/**
 * @author krzysztof.kramarz
 */
public class Crupier
{

   public Deck createDeckToUse(int ileKart)
   {
      //TODO: ola - why you need two decks?
      Deck deck = new Deck();
      deck.createFullDeck();
      Deck deckToUse = new Deck();
      List<Cart> fullDeck = deck.getDeck();

      int size = fullDeck.size();
      Random random = new Random();
      for (int i = 0; i <= ileKart; i++)
      {
         int position = random.nextInt(size);
         deckToUse.addCartToDeck(fullDeck.remove(position));
         size--;
      }
      return deckToUse;

   }
}
