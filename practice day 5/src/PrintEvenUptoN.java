
//7. Write a program to print all even numbers between 1 to 100


public class PrintEvenUptoN {
    public static void main(String[] args) {
        int n = 1;
        for (;n<=100;n++) {
            if (n % 2 == 0) {
                System.out.printf("%d, ", n);
            }
        }
    }
}
