public class RotateArray {
    public static int[] rotate(int[]arr,int k){
        int n = arr.length;
        int []ans = new int[n];
        k = k%n;
        int j=0;
        for (int i = n-k; i < n; i++) {
            ans[j]=arr[i];
            j++;
        }
        for (int i = 0; i < n-k; i++) {
            ans[j]=arr[i];
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int [] ans=rotate(arr,5);
        for (int n:ans){
            System.out.printf("%d ",n);
        }
    }
}
