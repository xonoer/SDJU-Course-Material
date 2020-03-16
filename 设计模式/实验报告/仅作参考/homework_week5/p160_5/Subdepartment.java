/***********************************************************************
 * Module:  Subdepartment.java
 * Author:  zzc20
 * Purpose: Defines the Class Subdepartment
 ***********************************************************************/

import java.util.*;

/** @pdOid d6fed3a9-c260-4c65-b903-39323f38b5f1 */
public class Subdepartment extends HeadQuarters {
   /** @pdOid b3796b17-2372-4bb0-b3ac-c161574129f0 */
   private String name;
   /** @pdOid d271bfdf-abe1-40c4-99ac-2bb7655ce5b2 */
   private ArrayList hqList;
   
   /** @pdRoleInfo migr=no name=HeadQuarters assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<HeadQuarters> headQuarters;
   
   /** @pdOid ba58b5cb-60ac-4c3e-8c9a-2afc5311836e */
   public void executeInstructions() {
      // TODO: implement
   }
   
   /** @param hq
    * @pdOid 65901552-c3dd-4b07-95fa-786fb32ea5cb */
   public void add(HeadQuarters hq) {
      // TODO: implement
   }
   
   /** @param hq
    * @pdOid 02f9e96b-3f51-4a1f-a3a0-0f6936a4fd0b */
   public void remove(HeadQuarters hq) {
      // TODO: implement
   }
   
   /** @param i
    * @pdOid 073ccf7e-315c-415c-898d-8ed59330edfc */
   public HeadQuarters getChild(int i) {
      // TODO: implement
      return null;
   }
   
   /** @param name
    * @pdOid 0fc79bd0-ccf7-4a70-b873-ba7eaa1a8683 */
   public Subdepartment(String name) {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<HeadQuarters> getHeadQuarters() {
      if (headQuarters == null)
         headQuarters = new java.util.HashSet<HeadQuarters>();
      return headQuarters;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorHeadQuarters() {
      if (headQuarters == null)
         headQuarters = new java.util.HashSet<HeadQuarters>();
      return headQuarters.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newHeadQuarters */
   public void setHeadQuarters(java.util.Collection<HeadQuarters> newHeadQuarters) {
      removeAllHeadQuarters();
      for (java.util.Iterator iter = newHeadQuarters.iterator(); iter.hasNext();)
         addHeadQuarters((HeadQuarters)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newHeadQuarters */
   public void addHeadQuarters(HeadQuarters newHeadQuarters) {
      if (newHeadQuarters == null)
         return;
      if (this.headQuarters == null)
         this.headQuarters = new java.util.HashSet<HeadQuarters>();
      if (!this.headQuarters.contains(newHeadQuarters))
         this.headQuarters.add(newHeadQuarters);
   }
   
   /** @pdGenerated default remove
     * @param oldHeadQuarters */
   public void removeHeadQuarters(HeadQuarters oldHeadQuarters) {
      if (oldHeadQuarters == null)
         return;
      if (this.headQuarters != null)
         if (this.headQuarters.contains(oldHeadQuarters))
            this.headQuarters.remove(oldHeadQuarters);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllHeadQuarters() {
      if (headQuarters != null)
         headQuarters.clear();
   }

}