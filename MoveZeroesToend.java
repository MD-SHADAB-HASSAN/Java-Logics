import java.util.Scanner;

public class MoveZeroesToend {
    	public static void main(String[] args) {
        System.out.print("Enter The No. Elements In Array: ");
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.print("Eneter the Elements in Array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;

        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count] = arr[i];
                count++;
            }
        }

        while(count<n){
            arr[count] = 0;
            count++;
        }

        System.out.print("Array with Elements and zeroes at end: ");
        for(int i=0;i<n;i++){
            System.out.print(+arr[i]+ " ");
        }
    }
}
