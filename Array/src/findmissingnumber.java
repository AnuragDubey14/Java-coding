public class findmissingnumber {
    public static void main(String[] args) {
        int []arr = {1, 2, 4, 5, 6, 7};
        int missing = 0;
        for (int i = 0; i < arr.length-1; i++) {
         if (arr[i]+1!=arr[i+1]){
             missing = arr[i]+1;
         }
        }
        System.out.printf("Missing element %d\n",missing);
    }
}
