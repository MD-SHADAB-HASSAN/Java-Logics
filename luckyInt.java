public class luckyInt {
    public static int findLucky(int[] arr) {
        int[] freq = new int[501];

        for (int num : arr) {
            freq[num]++;
        }

        for (int i = 500; i >= 1; i--) {
            if (freq[i] == i) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4};  // Sample input
        int lucky = findLucky(arr);
        System.out.println("Lucky number: " + lucky);
    }
}
