public class createnewarraywithoddele {
    public static void main(String[] args) {
        int []n1 = {1, 2, 3, 4, 5};
        int[] n2 = {6, 7, 8, 9, 10};
        int [] n = new int[n1.length+ n2.length];
        int counter = 0;
        for (int i = 0; i < n1.length; i++) {
            if (n1[i]%2!=0) {
                n[counter] = n1[i];
                counter++;
            }
        }
        for (int i = 0; i < n2.length; i++) {
            if (n2[i]%2!=0) {
                n[counter] = n2[i];
                counter++;
            }
        }
        for (int num:n){
            System.out.printf("odd ele: %d\n",num);
        }
    }
}
