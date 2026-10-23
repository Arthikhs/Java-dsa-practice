package p3searchingandorting;

import java.util.Arrays;

public class p4selectionsort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[minIdx]) minIdx = j;
            int t = arr[minIdx]; arr[minIdx] = arr[i]; arr[i] = t;
        }
        System.out.println(Arrays.toString(arr));
    }
}
