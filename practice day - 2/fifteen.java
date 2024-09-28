// Write Java program to Convert a short integer into a string

import java.util.Scanner;
public class fifteen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        short num = 0;
        String str;
        System.out.println("Enter a short integer:");
        num = input.nextShort();
        str = Short.toString(num);
        System.out.println("converted short to string: "+str);

    }
}