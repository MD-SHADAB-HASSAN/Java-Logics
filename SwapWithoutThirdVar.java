public class SwapWithoutThirdVar {
    public static void main(String[] args) {
        int a = 19;
        int b = 17;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
