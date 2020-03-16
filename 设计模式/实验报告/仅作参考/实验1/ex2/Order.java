/***********************************************************************
 * Module:  Order.java
 * Author:  zzc20
 * Purpose: Defines the Class Order
 ***********************************************************************/

import java.util.*;

/** @pdOid 89b898a9-a1a0-47d9-9cb7-a7d2d2bc6a16 */
public class Order {
   /** @pdRoleInfo migr=no name=ProductItem assc=association5 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Composition */
   public java.util.Collection<ProductItem> productItem;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<ProductItem> getProductItem() {
      if (productItem == null)
         productItem = new java.util.HashSet<ProductItem>();
      return productItem;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorProductItem() {
      if (productItem == null)
         productItem = new java.util.HashSet<ProductItem>();
      return productItem.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newProductItem */
   public void setProductItem(java.util.Collection<ProductItem> newProductItem) {
      removeAllProductItem();
      for (java.util.Iterator iter = newProductItem.iterator(); iter.hasNext();)
         addProductItem((ProductItem)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newProductItem */
   public void addProductItem(ProductItem newProductItem) {
      if (newProductItem == null)
         return;
      if (this.productItem == null)
         this.productItem = new java.util.HashSet<ProductItem>();
      if (!this.productItem.contains(newProductItem))
         this.productItem.add(newProductItem);
   }
   
   /** @pdGenerated default remove
     * @param oldProductItem */
   public void removeProductItem(ProductItem oldProductItem) {
      if (oldProductItem == null)
         return;
      if (this.productItem != null)
         if (this.productItem.contains(oldProductItem))
            this.productItem.remove(oldProductItem);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllProductItem() {
      if (productItem != null)
         productItem.clear();
   }

}