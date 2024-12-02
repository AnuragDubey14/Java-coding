public class FindPairstotargetsum {
    public static void main(String[] args) {
        int []arr={4,6,3,5,8,2};
        int len = arr.length;
        int pair = 0;
        int target = 7;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if (arr[i]+arr[j]==target){
                    System.out.printf("%dst pair %d,%d\n",pair,arr[i],arr[j]);
                    pair++;
                }
            }
        }
        System.out.printf("Total Pair %d",pair);
    }
}
