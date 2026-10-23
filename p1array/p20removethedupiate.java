package p1array;

import java.util.LinkedHashSet;

public class p16removethedupiate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int x : arr) set.add(x);
        System.out.println(set);
    }
}
