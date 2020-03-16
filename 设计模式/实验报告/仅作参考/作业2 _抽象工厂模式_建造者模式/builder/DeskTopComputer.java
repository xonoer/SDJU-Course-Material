/***********************************************************************
 * Module:  DeskTopComputer.java
 * Author:  zzc20
 * Purpose: Defines the Class DeskTopComputer
 ***********************************************************************/
package builder;
import java.util.*;

/** @pdOid c8c738e8-46c5-48d0-ade0-f8c3a9ebc8f9 */
public class DeskTopComputer extends ComputerBuilder {
   /** @pdOid 0c90071f-ce8d-4356-84b8-1cad2e18447c */
   public void buildCpu() {
	   comp.setCpu("Intel Core i9 7980XE");
   }
   
   /** @pdOid d0dae120-e2fe-41e0-8176-70663d00bff5 */
   public void buildRam() {
	   comp.setRam("CORSAIR CMD64G 16GX4 2800");
   }
   
   /** @pdOid f075867c-a41c-4fed-8cc3-954a1c0231cb */
   public void buildHardDisk() {
	   comp.setHardDisk("Samsung 860QVO 1TB SSD SATA3");
   }
   
   /** @pdOid f0bcac7d-9939-41cb-8f9d-dcf094114b53 */
   public void buildHost() {
	   comp.setHost("Alienware aurora r7");
   }
   
   /** @pdOid d24d2c2d-2ad7-47da-926f-72b899457b45 */
   public void buildDisplayer() {
	   comp.setDisplayer("Alienware AW3418HW");
   }
   /** @pdOid bc664417-2d47-4a53-9aea-9a78badbf844 */
   public boolean hasDisplayer() {
      return true;
   }

}
