public class MaxWater {
    public static int StoreWtr(int[] arr){
        int max = 0;
        for(int i = 0; i< arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int ht = Math.min(arr[i],arr[j]);
                int width = j -1;
                int currWater = ht*width;
                max = Math.max(max,currWater);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(StoreWtr(arr));
    }
}
