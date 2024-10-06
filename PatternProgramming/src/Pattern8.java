//******
//*    *
//*    *
//******

import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows = input.nextInt();
        System.out.println("Enter columns: ");
        int cols = input.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if ((i == 1 || i == rows)||(j==1 || j==cols)) {
                    System.out.print("*");
                } else {
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
