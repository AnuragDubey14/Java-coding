//5. Write a program to store elements in an array and print it

import java.util.Scanner;
public class StoreElementsArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int arr_size = input.nextInt();
        int[] nums = new int[arr_size];
        for (int i = 0; i < arr_size; i++) {
            System.out.printf("Enter a[%d]: ",i);
            nums[i]= input.nextInt();
        }
        for(int n:nums){
            System.out.printf("%d, ",n);
        }
    }
}
