package p4hashmaphashset;

import java.util.HashSet;

public class p6intersectionoftwoarrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4}, b = {3, 4, 5, 6};
        HashSet<Integer> set = new HashSet<>();
        for (int x : a) set.add(x);
        for (int x : b)
            if (set.contains(x)) System.out.print(x + " ");
    }
}
