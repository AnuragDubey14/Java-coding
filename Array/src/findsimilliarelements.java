public class findsimilliarelements {
    public static void main(String[] args) {
        int[] n1 ={10, 20, 30, 40, 50};
        int[] n2= {10, 30, 60, 50, 70};
        int [] n = new int[n1.length+ n2.length];
        int index = 0;
        for (int num1:n1) {
            for (int num2:n2) {
                if (num1==num2) {
                    n[index]=num1;
                    index++;
                }
            }
        }
        for (int ele:n){
            System.out.printf("Common element:%d\n",ele);
        }

    }
}
