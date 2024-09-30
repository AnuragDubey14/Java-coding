//5. Write a program to print all alphabets from a to z

import java.util.Scanner;
public class PrintSmallLetterAlphabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(char ch = 'a'; ch<='z';ch++){
            System.out.printf("%s,\n",ch);
        }
    }
}
