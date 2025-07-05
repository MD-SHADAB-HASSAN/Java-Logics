public class KadanesArray {
    public static void main(String[] args) {
        int sum=0;int [] nums = new int[]{-2,1,-3,4-1,2,1,-5,4};
        int max = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(max, sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println("Max Sub Array: " +max);
    }
}
