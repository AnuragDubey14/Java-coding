import java.util.*;

public class ToggleAllCharactersStringBuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        StringBuilder sb= new StringBuilder(sc.nextLine());
        System.out.println("Entered String: "+sb+"\n");
        for (int i = 0; i < sb.length(); i++) {
            char ch=sb.charAt(i);
            int ascii=(int) ch;
            if (ascii<97){
                ascii+=32;
                char ch1=(char) ascii;
                sb.setCharAt(i,ch1);
            }
            else {
                ascii-=32;
                char ch1=(char) ascii;
                sb.setCharAt(i,ch1);
            }
        }
        System.out.println("Updated string: "+sb);

    }
}
