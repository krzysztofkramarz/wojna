package cards;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * @author krzysztof.kramarz
 */
@SuppressWarnings("NewClassNamingConvention")

//TODO Pierszy raz wiszę Lomboka wyglada na wygodne Kuba
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Cart implements Comparable<Cart>
{
   private final CartColor cartColor;
   private final CartValue cartValue;

   @Override
   public int compareTo(Cart valueToCompare)
   {
      if (cartValue.getPower() < valueToCompare.getCartValue().getPower())
      {
         return -1;
      }
      if (cartValue.getPower() < valueToCompare.getCartValue().getPower())
      {
         return 0;
      }
      return 1;
   }

   @Override
   public String toString()
   {
      return cartColor.getColor() +
            "(" + cartValue.getPower() +
            ')';
   }
}
