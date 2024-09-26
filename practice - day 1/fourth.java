// 4. Temperature of a city in Fahrenheit degrees is input through the keyboard. 
// Write a program to convert this temperature into Centigrade degrees.
import java.util.Scanner;
public class fourth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in farheneit:");

        double farheneit=input.nextDouble();
        input.close(); 
        double Centigrade = (farheneit - 32) * 5 / 9;
        System.out.println("Temperature in centigrade:"+Centigrade+"C");
    }
    
}
