
//16. Write a program in to copy the elements of one array into another array

public class CopyOneArrayToAnother {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr_copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr_copy[i] = arr[i];
        }
        System.out.println("Copied array: ");
        for(int i:arr_copy){
            System.out.printf("%d, ",i);
        }
    }
}
