/***********************************************************************
 * Module:  Circle.java
 * Author:  Administrator
 * Purpose: Defines the Class Circle
 ***********************************************************************/
package test_2_1;
import java.util.*;

/** @pdOid 0301b34a-6e93-4198-bce2-0ce97349e82a */
public class Circle extends Shape {
   /** @pdOid 984e5917-f703-4984-9644-675ba94badd0 */
   public void setColor() {
      System.out.println("设置圆形颜色");
   }
   
   /** @pdOid dde9e020-e38c-48cf-8f55-614a25e0012b */
   public void setSize() {
	   System.out.println("设置圆形大小");
   }
   
   /** @pdOid 8608e711-6fbb-4b22-b0d5-890c2137e3a5 */
   public void display() {
	   System.out.println("显示圆形");
   }
   
   /** @pdOid 55ec1465-393c-41e9-9db3-d98c41b419b1 */
   public void fill() {
	   System.out.println("填充圆形颜色");
   }
   
   /** @pdOid 83f199a3-0ec3-4c3b-baeb-0f1a9dec6343 */
   public void init() {
	   System.out.println("初始化圆形");
   }

}