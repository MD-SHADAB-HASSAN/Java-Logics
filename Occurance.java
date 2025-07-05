

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        int k = 0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int newarr[] = new int[n];
        for(int i=0;i<n;i++){
            count = 0;
            for(int j=0;j<=i;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count==1){
                newarr[k]=arr[i];
                k++;
            }
        }
    }
}
