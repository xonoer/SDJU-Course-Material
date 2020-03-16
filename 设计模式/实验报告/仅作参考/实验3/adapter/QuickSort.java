/***********************************************************************
 * Module:  QuickSort.java
 * Author:  Administrator
 * Purpose: Defines the Class QuickSort
 ***********************************************************************/
package adapter;
import java.util.*;

/** @pdOid ce4a1fd1-2ab8-4085-95bc-919fc3da5c00 */
public class QuickSort {
   /** @param arr
    * @pdOid 413f25f3-f8ce-46bc-a77a-7d49164617fb */
   public void sort(int[] arr, int low, int high) {
	   int i = low;
	   int j = high - 1;
	   int x = arr[i];
	   while(i < j){
		   while(arr[j] > x)
			   j--;
		   arr[i++] = arr[j];
		   while(arr[i] < x)
			   i++;
		   arr[j--] = arr[i];
	   }
	   arr[i] = x;
	   sort(arr, low, i - 1);
	   sort(arr, i + 1, high);
   }
}