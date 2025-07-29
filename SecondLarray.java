import java.util.Arrays;

public class SecondLarray {
    public static int SecondLargest(int[] arr) {
        int n = arr.length;
        if (arr == null || arr.length < 2) {
            System.out.println("Invalid Input!: Array conatains atlast 2 elements");
            return -1;
        }
        Arrays.sort(arr);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 6, 8, 8 };
        System.out.println(SecondLargest(arr));

    }
}
