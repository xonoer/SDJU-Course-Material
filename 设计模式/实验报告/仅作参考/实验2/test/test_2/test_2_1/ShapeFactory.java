/***********************************************************************
 * Module:  ShapeFactory.java
 * Author:  Administrator
 * Purpose: Defines the Class ShapeFactory
 ***********************************************************************/
package test_2_1;
import java.util.*;

/** @pdOid 89a6bf16-463e-44db-99f0-d290ec94a64d */
public class ShapeFactory {
   /** @param type
    * @pdOid 03f3bf9e-d18b-4802-8957-9f087b204d38 */
   public static Shape createShape(String type) throws UnsupportedShapeException{
      if(type.equalsIgnoreCase("circle"))
    	  return new Circle();
      else if(type.equalsIgnoreCase("triangle"))
    	  return new Triangle();
      else if(type.equalsIgnoreCase("rectangle"))
    	  return new Rectangle();
      else
    	  throw new UnsupportedShapeException("Í¼ÐÎ²»´æÔÚ");
   }

}