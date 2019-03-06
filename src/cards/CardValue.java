package cards;

/**
 * @author krzysztof.kramarz
 */
class CardValue
{

   cart2(2,"dwojka"),

   cart3(3,"trojka"),

   cart4(4,"czworka"),

   cart5(5,"piatka"),

   cart6(6,"szostka"),

   cart7(7,"siodemka"),

   cart8(8,"osemka"),

   cart9(9,"dziewiatka"),

   cart10(10,"dziesiatka"),

   cart11(11,"walet"),

   cart12(12,"dama"),

   cart13(13,"krol"),

   cart14(14,"as"),

   cart15(14,"joker");

   private Integer power;
   private String description;

   public CardValue(Integer power, String description)
   {
      this.power = power;
      this.description = description;
   }
}
