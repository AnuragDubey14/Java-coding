//20. Write a program to enter the numbers till the user wants and at the end the program
// should display the largest and smallest numbers entered

import java.util.Scanner;
public class FindMaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int max_num = Integer.MIN_VALUE;
        int min_num = Integer.MAX_VALUE;
        do{
            System.out.println("Enter a number: ");
            num = input.nextInt();
            if (num>=max_num){
                max_num=num;
            }
            if(num<=min_num){
                min_num=num;
            }
        }while(num!=0);
        System.out.println("Maximum number: "+max_num);
        System.out.println("Minimum number: "+min_num);
    }
}
