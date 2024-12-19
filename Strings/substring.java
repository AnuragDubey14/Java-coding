public class substring {
    public static void main(String[] args) {
        String str="abcd";
//        System.out.println(str.substring(2));
//        System.out.println(str.substring(0,2));
        for (int j = 0; j <= str.length(); j++) {
            for (int i=j+1;i<=str.length();i++){
                System.out.println(str.substring(j,i));
            }

        }

    }

}
