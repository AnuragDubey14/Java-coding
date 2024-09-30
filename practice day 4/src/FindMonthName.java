
//12. Write a program to input month number and print month Name

import java.util.Scanner;
public class FindMonthName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month number");
        int month = input.nextInt();
        input.close();
        switch (month){
            case 1:
                System.out.printf("%d is January",month);
                break;
            case 2:
                System.out.printf("%d is February",month);
                break;

            case 3:
                System.out.printf("%d is March",month);
                break;

            case 4:
                System.out.printf("%d is April",month);
                break;
            case 5:
                System.out.printf("%d is May",month);
                break;

            case 6:
                System.out.printf("%d is june",month);
                break;
            case 7:
                System.out.printf("%d is July",month);
                break;
            case 8:
                System.out.printf("%d is August",month);
                break;
            case 9:
                System.out.printf("%d is September",month);
                break;
            case 10:
                System.out.printf("%d is October",month);
                break;
            case 11:
                System.out.printf("%d is November",month);
                break;
            case 12:
                System.out.printf("%d is December",month);
                break;
            default:
                System.out.println("Please enter valid month number");
        }

    }
}
