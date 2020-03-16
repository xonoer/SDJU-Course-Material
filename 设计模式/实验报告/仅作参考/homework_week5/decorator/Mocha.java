/***********************************************************************
 * Module:  Mocha.java
 * Author:  zzc20
 * Purpose: Defines the Class Mocha
 ***********************************************************************/
package decorator;
import java.util.*;

/** @pdOid 470beac2-bf81-4537-b2b5-2d19984c5a2b */
public class Mocha extends Ingredients {
   /** @pdOid d547f6e5-f225-46cd-b4f3-5b8ce414df94 */
   public String getDescription() {
      return bevge.getDescription() + ",Ä¦¿¨";
   }
   
   /** @pdOid 833190fe-fd85-44c1-9006-9005e6b951bb */
   public int getCost() {
      return bevge.getCost() + 10;
   }
   
   /** @param bevge
    * @pdOid 09f40a3b-560a-4c76-a6a7-a40493d9410d */
   public Mocha(Beverage bevge) {
	   super(bevge);
   }

}