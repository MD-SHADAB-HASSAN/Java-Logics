import java.util.Scanner;
public class arr {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The no. of Elements in The Array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter Element "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }

        System.out.println("The Elements In The Array Are: ");
        for(int i=0;i<n;i++){
            System.out.println("Element at index "+ i + ": "+arr[i]);
        }
    }
}
