//3. Write a program to print tables

import java.util.Scanner;
public class PrintTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to print table: ");
        int n = input.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }
}
