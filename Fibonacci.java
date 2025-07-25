public class Fibonacci {
    public static void main(String[] args){
        int n = 5;
        if(n == 0){
            System.out.println(0);
        }
        else{
            int fib[] = new int[n+1];
            fib[0] = 0;
            fib[1] = 1;
            for(int i=2; i<fib.length; i++){
                fib[i] = fib[i-1] + fib[i-2];
            }
        System.out.println("The Fibonacci Series upto "+n+"th term: ");
            for(int i=0; i<fib.length; i++){
                System.out.println(fib[i]+" ");
            }
        }
    }
}
