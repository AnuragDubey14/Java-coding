public class SelectionSortDescending {
    public static void main(String[] args) {
        int []arr={2, 65, 23, 13, 18, 30, 46, 17, 52, 78};
        int maxindex=-1;
        for (int i = 0; i < arr.length; i++) {
            maxindex=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]>arr[maxindex]){
                    maxindex=j;
                }
            }
            if (maxindex!=i){
                int temp = arr[i];
                arr[i]=arr[maxindex];
                arr[maxindex]=temp;
            }
        }
        for (int n:arr){
            System.out.printf("%d ",n);
        }
    }
}
