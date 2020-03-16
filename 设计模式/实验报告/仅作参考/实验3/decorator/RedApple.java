/***********************************************************************
 * Module:  RedApple.java
 * Author:  Administrator
 * Purpose: Defines the Class RedApple
 ***********************************************************************/
package decorator;
import java.util.*;

/** @pdOid 6f9d80d3-5a36-49c9-a70c-febdb3077f50 */
public class RedApple extends Apple {
   /** @pdOid 928a1459-8062-4d72-b2e4-f568bae1541d */
   public void eat() {
	   super.eat();
	   System.out.println("吃了“红苹果”获得加上保护罩的能力");
   }
   
   /** @param shep
    * @pdOid 48c83584-609b-4cbc-b769-b4f31e8dfd17 */
   public RedApple(Sheep shep) {
      super(shep);
   }

}