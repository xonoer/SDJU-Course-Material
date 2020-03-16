/***********************************************************************
 * Module:  Boeing.java
 * Author:  zzc20
 * Purpose: Defines the Class Boeing
 ***********************************************************************/
package bridge;
import java.util.*;

/** @pdOid ff9eff1a-af96-498a-9bf4-105fa8515110 */
public class Boeing extends AircraftManufacturer {
   /** @pdOid a6383226-bfd7-4a0b-ae71-820689540266 */
   public void manufacture() {
	   aircraft.manufacture();
	   System.out.println("ÓÉ²¨ÒôÉú²ú");
   }

}