// 11. A cashier has currency notes of denominations 10, 50 and 100.
//  If the amount to be withdrawn is input through the keyboard in hundreds,
//  find the total number of currency notes of each denomination the cashier will have to give to the withdrawer.


import java.util.Scanner;
public class fourth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount in hundreds:");
        long number = input.nextInt();
        input.close();
        if (number<100||number>999)
        {
         System.out.println("Please enter the number in hundreds");   
        }
        else{
            long hundreds_notes = number/100;
            number=number%100;
            long fifty_notes = number/50;
            number=number%50;
            long ten_note=number/10;

            System.out.println("Hundreds notes:"+hundreds_notes);
            System.out.println("fifty notes:"+fifty_notes);
            System.out.println("Ten notes"+ten_note);
        }

    }
    
}
