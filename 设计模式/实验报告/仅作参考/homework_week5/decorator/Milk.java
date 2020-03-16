/***********************************************************************
 * Module:  Milk.java
 * Author:  zzc20
 * Purpose: Defines the Class Milk
 ***********************************************************************/
package decorator;
import java.util.*;

/** @pdOid 14a091e4-03b1-445a-b191-84e1847ef046 */
public class Milk extends Ingredients {
   /** @pdOid 38e8f8ab-b671-449d-aceb-e2d260ad8007 */
   public String getDescription() {
      return bevge.getDescription() + ",еёдл";
   }
   
   /** @pdOid 7f313354-0cb4-4b57-a1a9-636466738958 */
   public int getCost() {
      return bevge.getCost() + 6;
   }
   
   /** @param bevge
    * @pdOid cbbac4bd-1fb3-4c5d-a518-34dd653092df */
   public Milk(Beverage bevge) {
      super(bevge);
   }

}