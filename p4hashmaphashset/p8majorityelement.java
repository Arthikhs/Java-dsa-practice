package p4hashmaphashset;

import java.util.HashMap;

public class p8majorityelement {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 3, 3, 3};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) map.put(x, map.getOrDefault(x, 0) + 1);
        for (int x : map.keySet())
            if (map.get(x) > arr.length / 2) System.out.println("Majority: " + x);
    }
}
