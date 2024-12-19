import java.util.*;

public class ToggleAllCharactersString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        System.out.print("Entered string: " + s+"\n");
        String updated_string="";
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            int ascii=(int) ch;
            if (ascii<97){
                ascii =ascii+32;
                char s1=(char) ascii;
                updated_string+= s1;
            }
            else {
                ascii =ascii-32;
                char s1=(char) ascii;
                updated_string+= s1;
            }
        }
        System.out.println(updated_string);
    }
}
