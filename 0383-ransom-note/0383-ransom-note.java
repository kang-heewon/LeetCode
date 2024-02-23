import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<String, Integer> magazineMap = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            String letter = String.valueOf(magazine.charAt(i));
            magazineMap.put(letter, magazineMap.getOrDefault(letter, 0) + 1);

        }

        for (int i = 0; i < ransomNote.length(); i++) {
            String letter = String.valueOf(ransomNote.charAt(i));
            Integer count = magazineMap.getOrDefault(letter, 0);

            if(count == 0) {
                return false;
            }
            magazineMap.put(letter, count - 1);
        }

        return true;

    }
}