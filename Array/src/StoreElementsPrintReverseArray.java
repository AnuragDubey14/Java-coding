//8. Write a program in to read n number of values in an array and display it in reverse order

import java.util.Scanner;
public class StoreElementsPrintReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int arr_size = input.nextInt();
        int[] nums = new int[arr_size];
        for (int i = 0; i < arr_size; i++) {
            System.out.printf("Enter a[%d]: ",i);
            nums[i]= input.nextInt();
        }
        for (int i = arr_size-1; i >=0 ; i--) {
            System.out.printf("%d, ",nums[i]);
        }
    }
}
