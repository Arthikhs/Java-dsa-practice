package p1array;

public class p25elementthatappearsonlyonce {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 2};
        int result = 0;
        for (int num : arr) result ^= num;
        System.out.println("Single element: " + result);
    }
}
