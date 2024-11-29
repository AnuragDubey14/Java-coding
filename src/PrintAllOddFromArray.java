//11. Write a program to array elements print all Odd number


public class PrintAllOddFromArray {
    public static void main(String[] args) {
        int[] nums = {23, 45, 67, 34, 78};
        for(int n:nums){
            if(n%2 != 0){
                System.out.printf("%d ",n);
            }
        }
    }
}
