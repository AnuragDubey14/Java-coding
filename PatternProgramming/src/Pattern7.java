//******
//******
//******

import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.println("Enter number of columns: ");
        int col = input.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=col;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
