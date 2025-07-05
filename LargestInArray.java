package javalogics;
public class LargestInArray {
    public static void main(String[] args) {
        
        int [] arr = new int[]{2,4,3,11,15};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The Largest number in The Array is: " +max);
    }
}
