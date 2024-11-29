//21. Write a program to array elements to print sum of Negative Numbers

public class FindSumOfNegativeElements {
    public static void main(String[] args) {
        int[] arr =  {10, -23, 45, -10, 30};
        int sum = 0;
        for (int n:arr){
            if (n <0) {
                sum+=n;
            }
        }
        System.out.printf("Sum of Negative numbers: %d",sum);
    }
}
