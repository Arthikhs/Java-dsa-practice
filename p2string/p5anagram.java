package p2string;

import java.util.Arrays;

public class p5anagram {
    public static void main(String[] args) {
        String a = "listen", b = "silent";
        char[] ca = a.toCharArray(), cb = b.toCharArray();
        Arrays.sort(ca); Arrays.sort(cb);
        System.out.println(Arrays.equals(ca, cb) ? "Anagram" : "Not anagram");
    }
}
