package p4hashmaphashset;

import java.util.*;

public class p5groupanugrams {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        HashMap<String, List<String>> map = new HashMap<>();
        for (String w : words) {
            char[] c = w.toCharArray(); Arrays.sort(c);
            String key = new String(c);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(w);
        }
        System.out.println(map.values());
    }
}
