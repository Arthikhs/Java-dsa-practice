package p1array;

public class p17removethedupiatewithoutsuigcollections {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};
        for (int i = 0; i < arr.length; i++) {
            boolean seen = false;
            for (int j = 0; j < i; j++)
                if (arr[j] == arr[i]) { seen = true; break; }
            if (!seen) System.out.print(arr[i] + " ");
        }
    }
}
