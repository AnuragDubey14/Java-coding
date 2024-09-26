// 2. The distance between two cities (in km.) is input through the keyboard.
//  Write a program to convert and print this distance in meters, feet, inches and centimeters.

import java.util.Scanner;


public class second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Distance in K.M. :");

        double distance=input.nextDouble();
        input.close();
        double distance_in_meters=distance*1000;
        double distance_in_cm=distance_in_meters*100;
        double distance_in_feet=distance_in_cm*3.28084;;
        double distance_in_inch=distance_in_feet*12;

        System.out.println("Distance in meter:"+distance_in_meters);
        System.out.println("Distance in Centimeters:"+distance_in_cm);
        System.out.println("Distance in feet:"+distance_in_feet);
        System.out.println("Distance in inches:"+distance_in_inch); 


        
    }    
}
