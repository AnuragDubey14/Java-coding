public class BubbleSortAscending {
    public static void main(String[] args) {
        int []arr={2, 65, 23, 13, 18, 30, 46, 17, 52, 78};
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        for (int n:arr){
            System.out.printf("%d ",n);
        }
    }
}
