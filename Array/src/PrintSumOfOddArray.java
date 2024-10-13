
//13. Write a program to array elements to print sum of Odd Numbers

public class PrintSumOfOddArray {
    public static void main(String[] args) {
        int[] arr = {12, 34, 59, 45, 22};
        int sum = 0;
        for(int n:arr){
            if (n % 2 !=0) {
                sum+=n;
            }
        }
        System.out.printf("Sum of all odd numbers: %d",sum);
    }}
