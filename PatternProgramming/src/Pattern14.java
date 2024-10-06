//    1
//   121
//  12321
// 1234321

import java.util.Scanner;
public class Pattern14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = input.nextInt();
        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <=rows-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            for (int k = i-1; k >=1 ; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
