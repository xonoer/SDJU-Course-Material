/***********************************************************************
 * Module:  UserDAO.java
 * Author:  zzc20
 * Purpose: Defines the Class UserDAO
 ***********************************************************************/

import java.util.*;

/** @pdOid dacdb110-ec4f-409c-ae6e-bd4a3ea34283 */
public class UserDAO implements IUserDAO {
   /** @param userDto
    * @pdOid dacd7902-4263-44c2-ba39-21f284ed1aac */
   public boolean findUser(UserDTO userDto) {
      boolean b;
      userDateBase = new UserDataBase();
      b = userDataBase.search(userDto)
      // TODO: implement
      return b;
   }

}