//10. Write a program to find the maximum and minimum element in an array


public class FindMaxMinArray {
    public static void main(String[] args) {
        int[] arr = {23, 4, 32, 5, 75};
        int max = arr[0];
        int min = arr[0];
        for(int n: arr){
            if (n > max) {
                max = n;
            }
            if (n<min){
                min = n;
            }
        }
        System.out.printf("Maximum: %d\n",max);
        System.out.printf("Minimum: %d",min);
    }
}
