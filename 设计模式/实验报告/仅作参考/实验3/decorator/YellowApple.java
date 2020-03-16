/***********************************************************************
 * Module:  YellowApple.java
 * Author:  Administrator
 * Purpose: Defines the Class YellowApple
 ***********************************************************************/
package decorator;
import java.util.*;

/** @pdOid c47f8b5f-fdca-413c-832f-6e36d49919ce */
public class YellowApple extends Apple {
   /** @pdOid eae08c91-1a32-4298-9dcd-8e1c01a3b4cb */
   public void eat() {
	   super.eat();
	   System.out.println("吃了“黄苹果”获得趟着水跑的能力");
   }
   
   /** @param shep
    * @pdOid 19c9a071-8cef-4b82-9d06-2ef6122435c3 */
   public YellowApple(Sheep shep) {
      super(shep);
   }

}