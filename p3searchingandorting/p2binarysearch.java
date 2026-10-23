package p3searchingandorting;

public class p2binarysearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 7, l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) { System.out.println("Found at index: " + mid); return; }
            else if (arr[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        System.out.println("Not found");
    }
}
