// Check if number is positive, negative or zero

import java.util.Scanner;
public class checknum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        if (num<0){
            System.out.println("Number is negative" + num);
        }
        else if (num==0){
            System.out.println("Number is zero "+ num);
        }
        else{
            System.out.println("Number is Positive " + num);
        }
    }
}
