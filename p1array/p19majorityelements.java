package p1array;

public class p19majorityelements {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 3, 3, 3};
        int candidate = arr[0], count = 1;
        for (int i = 1; i < arr.length; i++) {
            count += arr[i] == candidate ? 1 : -1;
            if (count == 0) { candidate = arr[i]; count = 1; }
        }
        System.out.println("Majority element: " + candidate);
    }
}
