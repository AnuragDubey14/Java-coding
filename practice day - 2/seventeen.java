//4. Write Java program to Convert Double to String
//5. Write Java program to Convert a Long to String
//6. Write Java program to Convert Float to String
//7. Write Java program to Convert string into a short integer
//8. Write Java program to Convert string to byte
//9. Write Java program to Convert String to Float
//10. Write Java program to Convert String to Long
//11. Write Java program to Convert String to Double
//12. Write Java program to Convert String to Integer



import java.util.Scanner;
public class seventeen {
    public static void main(String[] args){
        double d = 0;
        String str;
        long l=0;
        float fl = 0f;
        short sh=0;
        byte b=0;
        int n=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a double: ");
        d = input.nextDouble();
        str = Double.toString(d);
        System.out.println("Double to string: "+str);


        System.out.println("Enter a long integer: ");
        l = input.nextLong();
        str = Long.toString(l);
        System.out.println("Long to string: "+str);


        System.out.println("Enter a float number: ");
        fl=input.nextFloat();
        str = Float.toString(fl);
        System.out.println("Float to string: "+str);

        System.out.println("Enter a string(short): ");
        str = input.next();
        sh = Short.parseShort(str);
        System.out.println("String to short:"+sh);

        System.out.println("Enter a string(byte): ");
        str = input.next();
        b = Byte.parseByte(str);
        System.out.println("String to Byte:"+b);

        System.out.println("Enter a string(float): ");
        str = input.next();
        fl = Float.parseFloat(str);
        System.out.println("String to Float:"+b);

        System.out.println("Enter a string(long): ");
        str = input.next();
        l = Long.parseLong(str);
        System.out.println("String to long:"+l);

        System.out.println("Enter a string(double): ");
        str = input.next();
        d = Double.parseDouble(str);
        System.out.println("String to Double:"+d);

        System.out.println("Enter a string(integer): ");
        str = input.next();
        n = Integer.parseInt(str);
        System.out.println("String to Integer:"+n);





    }
}




