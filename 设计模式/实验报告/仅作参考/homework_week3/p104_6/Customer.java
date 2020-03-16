/***********************************************************************
 * Module:  Customer.java
 * Author:  zzc20
 * Purpose: Defines the Class Customer
 ***********************************************************************/

import java.util.*;

/** @pdOid 06c404c9-a3d2-4ccd-ac64-6eba1645664e */
public class Customer extends Object implements Cloneable {
   /** @pdOid 64113bb7-9ce4-4426-bb35-362d772f2462 */
   private Address addrs;
   
   /** @pdRoleInfo migr=no name=Address assc=association1 mult=1..1 type=Aggregation */
   public Address address;
   
   /** @pdOid 251b31d7-5773-4a5a-ab8d-8c54e206d9a9 */
   public Object clone() {
      // TODO: implement
      return null;
   }
   
   /** @param address
    * @pdOid b3e0190a-f555-44c1-9b30-f8529ba321d5 */
   public void setAddress(Address address) {
      // TODO: implement
   }
   
   /** @pdOid 1227f185-c237-43d1-9a58-6a8ad67f826b */
   public Address getAddress() {
      // TODO: implement
      return null;
   }

}