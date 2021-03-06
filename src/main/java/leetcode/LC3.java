// 3. Longest Substring Without Repeating Characters

package leetcode;

import java.util.HashMap;

public class LC3 {
    public int solution1(final String s) {
        int start = 0;
        int length = 0;
        int max = 0;
        final var map = new HashMap<Character, Integer>(26);
        // TODO use stream each?
        for (var i = 0; i < s.length(); i++) {
            System.out.println("-------------------------------------");
            System.out.println(i);
            System.out.println(start);
            System.out.println(length);
            System.out.println(max);
            System.out.println("-------------------------------------");
            final var letter = s.charAt(i);
            final var location = map.get(letter);
            if (location == null) {
                length += 1;
            } else {
                if (location + 1 > start) {
                    start = location + 1;
                }
                length = i - (start - 1);
            }
            map.put(letter, i);
            if (length > max) max = length;
        }
        return max;
    }
}
