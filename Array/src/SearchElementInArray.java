//write a program to find an element in a array if found then return index else -1


public class SearchElementInArray {
    public static void main(String[] args) {
    int[] nums = {1,2,11,15,22,78,29,10};
    int search = 11;
    int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==search){
                index = i;
                break;
            }
        }
        System.out.printf("Element found at index: %d",index);
    }
}
