/***********************************************************************
 * Module:  Member.java
 * Author:  zzc20
 * Purpose: Defines the Class Member
 ***********************************************************************/

import java.util.*;

/** @pdOid 4afe95ee-49f4-4d32-a47f-95d4ccab1b8f */
public abstract class Member implements IDiscount {
   /** @pdOid f2c4aebf-477d-4d7f-8aa7-e05ef28d261c */
   private String id;
   /** @pdOid da7f64ef-1f5c-444c-903f-a41ad0888506 */
   private String name;
   /** @pdOid 33798be9-6591-4b58-aef7-3cb5d28d12b7 */
   private String email;
   /** @pdOid c61d795b-ee33-4278-a205-42a0ed02eddd */
   private String address;
   /** @pdOid af84897b-e019-4a14-93c3-7ed9d8a540aa */
   private String telephone;
   
   /** @pdRoleInfo migr=no name=Order assc=association6 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Order> order;
   
   /** @pdOid 41cdf446-22b4-454e-99c5-97b2c74f72cc */
   public double calculateDiscount() {
      // TODO: implement
      return 0;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Order> getOrder() {
      if (order == null)
         order = new java.util.HashSet<Order>();
      return order;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorOrder() {
      if (order == null)
         order = new java.util.HashSet<Order>();
      return order.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newOrder */
   public void setOrder(java.util.Collection<Order> newOrder) {
      removeAllOrder();
      for (java.util.Iterator iter = newOrder.iterator(); iter.hasNext();)
         addOrder((Order)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newOrder */
   public void addOrder(Order newOrder) {
      if (newOrder == null)
         return;
      if (this.order == null)
         this.order = new java.util.HashSet<Order>();
      if (!this.order.contains(newOrder))
         this.order.add(newOrder);
   }
   
   /** @pdGenerated default remove
     * @param oldOrder */
   public void removeOrder(Order oldOrder) {
      if (oldOrder == null)
         return;
      if (this.order != null)
         if (this.order.contains(oldOrder))
            this.order.remove(oldOrder);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllOrder() {
      if (order != null)
         order.clear();
   }

}