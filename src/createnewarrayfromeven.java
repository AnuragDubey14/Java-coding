
public class createnewarrayfromeven {
    public static void main(String[] args) {
        int []a1 = {1, 2, 3, 4, 5};
        int[]a2 = {6, 7, 8, 9, 10};
        int []n = new int[a1.length];
        for (int i = 0; i < a1.length; i++) {
            if (a1[i]%2==0){
                n[i] = a1[i];
            }
            if (a2[i]%2==0){
                n[i] = a2[i];
            }
        }
        for (int num:n){
            System.out.printf("Even element:%d\n",num);
        }
    }

}
