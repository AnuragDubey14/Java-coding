//. Write Java program to Convert byte into the string

import java.util.Scanner;
public class fourteen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a byte:");
        byte b = input.nextByte();
        String str;
        str = Byte.toString(b);
        System.out.println("String value :"+str);
    }
}