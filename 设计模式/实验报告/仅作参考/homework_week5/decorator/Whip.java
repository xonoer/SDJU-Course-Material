/***********************************************************************
 * Module:  Whip.java
 * Author:  zzc20
 * Purpose: Defines the Class Whip
 ***********************************************************************/
package decorator;
import java.util.*;

/** @pdOid c6782434-1e3a-4bfa-97e0-5bb66709c828 */
public class Whip extends Ingredients {
   /** @pdOid fa3989f2-4526-4a88-b0d0-5b81b90ad0c6 */
   public String getDescription() {
      return bevge.getDescription() + ",длещ";
   }
   
   /** @pdOid b3b9f8b0-703e-46c3-89a4-8b9b9590b5eb */
   public int getCost() {
      return bevge.getCost() + 8;
   }
   
   /** @param bevge
    * @pdOid 63bea9fb-d6ed-44f3-8b69-abc3d74c8dc6 */
   public Whip(Beverage bevge) {
	   super(bevge);
   }

}