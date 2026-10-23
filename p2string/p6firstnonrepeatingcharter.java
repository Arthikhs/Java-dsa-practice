package p2string;

public class p6firstnonrepeatingcharter {
    public static void main(String[] args) {
        String s = "aabbcde";
        for (int i = 0; i < s.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < s.length(); j++)
                if (i != j && s.charAt(i) == s.charAt(j)) { unique = false; break; }
            if (unique) { System.out.println("First non-repeating: " + s.charAt(i)); break; }
        }
    }
}
