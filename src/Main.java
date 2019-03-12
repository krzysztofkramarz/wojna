import java.util.List;

import cards.Cart;
import cards.Deck;
import crupier.Crupier;
import player.Player;

/**
 * @author krzysztof.kramarz
 */
//TODO Mysle, ze lepiej gdyby byl to projekt mavenowy - Bartosz
class Main
{
   //TODO: ola - to much in main method
   public static void main(String[] args)
   {
      // Deck deck = new Deck();
      // deck.createFullDeck();
      // deck.getDeck().forEach(System.out::print);
      //


      //TODO Brakuje logiki gry Kuba


      int ileKart = 10;
      Crupier crupier = new Crupier();
      Deck deckToUseForPlayer1 = crupier.createDeckToUse(ileKart);
      Deck deckToUseForPlayer2 = crupier.createDeckToUse(ileKart);

      //TODO: ola - each player has his own deck? What is deck exacly?
      Player player1 = new Player(deckToUseForPlayer1, "Gracz jeden");
      Player player2 = new Player(deckToUseForPlayer2, "Gracz jeden");
      player1.getDeckToUse().getDeck().stream().forEach(System.out::println);


   }
}
