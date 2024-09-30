
//21. Write a program to find number and sum of all integer between 100 and 200 which are divisible by 9

import java.util.Scanner;
public class FindDivisibleBy9 {
    public static void main(String[] args) {
        int num = 100;
        int sum = 0;
        while(num<=200){
            if (num%9==0){
                sum+=num;
            }
            num++;
        }
        System.out.println("Sum of all integers between 100 to 200 divisible by 9: "+sum);
    }

}
