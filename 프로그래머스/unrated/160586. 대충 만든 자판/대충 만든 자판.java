import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();

        for(String key : keymap) {
            int length = key.length();
            for(int i = 0; i < length; i++) {
                Character c = key.charAt(i);
                if(map.get(c) == null || map.get(c) > i+1)
                map.put(c, i+1);
            }
        }

        int length = targets.length;
        int[] answer = new int[length];

        for(int i = 0; i < length; i++) {
            for(Character c : targets[i].toCharArray()) {
                int get = map.getOrDefault(c, -1);
                if(get == -1) {
                    answer[i] = -1;
                    break;
                }
                answer[i] += get;
            }
        }

        return answer;
    }
}