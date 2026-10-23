package p4hashmaphashset;

import java.util.LinkedHashMap;

public class p4firstnonrepeatingcharacter {
    public static void main(String[] args) {
        String s = "aabbcde";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        for (char c : map.keySet())
            if (map.get(c) == 1) { System.out.println("First non-repeating: " + c); break; }
    }
}
