

package com.mycompany.hemo4;

import java.util.Scanner;
public class Hemo4 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
    
        System.out.println("enter the radius");
     Double radius = scanner.nextDouble();
        
      System.out.println("the area of rhe circle is:" + Math.PI*Math.pow(radius,2));
        

       
    }
}
