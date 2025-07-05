public class BooleanPalindrome {
    public static void main(String[] args) {
       BooleanPalindrome bp = new BooleanPalindrome();
        System.out.println(bp.isPalindrome(12)); // true
    }
    public boolean isPalindrome(int x){
        if(x<0 || (x%10==0 && x!=0)){
            return false;
        }
        int rev=0;
        while(rev>0){
            rev=rev*10 + x%10;
            x=x/10;
        }
        return x==rev || x==rev/10;
    }
 }
    

