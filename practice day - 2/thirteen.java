//Write Java program to Extract Numbers from the string

import java.util.Scanner;
public class thirteen{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string(contain number): ");
        String str = input.nextLine();
        input.close();
        String num = str.replaceAll("[^0-9]","");
        long extracted_num = Integer.parseInt(num);
        System.out.println("Extracted number: "+extracted_num);
    }
}