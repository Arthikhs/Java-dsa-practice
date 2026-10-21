package string;




public class p7firstrepeatecharter  {
    public static void main(String[]arg){
        String str = "fhgakii0jdbw";
         for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println(str.charAt(i));
                    return;
                }
            }
        }

        System.out.println("No repeated character");
    }
}
