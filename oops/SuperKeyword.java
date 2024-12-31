class A
{
    public A(){
        System.out.println("In A");
    }
    public A(int n){
        System.out.println("In A  int");

    }

}
class B extends A
{
    public B()
    {
        System.out.println("IN B");
    }
    public B(int n){
        super(n);
        System.out.println("In B int");

    }
}


public class SuperKeyword {
    public static void main(String[] args) {
    B obj=new B(3);

    }
}
