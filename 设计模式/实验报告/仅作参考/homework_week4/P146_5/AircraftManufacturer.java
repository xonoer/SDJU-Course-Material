/***********************************************************************
 * Module:  AircraftManufacturer.java
 * Author:  zzc20
 * Purpose: Defines the Class AircraftManufacturer
 ***********************************************************************/

import java.util.*;

/** @pdOid 7685660b-6ff2-4f56-a4ba-a09de1ba4075 */
public abstract class AircraftManufacturer {
   /** @pdOid 8781fff3-3294-41bf-8db1-23315a72deeb */
   protected IAircraft aircraft;
   
   /** @pdRoleInfo migr=no name=IAircraft assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<IAircraft> iAircraft;
   
   /** @param aircraft
    * @pdOid 0d0ac407-a2e8-40b4-b6f8-c0cfff8ce717 */
   public void setAircraft(IAircraft aircraft) {
      // TODO: implement
   }
   
   /** @pdOid b8db00f0-122c-41b7-acc7-606f41287362 */
   public abstract void manufacture();
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<IAircraft> getIAircraft() {
      if (iAircraft == null)
         iAircraft = new java.util.HashSet<IAircraft>();
      return iAircraft;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorIAircraft() {
      if (iAircraft == null)
         iAircraft = new java.util.HashSet<IAircraft>();
      return iAircraft.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newIAircraft */
   public void setIAircraft(java.util.Collection<IAircraft> newIAircraft) {
      removeAllIAircraft();
      for (java.util.Iterator iter = newIAircraft.iterator(); iter.hasNext();)
         addIAircraft((IAircraft)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newIAircraft */
   public void addIAircraft(IAircraft newIAircraft) {
      if (newIAircraft == null)
         return;
      if (this.iAircraft == null)
         this.iAircraft = new java.util.HashSet<IAircraft>();
      if (!this.iAircraft.contains(newIAircraft))
         this.iAircraft.add(newIAircraft);
   }
   
   /** @pdGenerated default remove
     * @param oldIAircraft */
   public void removeIAircraft(IAircraft oldIAircraft) {
      if (oldIAircraft == null)
         return;
      if (this.iAircraft != null)
         if (this.iAircraft.contains(oldIAircraft))
            this.iAircraft.remove(oldIAircraft);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllIAircraft() {
      if (iAircraft != null)
         iAircraft.clear();
   }

}