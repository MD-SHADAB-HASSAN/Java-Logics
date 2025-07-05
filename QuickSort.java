


public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};
        System.out.println("Array Before Sorting: ");
        printArray(arr);

        quicksort(arr,0,arr.length-1);

        System.out.println("\nArray After Sorting");
        printArray(arr);

    }

    public static void quicksort(int[] arr,int low,int high){
        if(low<high){
            int pivotIndex = partition(arr,low,high);
    
    
            quicksort(arr,low,pivotIndex-1);
            quicksort(arr,pivotIndex+1,high);
    
        }
    }
    
    public static int partition(int[] arr, int low, int high) {
       int pivot=arr[high];
       int i = low-1;

       for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {  // If current element is smaller than pivot
            i++;

            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
          // Swap arr[i+1] with pivot element (arr[high])
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;  // Return the index of the pivot
    }

     // Utility function to print the array
     public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
}
