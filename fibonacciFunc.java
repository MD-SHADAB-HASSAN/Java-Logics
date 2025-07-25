public class fibonacciFunc {
    public static void fibonacci(int n){
        int n1=0,n2=1;

        for(int i=0;i<n;i++){
            System.out.println(n1+" ");

            //Swap logic
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }

    public static void main(String[] args) {
     int n = 15;
    fibonacci(n);   
    }
}
