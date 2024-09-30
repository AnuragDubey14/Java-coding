import java.util.Scanner;

public class NumberOfNotes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total amount: ");
        long amount = input.nextLong();

        // Initialize note counters
        long fiveHundredNotes = 0;
        long hundredNotes = 0;
        long fiftyNotes = 0;
        long tenNotes = 0;
        long fiveNotes = 0;
        long twoNotes = 0;
        long oneNotes = 0;

        // Calculate the number of 500 notes
        if (amount >= 500) {
            fiveHundredNotes = amount / 500;
            amount %= 500; // Update the remaining amount
        }

        // Calculate the number of 100 notes
        if (amount >= 100) {
            hundredNotes = amount / 100;
            amount %= 100; // Update the remaining amount
        }

        // Calculate the number of 50 notes
        if (amount >= 50) {
            fiftyNotes = amount / 50;
            amount %= 50; // Update the remaining amount
        }

        // Calculate the number of 10 notes
        if (amount >= 10) {
            tenNotes = amount / 10;
            amount %= 10; // Update the remaining amount
        }

        // Calculate the number of 5 notes
        if (amount >= 5) {
            fiveNotes = amount / 5;
            amount %= 5; // Update the remaining amount
        }

        // Calculate the number of 2 notes
        if (amount >= 2) {
            twoNotes = amount / 2;
            amount %= 2; // Update the remaining amount
        }

        // The remaining amount will be the number of 1 notes
        oneNotes = amount;

        // Display the results
        System.out.printf("500 notes - %d\n", fiveHundredNotes);
        System.out.printf("100 notes - %d\n", hundredNotes);
        System.out.printf("50 notes - %d\n", fiftyNotes);
        System.out.printf("10 notes - %d\n", tenNotes);
        System.out.printf("5 notes - %d\n", fiveNotes);
        System.out.printf("2 notes - %d\n", twoNotes);
        System.out.printf("1 notes - %d\n", oneNotes);
    }
}
