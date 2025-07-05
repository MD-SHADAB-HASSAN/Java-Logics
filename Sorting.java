package javalogics;


public class Sorting {
    public static void main(String[] args) {
        int temp, arr[] = { 2, 1, 4, 3, 6, 5, 8, 7,10,19,14 };
        System.out.println("Before Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("\nAfter Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
