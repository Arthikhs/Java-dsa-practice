package p6basicmathematicandnumber;

public class p5lcm {
    public static void main(String[] args) {
        int a = 12, b = 18;
        int gcd = a, temp = b;
        while (temp != 0) { int t = temp; temp = gcd % temp; gcd = t; }
        System.out.println("LCM: " + (a / gcd * b));
    }
}
