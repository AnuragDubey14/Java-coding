import java.util.Scanner;

public class eleventh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");

        String string;
        string = input.next();

        Boolean bool = new Boolean(string);
        System.out.println("Boolean value is :"+bool);

    }
}