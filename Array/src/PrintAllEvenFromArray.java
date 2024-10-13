//12. Write a program to array elements print all Even number


public class PrintAllEvenFromArray {
    public static void main(String[] args) {
        int[] arr = {23, 45, 89, 34, 12};
        for(int n:arr){
            if (n % 2 ==0) {
                System.out.printf("%d, ",n);
            }
        }
    }}
