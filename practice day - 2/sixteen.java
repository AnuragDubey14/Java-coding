// 3. Write Java program to Convert an Integer to String
import java.util.Scanner;
public class sixteen {
    public static void main(String[] args){
        int num=0;
        String str;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");

        num = input.nextInt();
        str = Integer.toString(num);
        System.out.println("Converted String:"+str);
    }
}