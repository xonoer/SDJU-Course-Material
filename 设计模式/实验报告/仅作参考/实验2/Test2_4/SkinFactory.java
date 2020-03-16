/***********************************************************************
 * Module:  SkinFactory.java
 * Author:  zzc20
 * Purpose: Defines the Interface SkinFactory
 ***********************************************************************/

import java.util.*;

/** @pdOid 2b658af0-26dd-4eda-98f0-e3c1e722eeb4 */
public interface SkinFactory {
   /** @pdOid 8775e280-f18c-4210-ba6b-a91a1e2b7258 */
   Button createButton();
   /** @pdOid fcd4d2a9-a738-4a85-94a4-ede60454817c */
   TextField createTextField();
   /** @pdOid 78631fd1-f05f-40ac-8a9b-9ac360cacaa8 */
   ComboBox createComboBox();

}