/***********************************************************************
 * Module:  Address1.java
 * Author:  zzc20
 * Purpose: Defines the Class Address1
 ***********************************************************************/

import java.util.*;

/** @pdOid bd67bcd0-278d-44c0-9b84-70cf4dc9213a */
public class Address1 implements Serialization {
   /** @pdOid 99e898d0-f177-468f-b478-b7af324d79ed */
   private String address1;
   
   /** @pdRoleInfo migr=no name=Customer1 assc=association2 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Customer1> customer1;
   
   /** @pdOid b8ea8ac9-a3d6-4d35-b32a-99271aa8d62b */
   public void setAddress1() {
      // TODO: implement
   }
   
   /** @pdOid 6e3f7d9f-2fa0-41be-b26e-389ab8f2e7c4 */
   public String getAddress1() {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Customer1> getCustomer1() {
      if (customer1 == null)
         customer1 = new java.util.HashSet<Customer1>();
      return customer1;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCustomer1() {
      if (customer1 == null)
         customer1 = new java.util.HashSet<Customer1>();
      return customer1.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCustomer1 */
   public void setCustomer1(java.util.Collection<Customer1> newCustomer1) {
      removeAllCustomer1();
      for (java.util.Iterator iter = newCustomer1.iterator(); iter.hasNext();)
         addCustomer1((Customer1)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCustomer1 */
   public void addCustomer1(Customer1 newCustomer1) {
      if (newCustomer1 == null)
         return;
      if (this.customer1 == null)
         this.customer1 = new java.util.HashSet<Customer1>();
      if (!this.customer1.contains(newCustomer1))
         this.customer1.add(newCustomer1);
   }
   
   /** @pdGenerated default remove
     * @param oldCustomer1 */
   public void removeCustomer1(Customer1 oldCustomer1) {
      if (oldCustomer1 == null)
         return;
      if (this.customer1 != null)
         if (this.customer1.contains(oldCustomer1))
            this.customer1.remove(oldCustomer1);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCustomer1() {
      if (customer1 != null)
         customer1.clear();
   }

}