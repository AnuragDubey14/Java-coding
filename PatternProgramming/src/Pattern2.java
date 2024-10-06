//A
//A B
//A B C
//A B C D
//A B C D E

public class Pattern2 {
    public static void main(String[] args) {

        char ch1 = 'A';
        for(;ch1<='E';ch1++){
            char ch = 'A';
            for(;ch<=ch1;ch++) {
                System.out.printf("%c ",ch);
            }
            System.out.println("\n");
        }
    }
}
