//1
//12
//123
//1234
//12345

import java.util.Scanner;
public class Pattern13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = input.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
