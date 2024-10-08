


import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary number");
        int binary = input.nextInt();
        int res = 0;
        int pw = 1;
        while(binary>0){
            res = res+(binary%10)*pw;
            binary=binary/10;
            pw*=2;
        }
        System.out.print(res);
    }
}
