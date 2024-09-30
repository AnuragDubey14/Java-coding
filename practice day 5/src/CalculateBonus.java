//3. The current year and the year in which the employee joined the organization are entered through
// the keyboard. If the number of years for which the employee has served the organization is greater
// than 3 then a bonus of Rs. 2500/- is given to the employee. If the years of service are not greater
// than 3, then the program should do nothing


import java.util.Scanner;
public class CalculateBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Employee Joining year: ");
        int PreviousYear = input.nextInt();
        System.out.println("Enter Current Year: ");
        int CurrentYear = input.nextInt();

        int difference = CurrentYear - PreviousYear;
        if (difference>3){
            System.out.println("The bonus is 2500 to the employee");
        }
        else {
            System.out.println("Not Eligible for bonus");
        }
    }
}
