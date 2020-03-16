/***********************************************************************
 * Module:  Director.java
 * Author:  zzc20
 * Purpose: Defines the Class Director
 ***********************************************************************/
package builder;
import java.util.*;

/** @pdOid fff1a89d-9103-4df2-824e-88f6a9679373 */
public class Director {
   /** @param computerB
    * @pdOid 27338121-f7cc-4457-832b-f4b711bcf805 */
   public Computer construct(ComputerBuilder computerB) {
	   Computer computer = null;
	   computerB.buildCpu();
	   computerB.buildRam();
	   computerB.buildHardDisk();
	   computerB.buildHost();
	   if(computerB.hasDisplayer())
		   computerB.buildDisplayer();
	   computer = computerB.createComputer();
	   return computer;

   }

}