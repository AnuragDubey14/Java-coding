import java.util.*;

public class Palindrome {
    public static boolean checkPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        boolean flag=true;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)){
                flag=false;
                break;
            }
            i++;
            j--;
        }
        return flag;
    }
    public static void main(String[] args) {
        String str="abc";
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                if (checkPalindrome(str.substring(i,j))){
                    count++;
                }
            }
        }
        System.out.println("Total number of palidromic substrings: "+count);
    }
}
