import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int nums[]={1,3,6,5,7};
        bubbleSortIterative(nums);

        System.out.println(Arrays.toString(nums));

    }

    static void bubbleSortIterative(int[] nums){
        for(int i=0;i<nums.length;i++){

            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
}
