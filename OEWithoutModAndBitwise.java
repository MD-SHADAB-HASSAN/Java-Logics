import java.util.Scanner;
class OEWithoutModAndBitwise {
    public static void main(String[] args) {
        System.out.print("Enter a nUmber to Check Even Or Odd: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n/2)*2==n){
            System.out.print("The number is Even");
            System.out.println();
        }else{
            System.out.print("The number is Odd");
        }
        
    }
}