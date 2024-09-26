// Write a program to convert seconds to hour, minute and seconds

import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of seconds:");
        long seconds = input.nextLong(); 
        input.close();

        // Calculate hours, minutes, and remaining seconds
        long hours = seconds / 3600; // 1 hour = 3600 seconds
        seconds %= 3600; // Remaining seconds after extracting hours
        long minutes = seconds / 60; // 1 minute = 60 seconds
        seconds %= 60; // Remaining seconds after extracting minutes

        // Display the result
        System.out.println("Converted Time: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }
}
