//17. write a program to Check Whether a Given Number is Prime or Not

import java.util.Scanner;
public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        input.close();
        int temp = num;
        boolean prime = true;
        int i=2;
        while(i<num){
            if(num%i==0){
                prime = false;
                break;
            }
            i++;
        }
        if(prime){
            System.out.printf("%d is prime",temp);
        }
        else {
            System.out.printf("%d is not prime",temp);
        }
    }
}
