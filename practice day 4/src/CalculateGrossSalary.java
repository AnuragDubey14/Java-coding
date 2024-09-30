//20. Write a program to input basic salary of an employee and calculate its Gross salary according to following:
//
//Basic Salary <= 10000 : HRA = 20%, DA = 80%
//Basic Salary <= 20000 : HRA = 25%, DA = 90%
//Basic Salary > 20000 : HRA = 30%, DA = 95%

import java.util.Scanner;
public class CalculateGrossSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Basic Salary: ");
        double salary = input.nextDouble();
        input.close();
        double DA = 0.0, HRA = 0.0;
        if (salary<=10000){
             HRA = salary*(20.0/100.0);
             DA = salary*(80.0/100.0);
        } else if (salary<=20000) {
             HRA = salary*(25.0/100.0);
             DA = salary*(90.0/100.0);
        } else if (salary>20000) {
             HRA = salary*(30.0/100.0);
             DA = salary*(95.0/100.0);
        }
        System.out.println("The DA = "+DA);
        System.out.println("The HRA = "+HRA);
    }
}
