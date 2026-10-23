package p6basicmathematicandnumber;

public class p11squreroot {
    public static void main(String[] args) {
        int n = 25, l = 0, r = n, ans = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= n) { ans = mid; l = mid + 1; }
            else r = mid - 1;
        }
        System.out.println("Square root: " + ans);
    }
}
