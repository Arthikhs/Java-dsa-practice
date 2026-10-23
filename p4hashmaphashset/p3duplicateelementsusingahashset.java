package p4hashmaphashset;

import java.util.HashSet;

public class p3duplicateelementsusingahashset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};
        HashSet<Integer> seen = new HashSet<>();
        for (int x : arr)
            if (!seen.add(x)) System.out.println("Duplicate: " + x);
    }
}
