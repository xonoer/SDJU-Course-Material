/***********************************************************************
 * Module:  Adapter.java
 * Author:  zzc20
 * Purpose: Defines the Class Adapter
 ***********************************************************************/
package adapter;
import java.util.*;

/** @pdOid 3e7c2ac4-3c11-41e6-9491-bc501c9fda0e */
public class Adapter implements Icat, Idog {
   /** @pdOid c81d2723-d97e-460a-ad32-6de85e747cbd */
   private Icat cat;
   /** @pdOid c80f76b1-09d1-409f-9df8-3cc973d914ec */
   private Idog dog;
   
   /** @param dog
    * @pdOid 36d95898-8ee1-41bf-b06a-d4d87fc8f10e */
   public Adapter(Idog dog) {
	   this.dog = dog;
   }
   
   /** @param cat
    * @pdOid 9a11bef2-2ade-411a-b95b-b6947fdaaa12 */
   public Adapter(Icat cat) {
	   this.cat = cat;
   }
   
   /** @pdRoleInfo migr=no name=Icat assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Icat> icat;
   /** @pdRoleInfo migr=no name=Idog assc=association2 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Idog> idog;
   
   /** @pdOid 83cecae6-16ef-4667-b480-bcb091436b9a */
   public void catCry() {
	   System.out.println("ÕÙ");
   }
   
   /** @pdOid 75ad021a-49f5-4961-8444-6802b5d92915 */
   public void catchMouse() {
	   cat.catchMouse();
   }
   
   /** @pdOid c3a59dfe-d623-48b1-880e-17a6b636fe7e */
   public void dogCry() {
	   dog.dogCry();
   }
   
   /** @pdOid 7a6e98ac-9266-432b-9e85-5ca742dc3b2d */
   public void catchSth() {
	   System.out.println("◊•¿œ Û");
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Icat> getIcat() {
      if (icat == null)
         icat = new java.util.HashSet<Icat>();
      return icat;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorIcat() {
      if (icat == null)
         icat = new java.util.HashSet<Icat>();
      return icat.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newIcat */
   public void setIcat(java.util.Collection<Icat> newIcat) {
      removeAllIcat();
      for (java.util.Iterator iter = newIcat.iterator(); iter.hasNext();)
         addIcat((Icat)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newIcat */
   public void addIcat(Icat newIcat) {
      if (newIcat == null)
         return;
      if (this.icat == null)
         this.icat = new java.util.HashSet<Icat>();
      if (!this.icat.contains(newIcat))
         this.icat.add(newIcat);
   }
   
   /** @pdGenerated default remove
     * @param oldIcat */
   public void removeIcat(Icat oldIcat) {
      if (oldIcat == null)
         return;
      if (this.icat != null)
         if (this.icat.contains(oldIcat))
            this.icat.remove(oldIcat);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllIcat() {
      if (icat != null)
         icat.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Idog> getIdog() {
      if (idog == null)
         idog = new java.util.HashSet<Idog>();
      return idog;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorIdog() {
      if (idog == null)
         idog = new java.util.HashSet<Idog>();
      return idog.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newIdog */
   public void setIdog(java.util.Collection<Idog> newIdog) {
      removeAllIdog();
      for (java.util.Iterator iter = newIdog.iterator(); iter.hasNext();)
         addIdog((Idog)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newIdog */
   public void addIdog(Idog newIdog) {
      if (newIdog == null)
         return;
      if (this.idog == null)
         this.idog = new java.util.HashSet<Idog>();
      if (!this.idog.contains(newIdog))
         this.idog.add(newIdog);
   }
   
   /** @pdGenerated default remove
     * @param oldIdog */
   public void removeIdog(Idog oldIdog) {
      if (oldIdog == null)
         return;
      if (this.idog != null)
         if (this.idog.contains(oldIdog))
            this.idog.remove(oldIdog);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllIdog() {
      if (idog != null)
         idog.clear();
   }

}