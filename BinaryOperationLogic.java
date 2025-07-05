package javalogics;

import java.util.Scanner;

class main {
    public static int BinaryOperationLogic(String str) {

        if (str == null)
            return -1;
        int res = str.charAt(0) - '0';
        for (int i = 1; i < str.length();) {
            char prev = str.charAt(i);
            i++;
            if (prev == 'A') {
                res = res & (str.charAt(i) - '0');
            } 
            
            else if (prev == 'B') {
                res = res | (str.charAt(i) - '0');
            }

            else {
                res = res ^ (str.charAt(i) - '0');
            i++;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The string: ");
        String str = sc.next();
        System.out.println(BinaryOperationLogic(str));
    }
}
