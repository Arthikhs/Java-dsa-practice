package p6basicmathematicandnumber;

public class p4greatestcomondivisor {
    public static void main(String[] args) {
        int a = 48, b = 18;
        while (b != 0) { int t = b; b = a % b; a = t; }
        System.out.println("GCD: " + a);
    }
}
