package javalogics;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int reversed = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number To Be Reversed: ");
        int num = sc.nextInt();

        while (num != 0) {
            
            int digit = num % 10;    //Get The Last Digit From the Number

            reversed = reversed * 10 + digit;

            num = num / 10;          //Removes The Last Digit From The Number
        }
        System.out.print("The Reversed Number Is: " + reversed);

    }
}
