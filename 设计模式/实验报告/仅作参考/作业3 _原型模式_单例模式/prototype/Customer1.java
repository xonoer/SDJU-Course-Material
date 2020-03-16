/***********************************************************************
 * Module:  Customer1.java
 * Author:  zzc20
 * Purpose: Defines the Class Customer1
 ***********************************************************************/
package prototype;
import java.io.*;
import java.util.*;

/** @pdOid 87ed9910-8961-4d25-89a4-f5235a843f38 */
public class Customer1 implements Serializable {
   /** @pdOid 08962dd9-69ce-4448-88c2-5a0d436e26c2 */
   private Address1 addrs1 = null;
   
   /** @pdOid c8497f35-5485-46e8-8010-39f802dc0f6c */
   public Customer1 deepClone() throws IOException, ClassNotFoundException, OptionalDataException{
	   ByteArrayOutputStream bos = new ByteArrayOutputStream();
	   ObjectOutputStream oos = new ObjectOutputStream(bos);
	   oos.writeObject(this);
	   
	   ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
	   ObjectInputStream ois = new ObjectInputStream(bis);
	   return (Customer1)ois.readObject();
   }

   
   /** @param address
    * @pdOid b2258e1a-687b-44f3-9ba7-02b5f792ee90 */
   public void setAddress(Address1 address) {
	   this.addrs1 = address;
   }
   
   /** @pdOid 5a3c380a-d486-40fc-b4c6-3a6fd2d41340 */
   public Address1 getAddress() {
	   return this.addrs1;
   }

}