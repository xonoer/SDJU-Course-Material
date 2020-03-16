/***********************************************************************
 * Module:  DatabaseConnectionPool.java
 * Author:  zzc20
 * Purpose: Defines the Class DatabaseConnectionPool
 ***********************************************************************/
package singleton;
import java.util.*;

/** @pdOid 60ed1a57-d0d8-410b-b62b-46c61aa99281 */
public class DatabaseConnectionPool {
   /** @pdOid 8209fb4a-11d1-4150-af2e-5965d27d2303 */
	 private static DatabaseConnectionPool[] database = {new DatabaseConnectionPool(), new DatabaseConnectionPool(), new DatabaseConnectionPool(), new DatabaseConnectionPool()};
	    
   /** @pdOid a832df24-73c0-467c-bbf9-1262693f3c88 */
   public static DatabaseConnectionPool getInstance() {
	   return database[(int)(Math.random() * 4)];
   }
   
}