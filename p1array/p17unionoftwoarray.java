package p1array;

import java.util.LinkedHashSet;

public class p14unionoftwoarray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4}, b = {3, 4, 5, 6};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int x : a) set.add(x);
        for (int x : b) set.add(x);
        System.out.println(set);
    }
}
