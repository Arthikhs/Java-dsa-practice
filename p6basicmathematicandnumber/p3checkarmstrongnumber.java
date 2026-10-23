package p6basicmathematicandnumber;

public class p3checkarmstrongnumber {
    public static void main(String[] args) {
        int num = 153, temp = num, sum = 0, digits = String.valueOf(num).length();
        while (temp > 0) { sum += Math.pow(temp % 10, digits); temp /= 10; }
        System.out.println(sum == num ? "Armstrong" : "Not Armstrong");
    }
}
