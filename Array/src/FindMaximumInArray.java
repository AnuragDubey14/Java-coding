//write a program to find maximum element of an array

import java.util.Scanner;
public class FindMaximumInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("Enter %dth number",i);
            nums[i]= input.nextInt();
        }
        int max_element = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>max_element){
                max_element=nums[i];
            }
        }
        System.out.println("Maximum element of array: "+max_element);
    }
}
