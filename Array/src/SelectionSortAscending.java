public class SelectionSortAscending {
    public static void main(String[] args) {
        int []arr = {2, 65, 23, 13, 18, 30, 46, 17, 52, 78};
        int minindex=-1;
        for (int i = 0; i < arr.length; i++) {
            minindex=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            if (minindex !=i) {
                int temp = arr[i];
                arr[i]=arr[minindex];
                arr[minindex]=temp;
            }
        }
        for (int n:arr){
            System.out.printf("%d ",n);
        }
    }
}
