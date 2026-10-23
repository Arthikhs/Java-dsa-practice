package p1array;

import java.util.Arrays;

public class p12roateanarrayuingextraarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int n = arr.length;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++)
            rotated[(i + k) % n] = arr[i];
        System.out.println(Arrays.toString(rotated));
    }
}
