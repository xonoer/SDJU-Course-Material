/***********************************************************************
 * Module:  Subdepartment.java
 * Author:  zzc20
 * Purpose: Defines the Class Subdepartment
 ***********************************************************************/
package composite;
import java.util.*;

/** @pdOid d6fed3a9-c260-4c65-b903-39323f38b5f1 */
public class Subdepartment extends HeadQuarters {
   /** @pdOid b3796b17-2372-4bb0-b3ac-c161574129f0 */
   private String name;
   /** @pdOid d271bfdf-abe1-40c4-99ac-2bb7655ce5b2 */
   private ArrayList<HeadQuarters> hqList = new ArrayList<>();
   
   /** @pdOid ba58b5cb-60ac-4c3e-8c9a-2afc5311836e */
   public void executeInstructions() {
	   System.out.println(name + "接收到公文" + "并执行及下发公文");
	   for(HeadQuarters hq : hqList) {
		   System.out.print("接收到来自" + name + "的公文-------------");
		   hq.executeInstructions();
	   }
		   
   }
   
   /** @param hq
    * @pdOid 65901552-c3dd-4b07-95fa-786fb32ea5cb */
   public void add(HeadQuarters hq) {
      hqList.add(hq);
   }
   
   /** @param hq
    * @pdOid 02f9e96b-3f51-4a1f-a3a0-0f6936a4fd0b */
   public void remove(HeadQuarters hq) {
      hqList.remove(hq);
   }
   
   /** @param i
    * @pdOid 073ccf7e-315c-415c-898d-8ed59330edfc */
   public HeadQuarters getChild(int i) {
      return hqList.get(i);
   }
   
   /** @param name
    * @pdOid 0fc79bd0-ccf7-4a70-b873-ba7eaa1a8683 */
   public Subdepartment(String name) {
      this.name = name;
   }
   
}