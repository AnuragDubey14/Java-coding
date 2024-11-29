//18. Write a program to array elements print all Positive number

public class FindPositiveElementsInArray {
    public static void main(String[] args) {
        int[] arr = {67, -4, 3, -5, 44};
        for(int n:arr){
            if (n>=0){
                System.out.printf("%d, ",n);
            }
        }
    }
}
