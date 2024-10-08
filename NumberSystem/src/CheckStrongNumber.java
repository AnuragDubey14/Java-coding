//23. Write a program to check whether a number is a Strong Number or not

import java.awt.event.ItemListener;
import java.util.Scanner;
public class CheckStrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= input.nextInt();
        int temp = num;
        int sum = 0;
        int digit = 0;

        while(num>0){
            digit = num%10;
            int fact = 1;
            for (int i = 1; i <= digit ; i++) {
                fact*=i;
            }
            sum+=fact;
            num/=10;
        }
        if (temp == sum) {
            System.out.printf("%d is a strong number",temp);
        }
        else {
            System.out.printf("%d is not a strong number",temp);
        }
    }

}
