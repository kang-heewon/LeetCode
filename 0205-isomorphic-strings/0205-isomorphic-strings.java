import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> letterMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character letter = s.charAt(i);
            Character targetLetter = t.charAt(i);

            if (letterMap.containsKey(letter)) {
                var mappedLetter = letterMap.get(letter);
                if (mappedLetter != targetLetter) {
                    return false;
                }
            } else if (letterMap.containsValue(targetLetter)) {
                return false;
            } else {
                letterMap.put(letter, targetLetter);
            }
        }
        return true;
    }
}