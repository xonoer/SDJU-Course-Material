/***********************************************************************
 * Module:  ComputerBuilder.java
 * Author:  zzc20
 * Purpose: Defines the Class ComputerBuilder
 ***********************************************************************/
package builder;
import java.util.*;

/** @pdOid 028b8696-fdc0-4625-aa3f-32a152650a6b */
public abstract class ComputerBuilder {
   /** @pdOid f1597a9e-5feb-428d-abf0-37535286c21f */
   protected Computer comp = new Computer();
   
   /** @pdRoleInfo migr=no name=Computer assc=association2 mult=1..1 type=Composition */
   public Computer computer;
   
   /** @pdOid 4a77d6f2-a13d-4404-8598-ec4f4301bf5a */
   public abstract void buildCpu();
   /** @pdOid 512e4e4f-c5b0-467b-9a39-2c1bed30d81e */
   public abstract void buildRam();
   /** @pdOid bb85bbb4-82cd-493e-bc84-2d08d92405ad */
   public abstract void buildHardDisk();
   /** @pdOid 10c4d4bb-7883-4432-9e38-e6fb69de911b */
   public abstract void buildHost();
   /** @pdOid 6f9e519f-1321-4f6b-acb5-3343d14fa312 */
   public abstract void buildDisplayer();
   /** @pdOid 3b7a84c9-91f6-4c56-a6b0-8ed8df73b799 */
   public Computer createComputer() {
	   return comp;
   }
    /** @pdOid f66c9c1e-9e48-4f4c-852c-2dbbf7fd0d84 */
	public boolean hasDisplayer() {
	    return true;
	}

}
