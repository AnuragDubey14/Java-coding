//22. Write a program to convert a binary number into a decimal number
// without using array, function and while loop

import java.util.Scanner;
public class BinaryToDecimalWithoutWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a binary number: ");
        int binary = input.nextInt();
        int res = 0;
        int pw = 1;
        for(;binary>0;){
            res = res+(binary%10)*pw;
            binary/=10;
            pw*=2;
        }
        System.out.println("Result:"+res);
    }
}
