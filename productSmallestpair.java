package javalogics;

import java.util.Scanner;

class Main {
    public static int productSmallestpair(int arr[], int n, int sum) {
        if (n < 2)
            return -1;
        int check, temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        check = arr[0] + arr[1];
        if (check >= sum) {
            return arr[0] * arr[1];
        } 
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(productSmallestpair(arr, n, sum));
        
    }
}
