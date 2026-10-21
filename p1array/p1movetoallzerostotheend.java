
import java.util.Arrays;

public class p1movetoallzerostotheend {

    public static void main(String[] args) {
        int[] arr = {10, 0, 0, 20, 30, 8, 5, 0};

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
