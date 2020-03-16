/***********************************************************************
 * Module:  AircraftManufacturer.java
 * Author:  zzc20
 * Purpose: Defines the Class AircraftManufacturer
 ***********************************************************************/
package bridge;
import java.util.*;

/** @pdOid 7685660b-6ff2-4f56-a4ba-a09de1ba4075 */
public abstract class AircraftManufacturer {
   /** @pdOid 8781fff3-3294-41bf-8db1-23315a72deeb */
   protected IAircraft aircraft;
   
   /** @param aircraft
    * @pdOid 0d0ac407-a2e8-40b4-b6f8-c0cfff8ce717 */
   public void setAircraft(IAircraft aircraft) {
	   this.aircraft = aircraft;
   }
   
   /** @pdOid b8db00f0-122c-41b7-acc7-606f41287362 */
   public abstract void manufacture();
}