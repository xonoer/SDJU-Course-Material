/***********************************************************************
 * Module:  ElectricalFartory.java
 * Author:  zzc20
 * Purpose: Defines the Class ElectricalFartory
 ***********************************************************************/
package abstractFactory;
import java.util.*;

/** @pdOid 1ce3568e-793a-4640-a307-eca46587729c */
public abstract class ElectricalFartory {
   /** @pdOid 3c6285f7-d3b6-4d62-ac61-132ec5b87566 */
   public abstract Television createTelevision();
   /** @pdOid 01176692-4f52-45e2-91f0-53d801307a44 */
   public abstract AirConditioning createAirConditioning();

}