public class FindFirstNonRepeatedElement {
    public static int findFirstUnique(int[] arr) {
        // Iterate through the array to mark frequencies
        for (int i = 0; i < arr.length; i++) {
            int current = Math.abs(arr[i]);  // Get the absolute value of the element

            // If the element at the 'current' index is positive, negate it to mark it
            if (current>= arr.length){
                continue;
            }
            if (arr[current] >= 0) {
                arr[current] = -arr[current];
            } else {
                // If the element is already negative, it means it has been repeated
                arr[current] = Math.abs(arr[current]);
            }
        }
        for (int n:arr){
            System.out.printf("%d ",n);
        }
        // Iterate again to find the first non-repeated element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                return arr[i];  // The first non-repeated element
            }
        }

        // If no unique element is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 4, 8, 3};  // Example array
        int res = findFirstUnique(arr);
        System.out.printf("First unique: %d", res);  // Output the result
    }
}
