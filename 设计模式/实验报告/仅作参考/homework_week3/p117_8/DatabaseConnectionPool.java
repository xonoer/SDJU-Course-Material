/***********************************************************************
 * Module:  DatabaseConnectionPool.java
 * Author:  zzc20
 * Purpose: Defines the Class DatabaseConnectionPool
 ***********************************************************************/

import java.util.*;

/** @pdOid 60ed1a57-d0d8-410b-b62b-46c61aa99281 */
public class DatabaseConnectionPool {
   /** @pdOid 8209fb4a-11d1-4150-af2e-5965d27d2303 */
   private DatabaseConnectionPool database;
   
   /** @pdRoleInfo migr=no name=DatabaseConnectionPool assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<DatabaseConnectionPool> databaseConnectionPoolB;
   
   /** @pdOid a832df24-73c0-467c-bbf9-1262693f3c88 */
   public static DatabaseConnectionPool getInstance() {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<DatabaseConnectionPool> getDatabaseConnectionPoolB() {
      if (databaseConnectionPoolB == null)
         databaseConnectionPoolB = new java.util.HashSet<DatabaseConnectionPool>();
      return databaseConnectionPoolB;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorDatabaseConnectionPoolB() {
      if (databaseConnectionPoolB == null)
         databaseConnectionPoolB = new java.util.HashSet<DatabaseConnectionPool>();
      return databaseConnectionPoolB.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newDatabaseConnectionPoolB */
   public void setDatabaseConnectionPoolB(java.util.Collection<DatabaseConnectionPool> newDatabaseConnectionPoolB) {
      removeAllDatabaseConnectionPoolB();
      for (java.util.Iterator iter = newDatabaseConnectionPoolB.iterator(); iter.hasNext();)
         addDatabaseConnectionPoolB((DatabaseConnectionPool)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newDatabaseConnectionPool */
   public void addDatabaseConnectionPoolB(DatabaseConnectionPool newDatabaseConnectionPool) {
      if (newDatabaseConnectionPool == null)
         return;
      if (this.databaseConnectionPoolB == null)
         this.databaseConnectionPoolB = new java.util.HashSet<DatabaseConnectionPool>();
      if (!this.databaseConnectionPoolB.contains(newDatabaseConnectionPool))
         this.databaseConnectionPoolB.add(newDatabaseConnectionPool);
   }
   
   /** @pdGenerated default remove
     * @param oldDatabaseConnectionPool */
   public void removeDatabaseConnectionPoolB(DatabaseConnectionPool oldDatabaseConnectionPool) {
      if (oldDatabaseConnectionPool == null)
         return;
      if (this.databaseConnectionPoolB != null)
         if (this.databaseConnectionPoolB.contains(oldDatabaseConnectionPool))
            this.databaseConnectionPoolB.remove(oldDatabaseConnectionPool);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllDatabaseConnectionPoolB() {
      if (databaseConnectionPoolB != null)
         databaseConnectionPoolB.clear();
   }

}