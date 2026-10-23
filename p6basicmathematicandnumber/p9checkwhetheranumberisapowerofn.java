package p6basicmathematicandnumber;

public class p9checkwhetheranumberisapowerofn {
    public static void main(String[] args) {
        int num = 27, base = 3;
        while (num % base == 0) num /= base;
        System.out.println(num == 1 ? "Power of " + base : "Not a power of " + base);
    }
}
