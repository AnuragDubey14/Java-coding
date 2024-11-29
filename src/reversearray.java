public class reversearray {
    // Method to reverse the array
    public static void reverseArray(int[] arr) {
        int lastIndex = arr.length - 1;
        int temp;

        // Swap elements from the start and end of the array
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[lastIndex - i];
            arr[lastIndex - i] = temp;
        }
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {1, 4, 3, 2, 6, 5};

        // Call the reverseArray method to reverse the array
        reverseArray(arr);

        // Print the reversed array
        for (int num : arr) {
            System.out.printf("%d ", num);
        }
    }
}
