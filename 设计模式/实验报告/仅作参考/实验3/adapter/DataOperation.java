/***********************************************************************
 * Module:  DataOperation.java
 * Author:  Administrator
 * Purpose: Defines the Interface DataOperation
 ***********************************************************************/
package adapter;
import java.util.*;

/** @pdOid e76f49fe-0573-48c5-a4c8-e37c3d3aa3a3 */
public interface DataOperation {
   /** @param arr
    * @pdOid 6aeadd35-0ec9-4c10-9481-57cb18664cb0 */
   void sort(int[] arr);
   /** @param arr 
    * @param i
    * @pdOid 546087aa-03a5-42fd-a958-9fad82fc4cd1 */
   void search(int[] arr, int i);

}