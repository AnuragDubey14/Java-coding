//*****
//****
//***
//**
//*

import java.util.Scanner;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = input.nextInt();
        for(;rows>=1;rows--){
            for(int j = 1;j<=rows;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
