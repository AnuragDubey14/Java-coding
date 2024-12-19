import java.util.*;
public class Basics {
    public static void main(String[] args) {
        String str1="NEW STRING";
        System.out.println(str1);
//        Scanner sc=new Scanner(System.in);
//        String str2=sc.nextLine();
//        System.out.println(str2);
        System.out.println("Length of str1: ");
        System.out.println(str1.length());
        char ch=str1.charAt(2);
//        System.out.println("Char at 2 in str1");
//        System.out.println(ch);
//        System.out.println(str1.indexOf("N"));
//        System.out.println(str1.compareTo("NEW STRING"));  // str1==str2=0,str1>str2=+ve, str1<str2=-ve
//        System.out.println(str1.contains("EW"));
//        System.out.println(str1.startsWith("W"));
//        System.out.println(str1.endsWith("G"));
//        System.out.println(str1.toLowerCase());
//        System.out.println(str1.toUpperCase());
//        System.out.println(str1.concat("_concated string"));
        System.out.println(str1.equals(""));
        String str2="NEW STRING";
        System.out.println(str1==str2);
    }
}
