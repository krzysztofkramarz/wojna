package cards;

import lombok.Getter;

/**
 * @author krzysztof.kramarz
 */
@Getter
enum CartValue
{
   CART_2(2, "dwojka"),

   CART_3(3, "trojka"),

   CART_4(4, "czworka"),

   CART_5(5, "piatka"),

   CART_6(6, "szostka"),

   CART_7(7, "siodemka"),

   CART_8(8, "osemka"),

   CART_9(9, "dziewiatka"),

   CART_10(10, "dziesiatka"),

   CART_11(11, "walet"),

   CART_12(12, "dama"),

   CART_13(13, "krol"),

   CART_14(14, "as"),
//TODO   Siła Jokera Powinna być większa od ASA Kuba
   CART_15(14, "joker");

   private Integer power;
   private String description;

   CartValue(Integer power, String description)
   {
      this.power = power;
      this.description = description;
   }
}
