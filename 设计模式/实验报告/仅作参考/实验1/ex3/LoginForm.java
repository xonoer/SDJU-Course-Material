/***********************************************************************
 * Module:  LoginForm.java
 * Author:  zzc20
 * Purpose: Defines the Class LoginForm
 ***********************************************************************/

import java.util.*;

/** @pdOid ec10b94f-b515-4b40-86ca-e44e9dfb06ed */
public class LoginForm {
   /** @pdOid 1005b2fe-4e35-479e-bf69-ea8250ee09bb */
   private LoginBO loginbo;
   
   /** @pdRoleInfo migr=no name=LoginBO assc=association9 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Composition */
   public java.util.Collection<LoginBO> loginBO;
   
   /** @pdOid 7e8e2948-5cf6-455c-81fb-1e35ccfbbfae */
   public void display() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<LoginBO> getLoginBO() {
      if (loginBO == null)
         loginBO = new java.util.HashSet<LoginBO>();
      return loginBO;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorLoginBO() {
      if (loginBO == null)
         loginBO = new java.util.HashSet<LoginBO>();
      return loginBO.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newLoginBO */
   public void setLoginBO(java.util.Collection<LoginBO> newLoginBO) {
      removeAllLoginBO();
      for (java.util.Iterator iter = newLoginBO.iterator(); iter.hasNext();)
         addLoginBO((LoginBO)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newLoginBO */
   public void addLoginBO(LoginBO newLoginBO) {
      if (newLoginBO == null)
         return;
      if (this.loginBO == null)
         this.loginBO = new java.util.HashSet<LoginBO>();
      if (!this.loginBO.contains(newLoginBO))
         this.loginBO.add(newLoginBO);
   }
   
   /** @pdGenerated default remove
     * @param oldLoginBO */
   public void removeLoginBO(LoginBO oldLoginBO) {
      if (oldLoginBO == null)
         return;
      if (this.loginBO != null)
         if (this.loginBO.contains(oldLoginBO))
            this.loginBO.remove(oldLoginBO);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllLoginBO() {
      if (loginBO != null)
         loginBO.clear();
   }

}