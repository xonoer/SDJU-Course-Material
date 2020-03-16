/***********************************************************************
 * Module:  Apple.java
 * Author:  Administrator
 * Purpose: Defines the Class Apple
 ***********************************************************************/

import java.util.*;

/** @pdOid e4ba9624-9a91-4606-a855-0c1ea6b4a259 */
public class Apple extends Sheep {
   /** @pdOid b9b2c033-d81b-426a-84b7-fd9eddcd1a5d */
   private Sheep shep;
   
   /** @pdRoleInfo migr=no name=Sheep assc=association1 mult=1..1 type=Aggregation */
   public Sheep sheep;
   
   /** @pdOid 6e5ae585-87ce-49dd-a29e-94f4db344843 */
   public void eat() {
      // TODO: implement
   }
   
   /** @param shep
    * @pdOid 6e3dccf1-fa57-46ec-867d-d73611e84377 */
   public Apple(Sheep shep) {
      // TODO: implement
   }

}