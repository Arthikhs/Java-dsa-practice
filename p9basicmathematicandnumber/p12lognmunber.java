package p9basicmathematicandnumber;

public class p12lognmunber {
    

    public static void main(String[] args) {
        double num = 20;
        double x = (num - 1) / (num + 1);
        double result = 0;
        double term = x;

        for (int i = 1; i <= 1000; i += 2) {
            result += term / i;
            term = term * x * x;
        }

        result = 2 * result;

        System.out.println("log(20) = " + result);
    }
}