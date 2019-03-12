package player;

import java.util.ArrayList;
import java.util.List;

import cards.Cart;
import cards.Deck;
import lombok.Getter;

/**
 * @author krzysztof.kramarz
 */

@Getter
public class Player
{

   private final Deck deckToUse;
   //TODO nieuzwane pole - Bartosz
   private final Deck deckAlreadyUsed = new Deck();
   private final String name;
//TODO operacje na decku gracza Kuba
   public Player(Deck deckToUse, String name)
   {
      this.deckToUse = deckToUse;
      this.name = name;
   }
}
