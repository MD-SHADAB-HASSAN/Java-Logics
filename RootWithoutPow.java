import java.util.*;
public class RootWithoutPow {

    public static int sqrt(int x){
        int ans = -1,low = 0,high = x,mid;

        while(low<=high){
            mid = low+(high-low)/2;

            if(mid*mid == x) return mid;

            else if(mid*mid<x){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.print("Enter the Number to find the root: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int newAns = RootWithoutPow.sqrt(x);
        System.out.println(newAns);

    }
}
