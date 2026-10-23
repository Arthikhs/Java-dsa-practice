package p1array;

import java.util.Arrays;

public class p22foursum {
    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            for (int j = i + 1; j < arr.length - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;
                int l = j + 1, r = arr.length - 1;
                while (l < r) {
                    int sum = arr[i] + arr[j] + arr[l] + arr[r];
                    if (sum == target) { System.out.println(arr[i] + ", " + arr[j] + ", " + arr[l] + ", " + arr[r]); l++; r--; }
                    else if (sum < target) l++;
                    else r--;
                }
            }
        }
    }
}
