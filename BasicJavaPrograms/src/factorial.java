/*

 * To change this template, choose Tools | Templates

 * and open the template in the editor.

 */

 

import java.util.Scanner;

/**

 *

 * @author <your name>

 */

public class FactorialApp {

    public static void main(String[] args) {
     System.out.println("Hello World!");
     int n=0;
     long val;
    
     System.out.println("Please enter a number\n");
     n = new Scanner(System.in).nextInt();
     val = factorial(n);
     System.out.println("Val = " + val);
    }

   public static long factorial(int n)
    {
     long result =1;
     while (n-->=0)
     {
          result*=n;
     }
     return result;
    }
}
