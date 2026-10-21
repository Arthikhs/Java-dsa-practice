package string;

public class p9removethedupliatechatr {
    public static void main(String[]args){
        String str = "abgidhafkhibiebfeaian";
        String abhi = "";
         for (int i = 0; i < str.length(); i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                abhi += str.charAt(i);
            }
        }

        System.out.println(abhi);
    }
}
