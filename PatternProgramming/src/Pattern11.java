//        *
//      * * *
//    * * * * *
//  * * * * * * *



import java.util.Scanner;
public class Pattern11 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = input.nextInt();
        for(int i = 1; i<=rows;i++){
            for (int j = 1; j <= rows-i; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= (i*2)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
