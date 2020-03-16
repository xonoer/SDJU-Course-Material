/***********************************************************************
 * Module:  IUserDAO.java
 * Author:  zzc20
 * Purpose: Defines the Interface IUserDAO
 ***********************************************************************/

import java.util.*;

/** @pdOid 919ad235-57d7-40be-a20c-461a592b73b1 */
public interface IUserDAO {
   /** @param userDto
    * @pdOid 375e782a-957f-4b35-8aaa-79ebf0173158 */
   boolean findUser(UserDTO userDto);

}