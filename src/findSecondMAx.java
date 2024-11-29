public class findSecondMAx {
    public static int SecondMax(int[]arr){
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for (int n:arr){
            if (n>max){
                second_max=max;
                max=n;
            } else if (n<max && n>second_max) {
                second_max=n;
            }
        }
        return second_max;
    }
    public static void main(String[] args) {
        int[]arr={10,8,5,11,6,3,7,2,12};
        int res = SecondMax(arr);
        System.out.printf("Second Maximum element: %d",res);
    }
}
