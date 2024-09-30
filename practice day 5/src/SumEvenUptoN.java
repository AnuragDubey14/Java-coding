//10. Write a program to find sum of all even numbers between 1 to n

import java.util.Scanner;
public class SumEvenUptoN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n: ");
        int num = input.nextInt();
        int sum = 0;
        for(int i =1;i<=num;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.printf("Sum of all even number from %d to %d = %d",1,num,sum);
    }
}
