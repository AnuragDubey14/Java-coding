public class findSecondLargest {
    public static void main(String[] args) {
        int []arr = {10, 20, 30, 40, 50};
        int max = -1;
        int second_max = -1;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if ((second_max<arr[i]) && (arr[i]!=max)){
                second_max = arr[i];
            }
        }
        System.out.printf("Second largest: %d\n",second_max);
        System.out.printf("largest: %d",max);

    }
}
