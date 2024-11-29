public class FindTripletsSumEqualToTarget{
    public static int FindTriplets(int []arr, int target){
        int len= arr.length;
        int triplets=0;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                for (int k = j+1; k < len; k++) {
                    if (arr[i]+arr[j]+arr[k]==target){
                        System.out.printf("%dst triplets:%d,%d,%d\n",triplets,arr[i],arr[j],arr[k]);
                        triplets++;
                    }
                }

            }

        }
        return triplets;

    }
    public static void main(String[] args) {
        int []arr={1,4,5,6,3};
        int target=12;
        int res=FindTriplets(arr,target);
        System.out.println("Array:");
        for (int num:arr){
            System.out.printf("%d, ",num);
        }

        System.out.printf("Total found Triplets %d",res);
    }
}
