// 1234567
// 2345671
// 3456712
// 4567123
// 5671234
// 6712345
// 7123456


import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = input.nextInt();
        for (int i = 1; i <=rows ; i++) {
            for (int j = i; j <=rows ; j++) {
                System.out.print(j);
            }
            for (int k = 1; k < i ; k++) {
                System.out.print(k);
            }
            System.out.println();

        }
    }
}
