/***********************************************************************
 * Module:  Office.java
 * Author:  zzc20
 * Purpose: Defines the Class Office
 ***********************************************************************/
package composite;
import java.util.*;

/** @pdOid 752cb7c2-53f1-47be-89d4-1b08f649ee62 */
public class Office extends HeadQuarters {
   /** @pdOid 11fd4cb3-60b5-432e-9f35-e2244ca519bd */
   private String name;
   
   /** @pdOid 15b86eab-d0d3-4beb-9826-8124f33621be */
   public void executeInstructions() {
      System.out.println(name + "执行公文");
   }
   
   /** @param hq
    * @pdOid 95aea32c-d575-424b-a23a-d2ccccd1b4fc */
   public void add(HeadQuarters hq) {
      System.out.println("对不起，不支持该方法！");
   }
   
   /** @param hq
    * @pdOid 6aaf8acf-2577-427e-ab0c-9d764c6a4881 */
   public void remove(HeadQuarters hq) {
	   System.out.println("对不起，不支持该方法！");
   }
   
   /** @param i
    * @pdOid f5441003-26c9-452c-8254-361c811d21d8 */
   public HeadQuarters getChild(int i) {
	   System.out.println("对不起，不支持该方法！");
      return null;
   }
   
   /** @param name
    * @pdOid c49c0866-f53c-44e7-b306-6b4ef2130549 */
   public Office(String name) {
      this.name = name;
   }

}