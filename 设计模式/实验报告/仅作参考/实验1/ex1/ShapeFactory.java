/***********************************************************************
 * Module:  ShapeFactory.java
 * Author:  Administrator
 * Purpose: Defines the Class ShapeFactory
 ***********************************************************************/

import java.util.*;

/** @pdOid 2af43fb8-149d-4252-a5b8-6217e39d9b4b */
public class ShapeFactory {
   /** @param type
    * @pdOid 0635cffe-f9e8-439f-8052-c73eb17cb8ef */
   public shape createShape(char type) {
      if type.equals("c")
         return new Circle();
         else if type.equals("r")
            return new Rectangle();
            else if type.equals("e")
               return new Ellipse();
               else
      // TODO: implement
                  return null;
   }

}