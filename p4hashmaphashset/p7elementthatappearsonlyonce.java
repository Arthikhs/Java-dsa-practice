package p4hashmaphashset;

import java.util.HashMap;

public class p7elementthatappearsonlyonce {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 2};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) map.put(x, map.getOrDefault(x, 0) + 1);
        for (int x : map.keySet())
            if (map.get(x) == 1) System.out.println("Single element: " + x);
    }
}
