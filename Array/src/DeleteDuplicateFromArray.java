
//23. Write a program to Delete Duplicate Elements from an Array

public class DeleteDuplicateFromArray {
    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 20, 30,20,10};
        int n=arr.length;
        arr = RemoveDuplicates(arr, n);
        for(int num:arr){
            System.out.printf("%d, ",num);
        }

    }

    public static int[] RemoveDuplicates(int [] a, int n){
        int[] temp = new int[n];
        int j=0;
        for (int i = 0; i < n; i++) {
            for (int k = i+1; k < n; k++) {
                if (a[i]>a[k]){
                    int b = a[i];
                    a[i] = a[k];
                    a[k] = b;
                }
            }
        }
        for (int i = 0; i < n-1; i++) {
            if (a[i]!=a[i+1]){
                    temp[j]=a[i];
                    j++;
            }
        }
        temp[j++]=a[n-1];
        return temp;
    }


}



