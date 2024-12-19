import java.util.*;
public class StringBuilderBasics {
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("hello");
        str.append(" World");
//        System.out.println(str);
//        str.setCharAt(0,'m');
//        System.out.println(str);
//        str.insert(1,'a');
//        System.out.println(str);
//        str.deleteCharAt(str.length()-1);
//        System.out.println(str);
//        str.reverse();
//        System.out.println(str);
        str.delete(2,4);
        System.out.println(str);
    }
}