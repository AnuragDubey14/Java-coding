//14. Write a program to input angles of a triangle and check whether triangle is valid or not

import java.util.Scanner;
public class CheckTriangleValidity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first angle:");
        float first_angle = input.nextFloat();
        System.out.println("Enter Second angle: ");
        float second_angle = input.nextFloat();
        System.out.println("Enter Third angle: ");
        float third_angle = input.nextFloat();
        input.close();

        if (first_angle+second_angle+third_angle==180 && first_angle>0 && second_angle>0 && third_angle>0){
            System.out.println("Triangle is valid");
        }
        else {
            System.out.println("Triangle is invalid");
        }

    }

}
