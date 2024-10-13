//14. Write a program to array elements to print sum of Even Numbers

public class PrintSumOfEvenArray {
    public static void main(String[] args) {
        int[] arr =  {56, 78, 45, 79, 34};
        int sum = 0;
        for(int n:arr){
            if (n % 2==0) {
                sum+=n;
            }
        }
        System.out.printf("Sum of all even numbers: %d",sum);
    }
}
