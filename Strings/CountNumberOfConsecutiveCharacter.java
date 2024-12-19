import java.util.*;
public class CountNumberOfConsecutiveCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: \n");
        String s=sc.next();
        String ans="";
        ans+=s.charAt(0);
        int count=1;
        for (int i = 1; i < s.length(); i++) {
            char present=s.charAt(i);
            char past=s.charAt(i-1);
            if (present!=past){
                ans+=count;
                ans+=present;
                count=1;
            }
            else {
                count++;
            }
        }
        ans+=count;
        System.out.println(ans);
    }
}
