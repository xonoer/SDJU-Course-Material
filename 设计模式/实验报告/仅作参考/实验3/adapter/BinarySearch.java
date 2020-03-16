/***********************************************************************
 * Module:  BinarySearch.java
 * Author:  Administrator
 * Purpose: Defines the Class BinarySearch
 ***********************************************************************/
package adapter;
import java.util.*;

/** @pdOid f9f93abe-f253-4e97-a9c2-5034d2771d90 */
public class BinarySearch {
   /** @param arr 
    * @param i
    * @pdOid 93ff9eff-c545-4f92-aedc-af9a5ac420c0 */
   public int search(int[] arr, int i) {
	   int low = 0;
	   int high = arr.length - 1;
	   while(low <= high){
		   int middle = (high - low) / 2;
		   if(arr[middle] == i)
			   return middle;
		   else if(arr[middle] > i)
			   high = middle - 1;
		   else
			   low = middle + 1;
	   }
	   return -1;
   }

}