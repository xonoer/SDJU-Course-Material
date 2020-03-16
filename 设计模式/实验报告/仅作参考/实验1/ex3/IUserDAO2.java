/***********************************************************************
 * Module:  IUserDAO2.java
 * Author:  zzc20
 * Purpose: Defines the Interface IUserDAO2
 ***********************************************************************/

import java.util.*;

/** @pdOid f29c2f84-d5a8-4b28-bb78-6c4affed5690 */
public interface IUserDAO2 {
   /** @param userDto
    * @pdOid bc161ce5-d99a-478b-bfdb-29dc2e2ec1c1 */
   boolean findUser(UserDTO userDto);

}