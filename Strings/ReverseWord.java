import java.util.*;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence: \n");
        String s=sc.nextLine();
        String ans="";
        StringBuilder sb=new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            else {
                sb.reverse();
                ans+=sb;
                ans+=' ';
                sb.delete(0,sb.length());
            }
        }
        sb.reverse();
        ans+=sb;
        System.out.println(ans);
    }
}
