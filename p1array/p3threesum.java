package p1array;

import java.util.Arrays;

public class p21threesum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            int l = i + 1, r = arr.length - 1;
            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];
                if (sum == 0) { System.out.println(arr[i] + ", " + arr[l] + ", " + arr[r]); l++; r--; }
                else if (sum < 0) l++;
                else r--;
            }
        }
    }
}
