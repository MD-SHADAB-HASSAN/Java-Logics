package javalogics;

import java.util.Scanner;
public class searching {
    public static void main(String[] args) {
        int arr[] = {11,55,66,78,99};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number to Find In The array: ");
        int target = sc.nextInt();

        boolean found = false;
        int temp;

        for(int i=0;i<arr.length;i++){
            temp=arr[i];
            if(temp==target){
                System.out.println("Element " + target + " Found at index " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Element "+ target + " not found ");
            
        }
        sc.close();

    }
}
