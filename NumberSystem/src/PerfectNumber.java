// Write a program to check whether a number is perfect or not?


import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 1; i <num ; i++) {
            if (num%i==0){
                sum+=i;
            }
        }
        if (sum ==num){
            System.out.printf("%d is a perfect number",num);
        }
        else {
            System.out.printf("%d is not a perfect number",num);
        }
    }
}
