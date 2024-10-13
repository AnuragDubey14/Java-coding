//2. Write a program to Sort Numeric Array In Descending Order

public class SortDescendingArray {
    public static void main(String[] args) {
        int[] nums =  {23, 5, 67, 20, 3, 30, 79, 3, 70, 2};
        int temp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]<nums[j]){
                    temp = nums[i];
                    nums[i]=nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int num:nums){
            System.out.printf("%d ",num);
        }
    }
}
