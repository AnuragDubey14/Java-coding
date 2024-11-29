public class FindSecondMin {
    static  int findminsecond(int []arr){
        int first_min=Integer.MAX_VALUE;
        int second_min=Integer.MAX_VALUE;
        for (int n:arr){
            if (n < first_min) {
                second_min=first_min;
                first_min=n;
            }
            if (n>first_min && n<second_min) {
                second_min=n;
            }
        }
        return second_min;
    }
    public static void main(String[] args) {
        int []arr={2,9,11,7,10,5,4,6};
        int res=findminsecond(arr);
        System.out.printf("Second minimum: %d",res);
    }
}
