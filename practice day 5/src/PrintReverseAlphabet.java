
//6. Write a program to print reverse alphabets from Z to A


public class PrintReverseAlphabet {
    public static void main(String[] args) {
        char ch = 'Z';
        for(;ch>='A';ch--){
            System.out.printf("%s,\n",ch);
        }
    }
}
