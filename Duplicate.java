
public class Duplicate {
    public static int Duplicate(int[] arr) {
        if (arr.length == 0)
            return 0;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 4, 0, 0, 7 };
        int res = Duplicate(arr);
        System.out.println("Duplicate numbers are: " + res);
        System.out.println("Array after removing duplicate");
        for (int i = 0; i < res; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
