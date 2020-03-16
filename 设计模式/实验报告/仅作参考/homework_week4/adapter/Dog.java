/***********************************************************************
 * Module:  Dog.java
 * Author:  zzc20
 * Purpose: Defines the Class Dog
 ***********************************************************************/
package adapter;
import java.util.*;

/** @pdOid dd08ac4e-61f2-4674-a413-8ce91fa5d620 */
public class Dog implements Idog {
   /** @pdOid 4549e74a-186c-4d31-a2c9-45500449b2f1 */
   public void dogCry() {
	   System.out.println("Íô");
   }
   
   /** @pdOid d6cb60ee-710d-4880-95c2-9b10083bf221 */
   public void catchSth() {
	   System.out.println("×¥¶«Î÷");
   }

}