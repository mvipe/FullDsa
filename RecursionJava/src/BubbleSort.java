import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int nums[]={1,3,6,5,7};
        bubbleSortRecursive(nums,0,1);

        System.out.println(Arrays.toString(nums));

    }

    static void bubbleSortRecursive (int[] arr,int i,int j) {

        if(i>=arr.length){
            return;
        }
        if(j>=arr.length-i){
            bubbleSortRecursive(arr,i+1,1);
        }
        else {
            if(arr[j]<arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1]=temp;
            }

            bubbleSortRecursive(arr,i,j+1);
        }



    }

    static void bubbleSortIterative(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted
            // hence stop the program
            if (!swapped) { // !false = true
                break;
            }
        }
    }


}
