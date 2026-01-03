public class SwapXor {
    public static void main(String[] args) {
        int a = 11;
        int b = 13;

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
