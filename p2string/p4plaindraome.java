package p2string;

public class p4plaindraome {
    public static void main(String[] args) {
        String s = "racecar";
        int l = 0, r = s.length() - 1;
        boolean isPalin = true;
        while (l < r)
            if (s.charAt(l++) != s.charAt(r--)) { isPalin = false; break; }
        System.out.println(isPalin ? "Palindrome" : "Not palindrome");
    }
}
