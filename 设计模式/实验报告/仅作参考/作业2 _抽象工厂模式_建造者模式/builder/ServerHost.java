/***********************************************************************
 * Module:  ServerHost.java
 * Author:  zzc20
 * Purpose: Defines the Class ServerHost
 ***********************************************************************/
package builder;
import java.util.*;

/** @pdOid ea23ea74-701a-4b17-8cb9-8326ea24856f */
public class ServerHost extends ComputerBuilder {
   /** @pdOid a3138f6e-6681-40c1-b428-f0b2a5cad7f7 */
   public void buildCpu() {
	   comp.setCpu("AMD EPYC 7601");
   }
   
   /** @pdOid c35118ca-1828-4400-b5b2-6a01282ecaa6 */
   public void buildRam() {
	   comp.setRam("DELL DDR4 PC4 2400T");
   }
   
   /** @pdOid 1f3dccff-722d-4f21-a176-519a732e924e */
   public void buildHardDisk() {
	   comp.setHardDisk("HUAWEI 1TB SATA 7200rpm");
   }
   
   /** @pdOid 549c77ee-57c3-4343-8634-da810f2cf3da */
   public void buildHost() {
	   comp.setHost("HUAWEI FusionServer 2288H V5");
   }
   
   /** @pdOid f246060f-28ce-4a7a-9a67-f793b1ae5c5a */
   public void buildDisplayer() {
   }
   /** @pdOid 3bb4c72b-b1d7-489d-a960-736434ab9cb5 */
   public boolean hasDisplayer() {
      return false;
   }

}