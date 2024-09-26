// 3. If the marks obtained by a student in five different subjects are input through the keyboard, 
// find out the aggregate marks and percentage marks obtained by the student. 
// Assume that the maximum marks that can be obtained by a student in each subject
import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter first subject marks:");
        float num1 = input.nextFloat();
        System.out.println("Enter Second subject marks:");
        float num2 = input.nextFloat();
        System.out.println("Enter third subject marks:");
        float num3 = input.nextFloat();
        System.out.println("Enter fourth subject marks:");
        float num4 = input.nextFloat();
        System.out.println("Enter fifth subject marks:");
        float num5 = input.nextFloat();

        input.close();
        double total = num1+num2+num3+num4+num5;
        System.out.println("Total Aggregate marks:"+total);

        double percentage=total/5;
        System.out.println("Student Percentage:"+percentage+"%");

        
    }
}
