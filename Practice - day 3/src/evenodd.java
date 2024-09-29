// Take Positive integer input and tell if it is even or odd

import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a positive integer");
    int num = input.nextInt();
    input.close();
    if (num%2==0){
        System.out.println("The Entered number is Even "+num);
    }
    else{
        System.out.println("Entered number is odd "+num);
    }
    }
}
