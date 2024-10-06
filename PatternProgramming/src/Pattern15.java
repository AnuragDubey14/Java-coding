//    1
//   2 2
//  3   3
// 4444444


import java.util.Scanner;
public class Pattern15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = input.nextInt();
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i == rows) {
                    System.out.print(i);
                }
                else if (j==1||j==(2 * i - 1)){
                    System.out.print(i);
                }
                 else {
                    System.out.print(" ");
                }
            }
            // Move to the next line
            System.out.println();
        }
    }
}
