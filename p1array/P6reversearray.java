import java.util.Arrays;

public class P3reversearray {
    public static void main(String[] args) {
        int[] arr = {10, 0, 0, 20, 30, 8, 5, 0};
        

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
