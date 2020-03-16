/***********************************************************************
 * Module:  Airbus.java
 * Author:  zzc20
 * Purpose: Defines the Class Airbus
 ***********************************************************************/
package bridge;
import java.util.*;

/** @pdOid 28cd77e8-1730-4d3d-9f88-2c30a16a959c */
public class Airbus extends AircraftManufacturer {
   /** @pdOid d5e7fa8a-db8b-4c26-acbe-be5aa3c4e711 */
   public void manufacture() {
	   aircraft.manufacture();
	   System.out.println("由空客生产");
   }

}