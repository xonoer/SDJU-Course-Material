/***********************************************************************
 * Module:  MainForm.java
 * Author:  zzc20
 * Purpose: Defines the Class MainForm
 ***********************************************************************/

import java.util.*;

/** @pdOid c3b7005f-a9de-44e5-8434-18bcf0939665 */
public class MainForm {
   /** @pdOid af6d43a4-30b7-46d9-8a23-1d70162e6778 */
   private LoginForm loginform;
   
   /** @pdRoleInfo migr=no name=LoginForm assc=association10 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Composition */
   public java.util.Collection<LoginForm> loginForm;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<LoginForm> getLoginForm() {
      if (loginForm == null)
         loginForm = new java.util.HashSet<LoginForm>();
      return loginForm;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorLoginForm() {
      if (loginForm == null)
         loginForm = new java.util.HashSet<LoginForm>();
      return loginForm.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newLoginForm */
   public void setLoginForm(java.util.Collection<LoginForm> newLoginForm) {
      removeAllLoginForm();
      for (java.util.Iterator iter = newLoginForm.iterator(); iter.hasNext();)
         addLoginForm((LoginForm)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newLoginForm */
   public void addLoginForm(LoginForm newLoginForm) {
      if (newLoginForm == null)
         return;
      if (this.loginForm == null)
         this.loginForm = new java.util.HashSet<LoginForm>();
      if (!this.loginForm.contains(newLoginForm))
         this.loginForm.add(newLoginForm);
   }
   
   /** @pdGenerated default remove
     * @param oldLoginForm */
   public void removeLoginForm(LoginForm oldLoginForm) {
      if (oldLoginForm == null)
         return;
      if (this.loginForm != null)
         if (this.loginForm.contains(oldLoginForm))
            this.loginForm.remove(oldLoginForm);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllLoginForm() {
      if (loginForm != null)
         loginForm.clear();
   }

}