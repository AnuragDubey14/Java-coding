//19. Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
//
//Percentage >= 90% : Grade A
//Percentage >= 80% : Grade B
//Percentage >= 70% : Grade C
//Percentage >= 60% : Grade D
//Percentage >= 40% : Grade E
//Percentage < 40% : Grade F

import java.util.Scanner;
public class CalculatePercantage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Physics marks: ");
        int physics = input.nextInt();
        System.out.println("Enter Chemistry marks: ");
        int Chemistry = input.nextInt();
        System.out.println("Enter Biology marks: ");
        int biology = input.nextInt();
        System.out.println("Enter Mathematics Marks: ");
        int math = input.nextInt();
        System.out.println("Enter Computer Marks: ");
        int computer = input.nextInt();
        int percentage = (physics+Chemistry+biology+math+computer)/5;

        if (percentage>=90){
            System.out.println("Grade A");
        } else if (percentage>=80) {
            System.out.println("Grade B");

        } else if (percentage>=70) {
            System.out.println("Grade C");
        } else if (percentage>=60) {
            System.out.println("Grade D");
        } else if (percentage>=40) {
            System.out.println("Grade E");
        }
        else {
            System.out.println("Grade F");
        }
    }
}
