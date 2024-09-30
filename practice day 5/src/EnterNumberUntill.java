//19. Write a program to enter the numbers till the user wants and at the end it should display
// the count of positive, negative and zeros entered

import java.util.Scanner;
public class EnterNumberUntill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c_positive = 0;
        int c_negative = 0;
        int c_zero = 0;
        int num = 0;
        do{
            System.out.println("Enter number: ");
            num = input.nextInt();
            if (num<0){
                c_negative+=1;
            } else if (num>0) {
                c_positive+=1;

            }
            else {
                c_zero+=1;
            }
        }while(num!=-1);
        System.out.println("Total Count Positive: "+c_positive);
        System.out.println("Total Count Negative: "+c_negative);
        System.out.println("Total Count Zero: "+c_zero);
    }
}
