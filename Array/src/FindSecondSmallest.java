//Write a program to find the second smallest element in an array

public class FindSecondSmallest {
    public static void main(String[] args) {
        int[] arr =  {10, 20, 5, 2, 30};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.printf("Second Min Element: %d",arr[1]);
    }
}
