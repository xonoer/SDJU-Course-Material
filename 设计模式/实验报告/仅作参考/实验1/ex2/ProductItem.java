/***********************************************************************
 * Module:  ProductItem.java
 * Author:  zzc20
 * Purpose: Defines the Class ProductItem
 ***********************************************************************/

import java.util.*;

/** @pdOid 191a31aa-5cc1-4e27-a566-037e945abfe3 */
public class ProductItem implements IDiscount, IDiscount {
   /** @pdOid 3d002aab-4dd9-4970-a9fe-ea7433050c9b */
   private String orderNumber;
   /** @pdOid c295bf35-d712-49e9-885d-9482e0e93c78 */
   private String productId;
   /** @pdOid aabea452-f9ae-4d0c-98c4-8949a7e23b5f */
   private int productNumber;
   /** @pdOid bb3f9051-9a66-485c-9583-582e214f1c75 */
   private double productPrice;
   
   /** @pdRoleInfo migr=no name=Product assc=association4 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Composition */
   public java.util.Collection<Product> product;
   
   /** @pdOid dd2bb621-4ce3-4677-ade8-113e62f0e506 */
   public double calculateDiscount() {
      // TODO: implement
      return 0;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Product> getProduct() {
      if (product == null)
         product = new java.util.HashSet<Product>();
      return product;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorProduct() {
      if (product == null)
         product = new java.util.HashSet<Product>();
      return product.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newProduct */
   public void setProduct(java.util.Collection<Product> newProduct) {
      removeAllProduct();
      for (java.util.Iterator iter = newProduct.iterator(); iter.hasNext();)
         addProduct((Product)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newProduct */
   public void addProduct(Product newProduct) {
      if (newProduct == null)
         return;
      if (this.product == null)
         this.product = new java.util.HashSet<Product>();
      if (!this.product.contains(newProduct))
         this.product.add(newProduct);
   }
   
   /** @pdGenerated default remove
     * @param oldProduct */
   public void removeProduct(Product oldProduct) {
      if (oldProduct == null)
         return;
      if (this.product != null)
         if (this.product.contains(oldProduct))
            this.product.remove(oldProduct);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllProduct() {
      if (product != null)
         product.clear();
   }

}