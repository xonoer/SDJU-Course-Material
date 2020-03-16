/***********************************************************************
 * Module:  GreenApple.java
 * Author:  Administrator
 * Purpose: Defines the Class GreenApple
 ***********************************************************************/
package decorator;
import java.util.*;

/** @pdOid 441b83e2-113b-44aa-ac1e-c8f482d53b31 */
public class GreenApple extends Apple {
   /** @pdOid 3f163bc6-65dd-4939-8644-3acfef3e85f6 */
   public void eat() {
	  super.eat();
      System.out.println("吃了“绿苹果”获得加快奔跑速度的能力");
   }
   
   /** @param shep
    * @pdOid 2ceb4033-dd2a-4448-8b5f-07a5da03dc68 */
   public GreenApple(Sheep shep) {
      super(shep);
   }

}