package p3searchingandorting;

public class p1linearsearch {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 9};
        int target = 8;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == target) { System.out.println("Found at index: " + i); return; }
        System.out.println("Not found");
    }
}
