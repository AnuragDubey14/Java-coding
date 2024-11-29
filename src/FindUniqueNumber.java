public class FindUniqueNumber {
    public static int FindUnique(int []arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j >i; j--) {
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                    break;
                }
            }
        }
        for (int num:arr){
            if (num>0){
                return num;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,4,3,8,2,1};
        int res = FindUnique(arr);
        System.out.printf("Unique number: %d",res);

    }
}
