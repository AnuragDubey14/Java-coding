//4. Write a program to calculate the average value of array elements


public class FindAverageOfArray {
    public static void main(String[] args) {
        int[] arr =  {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num: arr) {
            sum+=num;
        }
        int average = sum/ arr.length;
        System.out.printf("Average of arr: %d",average);
    }
}
