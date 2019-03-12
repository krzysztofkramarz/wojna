package cards;

import lombok.Getter;

/**
 * @author krzysztof.kramarz
 */
@Getter
enum CartColor
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
