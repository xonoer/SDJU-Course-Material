/***********************************************************************
 * Module:  Ingredients.java
 * Author:  zzc20
 * Purpose: Defines the Class Ingredients
 ***********************************************************************/
package decorator;
import java.util.*;

/** @pdOid cbc60592-9c4a-455f-b8e2-123a9e513a46 */
public class Ingredients extends Beverage {
 
   /** @pdRoleInfo migr=no name=Beverage assc=association1 mult=1..1 type=Aggregation */
   public Beverage bevge;
   
   /** @pdOid ecdb7f2e-ddbc-4e17-b0aa-7f31a66f2e4e */
   public String getDescription() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid c4c10c53-4abf-416e-83e4-31812a0c9aff */
   public int getCost() {
      return 0;
   }
   
   /** @param bevge
    * @pdOid e7a375c2-e4a7-4882-8d7b-9d9286c61602 */
   public Ingredients(Beverage bevge) {
	   this.bevge = bevge;
   }

}