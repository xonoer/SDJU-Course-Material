/***********************************************************************
 * Module:  TclFactory.java
 * Author:  zzc20
 * Purpose: Defines the Class TclFactory
 ***********************************************************************/
package abstractFactory;
import java.util.*;

/** @pdOid 0d45c8f7-3ae3-4364-a9a7-203b778398ec */
public class TclFactory extends ElectricalFartory {
   /** @pdOid 61b6e118-943d-4fea-86b9-b9cf1cfc88f6 */
   public Television createTelevision() {
	   return new TclTelevision();
   }
   
   /** @pdOid ab923af4-ce46-4b18-9c60-655021e74219 */
   public AirConditioning createAirConditioning() {
	   return new TclAirConditioning();
   }

}