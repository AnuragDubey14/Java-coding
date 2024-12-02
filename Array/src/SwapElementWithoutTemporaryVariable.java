public class SwapElementWithoutTemporaryVariable {
    public static void swap(int a,int b){
        a=b-a;
        b=b-a;
        a=a+b;
        System.out.printf("%d\n",a);
        System.out.printf("%d\n",b);

    }
    public static void main(String[] args) {
        int a= 11;
        int b=10;
        swap(a,b);
    }
}
