
//15. Write a program to array elements to print sum of Cubic Values


public class PrintSumOfCubicValues {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int n:arr) {
            sum+=n*n*n;
        }
        System.out.printf("Sum of Cubic Values: %d",sum);
    }
}
