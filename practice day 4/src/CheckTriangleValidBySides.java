//15. Write a program to input all sides of a triangle and check whether triangle is valid or not

import java.util.Scanner;
public class CheckTriangleValidBySides {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first side: ");
        float first = input.nextFloat();
        System.out.println("Enter Second side: ");
        float second = input.nextFloat();
        System.out.println("Enter Third Side: ");
        float third = input.nextFloat();
        if ((first+second)>third){
            if ((first+third)>second){
                if ((second+third)>first){
                    System.out.println("Triangle is valid.");
                }
                else{
                    System.out.println("Triangle is not valid.");
                }
            }
            else {
                System.out.println("Triangle is not valid.");
            }
        }
        else {
            System.out.println("Triangle is not valid!");
        }

    }
}
