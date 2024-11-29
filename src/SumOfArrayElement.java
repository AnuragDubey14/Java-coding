//write a program to print sum of all element of a array

import java.util.Scanner;
public class SumOfArrayElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter %d number: ",i);
            nums[i]=input.nextInt();
        }
        int sum = 0;
        for (int i : nums) {
            sum+=i;
        }
        System.out.printf("Sum of elements of array: %d",sum);
    }
}
