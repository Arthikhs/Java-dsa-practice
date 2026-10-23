package p6basicmathematicandnumber;

public class p10checkwhetheranumberisapowerofn {
    public static void main(String[] args) {
        int num = 27, base = 3;
        double log = Math.log(num) / Math.log(base);
        System.out.println(Math.abs(log - Math.round(log)) < 1e-10 ? "Power of " + base : "Not a power of " + base);
    }
}
