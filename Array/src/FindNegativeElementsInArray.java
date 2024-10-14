//Write a program to array elements print all Negative number

public class FindNegativeElementsInArray {
    public static void main(String[] args) {
        int[] arr = {-45, 32, -7, 3, -6};
        for (int n: arr){
            if (n<0) {
                System.out.printf("%d, ",n);
            }
        }
    }
}
