/***********************************************************************
 * Module:  NoteBookComputer.java
 * Author:  zzc20
 * Purpose: Defines the Class NoteBookComputer
 ***********************************************************************/
package builder;
import java.util.*;

/** @pdOid f825133e-bf6a-48d9-87cd-7df314d425e2 */
public class NoteBookComputer extends ComputerBuilder {
   /** @pdOid 32bbaf58-ef00-4ea5-8889-f00a9de8d992 */
   public void buildCpu() {
	   comp.setCpu("Intel Core i7-8750H");
   }
   
   /** @pdOid 60811081-4d4a-417c-95c4-aedbf137f982 */
   public void buildRam() {
	   comp.setRam("Samsung NB 2133 8G");
   }
   
   /** @pdOid d1098fef-e63d-4e1d-8ac0-08aaecb744ba */
   public void buildHardDisk() {
	   comp.setHardDisk("Samsung 860QVO 1TB SSD SATA3");
   }
   
   /** @pdOid 6c75cfdf-d769-447d-837e-a43c41103f8e */
   public void buildHost() {
	   comp.setHost("MSI GL63 8SE-044CN");
   }
   
   /** @pdOid e75547ba-c0c6-47dd-bc10-8d7963ddd574 */
   public void buildDisplayer() {
	   comp.setDisplayer("Spectrum digital LCD screen");
   }
   /** @pdOid dd9a6c4b-ce28-4ae8-9b4f-d58072a5922c */
   public boolean hasDisplayer() {
      return true;
   }

}