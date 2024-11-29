//20. Write a program to array elements to print sum of Positive Numbers

public class FindSumOfPositiveElements {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 3, 4};
        int sum = 0;
        for(int n: arr){
            if (n>0){
                sum+=n;
            }
        }
        System.out.printf("Sum Of Positive number: %d",sum);
    }
}
