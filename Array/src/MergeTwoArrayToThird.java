//17. Write a program to merge two arrays elements to store third array

public class MergeTwoArrayToThird {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6,7,8,9,10};
        int[] arr = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i]=arr1[i];
            arr[arr1.length+i]=arr2[i];
        }
        for (int n:arr){
            System.out.printf("%d, ",n);
        }
    }
}
