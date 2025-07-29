import java.util.Arrays;

public class SecondSarray {
    public static int SecondSmallest(int[] arr) {
        int n = arr.length;
        if (arr == null || arr.length < 2) {
            System.out.println("Invalid Input!: Array conatains atlast 2 elements");
            return -1;
        }
        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[0]) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 5, 6, 8, 8 };
        System.out.println(SecondSmallest(arr));

    }
}
