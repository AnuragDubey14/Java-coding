public class FindFirstRepeatedElement {
    public static int FindFirstDuplicate(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int current = Math.abs(arr[i]); // Get the absolute value of the current element
            System.out.printf("current after abs %d\n",current);
            // Check if the value is within the valid range (0 to arr.length - 1)
            if (current >= arr.length || current < 0) {
                continue; // Ignore values that are out of bounds
            }
            // If the value at the index 'current' is negative, it means we've already encountered this number
            if (arr[current] < 0) {
                return current; // This is the first repeated element
            }
            // Otherwise, mark the value at the index 'current' by making it negative
            arr[current] = -arr[current];
            System.out.printf("arr[current] %d\n",arr[current]);
        }
        // If no repeated element is found, return -1
        return -1;
    }
    public static void main(String[] args) {
        int []arr={2,3,1,5,0,8,1};
        int res=FindFirstDuplicate(arr);
        System.out.printf("First repeated element: %d",res);
    }
}
