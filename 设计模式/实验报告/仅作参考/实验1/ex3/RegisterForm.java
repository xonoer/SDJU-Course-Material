/***********************************************************************
 * Module:  RegisterForm.java
 * Author:  zzc20
 * Purpose: Defines the Class RegisterForm
 ***********************************************************************/

import java.util.*;

/** @pdOid b8da2bd7-c43f-4461-90b1-82cbb1e42bd2 */
public class RegisterForm {
   /** @pdOid 8d999622-be4d-4ced-8452-a537f703fe87 */
   private RegisterBO registerbo;
   
   /** @pdRoleInfo migr=no name=RegisterBO assc=association7 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Composition */
   public java.util.Collection<RegisterBO> registerBO;
   
   /** @param userDto
    * @pdOid 68010183-205a-4e6d-852e-ffdff04e03cb */
   public void display(UserDTO userDto) {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<RegisterBO> getRegisterBO() {
      if (registerBO == null)
         registerBO = new java.util.HashSet<RegisterBO>();
      return registerBO;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRegisterBO() {
      if (registerBO == null)
         registerBO = new java.util.HashSet<RegisterBO>();
      return registerBO.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRegisterBO */
   public void setRegisterBO(java.util.Collection<RegisterBO> newRegisterBO) {
      removeAllRegisterBO();
      for (java.util.Iterator iter = newRegisterBO.iterator(); iter.hasNext();)
         addRegisterBO((RegisterBO)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRegisterBO */
   public void addRegisterBO(RegisterBO newRegisterBO) {
      if (newRegisterBO == null)
         return;
      if (this.registerBO == null)
         this.registerBO = new java.util.HashSet<RegisterBO>();
      if (!this.registerBO.contains(newRegisterBO))
         this.registerBO.add(newRegisterBO);
   }
   
   /** @pdGenerated default remove
     * @param oldRegisterBO */
   public void removeRegisterBO(RegisterBO oldRegisterBO) {
      if (oldRegisterBO == null)
         return;
      if (this.registerBO != null)
         if (this.registerBO.contains(oldRegisterBO))
            this.registerBO.remove(oldRegisterBO);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRegisterBO() {
      if (registerBO != null)
         registerBO.clear();
   }

}