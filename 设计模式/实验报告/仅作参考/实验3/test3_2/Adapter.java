/***********************************************************************
 * Module:  Adapter.java
 * Author:  Administrator
 * Purpose: Defines the Class Adapter
 ***********************************************************************/

import java.util.*;

/** @pdOid 691319b0-8826-41a3-ac62-5bca5efc3024 */
public class Adapter implements DataOperation {
   /** @pdOid d9de215a-721a-4641-bb3f-0d2004ce2856 */
   private QuickSort qsort;
   /** @pdOid c2cb40c1-fbc0-4c75-8891-5c73b584218b */
   private BinarySearch bsearch;
   
   /** @pdRoleInfo migr=no name=QuickSort assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<QuickSort> quickSort;
   /** @pdRoleInfo migr=no name=BinarySearch assc=association2 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<BinarySearch> binarySearch;
   
   /** @param arr
    * @pdOid 61c04d5c-2b57-4c6b-af68-10145ff988b3 */
   public void sort(int[] arr) {
      // TODO: implement
   }
   
   /** @param arr 
    * @param i
    * @pdOid bc6fc08e-51c8-4a63-a649-d19b390063b3 */
   public void search(int[] arr, int i) {
      // TODO: implement
   }
   
   /** @pdOid c69ed976-244c-497e-a35d-b7bf6fe17407 */
   public Adapter() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<QuickSort> getQuickSort() {
      if (quickSort == null)
         quickSort = new java.util.HashSet<QuickSort>();
      return quickSort;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorQuickSort() {
      if (quickSort == null)
         quickSort = new java.util.HashSet<QuickSort>();
      return quickSort.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newQuickSort */
   public void setQuickSort(java.util.Collection<QuickSort> newQuickSort) {
      removeAllQuickSort();
      for (java.util.Iterator iter = newQuickSort.iterator(); iter.hasNext();)
         addQuickSort((QuickSort)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newQuickSort */
   public void addQuickSort(QuickSort newQuickSort) {
      if (newQuickSort == null)
         return;
      if (this.quickSort == null)
         this.quickSort = new java.util.HashSet<QuickSort>();
      if (!this.quickSort.contains(newQuickSort))
         this.quickSort.add(newQuickSort);
   }
   
   /** @pdGenerated default remove
     * @param oldQuickSort */
   public void removeQuickSort(QuickSort oldQuickSort) {
      if (oldQuickSort == null)
         return;
      if (this.quickSort != null)
         if (this.quickSort.contains(oldQuickSort))
            this.quickSort.remove(oldQuickSort);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllQuickSort() {
      if (quickSort != null)
         quickSort.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<BinarySearch> getBinarySearch() {
      if (binarySearch == null)
         binarySearch = new java.util.HashSet<BinarySearch>();
      return binarySearch;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorBinarySearch() {
      if (binarySearch == null)
         binarySearch = new java.util.HashSet<BinarySearch>();
      return binarySearch.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBinarySearch */
   public void setBinarySearch(java.util.Collection<BinarySearch> newBinarySearch) {
      removeAllBinarySearch();
      for (java.util.Iterator iter = newBinarySearch.iterator(); iter.hasNext();)
         addBinarySearch((BinarySearch)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBinarySearch */
   public void addBinarySearch(BinarySearch newBinarySearch) {
      if (newBinarySearch == null)
         return;
      if (this.binarySearch == null)
         this.binarySearch = new java.util.HashSet<BinarySearch>();
      if (!this.binarySearch.contains(newBinarySearch))
         this.binarySearch.add(newBinarySearch);
   }
   
   /** @pdGenerated default remove
     * @param oldBinarySearch */
   public void removeBinarySearch(BinarySearch oldBinarySearch) {
      if (oldBinarySearch == null)
         return;
      if (this.binarySearch != null)
         if (this.binarySearch.contains(oldBinarySearch))
            this.binarySearch.remove(oldBinarySearch);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBinarySearch() {
      if (binarySearch != null)
         binarySearch.clear();
   }

}