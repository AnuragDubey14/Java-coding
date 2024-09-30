//4. Write a program to print reverse tables
import java.util.Scanner;
public class ReverseTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = input.nextInt();
        for (int i = 10;i>0;i--){
            System.out.printf("%d X %d = %d\n",num,i,num*i);
        }
        }
}
