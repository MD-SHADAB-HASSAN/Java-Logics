import java.util.*;
public class oddEven {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if((n&1) == 0){
            System.out.println(n+" is Even");
        }

        else{
            System.out.println(n+" is odd");
        }
    }
}
