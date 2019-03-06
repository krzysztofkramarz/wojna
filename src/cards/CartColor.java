package cards;

/**
 * @author krzysztof.kramarz
 */
public enum CartColor
{
   CLUB("♣"),
   DIAMOND("♦"),
   HEART("♥"),
   SPADE("♠");

   private String color;

   CartColor(String color)
   {
      this.color = color;
   }
}
