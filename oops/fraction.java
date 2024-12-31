public class fraction {
    public static Fraction add(Fraction f1,Fraction f2){
        int numerator= f1.numerator* f2.denomerator+f1.denomerator+ f2.numerator;
        int denominator=f1.denomerator*f2.denomerator;
        Fraction f3=new Fraction(numerator,denominator);
        return f3;

    }
    public static int gcd(int num,int den){
        int min=Math.min(num,den);
        for (int i =min; i >=1; i--) {
            if (num%i == 0 && den%i==0) return i;
        }
        return min;
    }
    public static class Fraction{
       int numerator;
       int denomerator;
       public Fraction(){

       }
       public Fraction(int numerator,int denomerator){
           this.numerator=numerator;
           this.denomerator=denomerator;
           simplify();
       }
       public void simplify(){
           int hcf=gcd(numerator,denomerator);
           numerator/=hcf;
           denomerator/=hcf;
       }
    }

    public static void main(String[] args) {
        Fraction f1=new Fraction(35,21);
        Fraction f2=new Fraction(7,3);
        Fraction f3=add(f1,f2);
        System.out.println(f3.numerator+"/"+f3.denomerator);
    }
}
