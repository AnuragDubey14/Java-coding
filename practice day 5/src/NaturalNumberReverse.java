
//2. Write a program to print all natural numbers in reverse

import java.util.Scanner;
public class NaturalNumberReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = input.nextInt();
        for(;n>0;n--){
            System.out.printf("%d,\n",n);
        }
    }


}
