public class palindromeString {
    public static void main(String[] args) {
        String str = "madam";
        int l=0,r=str.length()-1;
        boolean flag = true;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                flag = false;
                break;
            }
            l++;
            r--;
        }
        if(flag){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
