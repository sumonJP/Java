package com.exam;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        Vector<String> vec = new Vector<>(5);
        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Hyena");
        vec.add("Chitah");
        vec.add("Elephant");
        System.out.println("Size of vector is= " + vec.size());
        System.out.println("Capacity of the vector = " + vec.capacity());
        System.out.println("Vector elements are= " + vec);
        vec.addElement("Deer");
        vec.addElement("Goat");
        vec.addElement("Cow");
        vec.addElement("Birds");
//        vector always multiply the given vector number by 2

        System.out.println("Size of vector is= " + vec.size());
        System.out.println("Capacity of the vector = " + vec.capacity());
        System.out.println("Vector elements are= " + vec);
        
        if (vec.contains("Tiger")) {
            System.out.println("Tiger exist in index= "+vec.indexOf("Tiger"));
            
        } else {
            System.out.println("Tiger does not exist in the vector");
        }
        System.out.println("First element ="+vec.firstElement());
        System.out.println("Last element ="+vec.lastElement());
        
         System.out.println("Remove first element Tiger: "+vec.remove((String)"Tiger"));  
         System.out.println("Elements after removing tiger= "+vec);
         
         System.out.println("remove elements according to index= "+vec.remove(5));//vec.removeElementAt();
         
          //Get the hashcode for this vector  
        System.out.println("Hash code of this vector = "+vec.hashCode());  
        //Get the element at specified index  
        System.out.println("Element at index 1 is = "+vec.get(1));  

    }

}
