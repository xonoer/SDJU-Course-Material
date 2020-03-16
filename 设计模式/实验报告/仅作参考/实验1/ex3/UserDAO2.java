/***********************************************************************
 * Module:  UserDAO2.java
 * Author:  zzc20
 * Purpose: Defines the Class UserDAO2
 ***********************************************************************/

import java.util.*;

/** @pdOid 227a4203-a9fe-44bc-9dab-2a68340c46ad */
public class UserDAO2 implements IUserDAO2, IUserDAO2 {
   /** @param userDto
    * @pdOid 6352795d-d9c1-4498-9bb1-ff8b87f2a6f0 */
   public boolean findUser(UserDTO userDto) {
      boolean b;
      userDateBase = new UserDataBase();
      b = userDataBase.search(userDto)
      // TODO: implement
      return b;
   }

}