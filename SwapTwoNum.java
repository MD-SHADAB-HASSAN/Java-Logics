// Ensure the folder structure matches this package name, or remove this line if not needed.

import java.util.Scanner;

public class SwapTwoNum {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Two Numbers to Swap:");
       int a=sc.nextInt();
       int b=sc.nextInt();

        // Swapping using arithmetic operations
        // Note: This method can cause overflow if the numbers are too large.
       System.out.println("Before Swap: a= " + a + " b= " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swap: a= " + a + " b= " +b);
   }

}
