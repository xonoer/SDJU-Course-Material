/***********************************************************************
 * Module:  McDonnellDouglas.java
 * Author:  zzc20
 * Purpose: Defines the Class McDonnellDouglas
 ***********************************************************************/
package bridge;
import java.util.*;

/** @pdOid f24892fb-203e-45ef-8bc7-bf256e98fc5b */
public class McDonnellDouglas extends AircraftManufacturer {
   /** @pdOid bc80a8f4-551f-4143-881e-910ceda380d5 */
   public void manufacture() {
	   aircraft.manufacture();
	   System.out.println("由麦道生产");
   }

}