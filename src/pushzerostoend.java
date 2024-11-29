public class pushzerostoend {
    public static void main(String[] args) {
        int []arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int n = arr.length;
        int nonZeroIndex = 0;
        // Traverse the array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i]; // Place non-zero element at the correct position
                nonZeroIndex++;
            }
        }

        // Fill remaining positions with zeros
        for (int i = nonZeroIndex; i < n; i++) {
            arr[i] = 0;
        }
        for (int num:arr){
            System.out.printf("%d ",num);
        }
    }
}
