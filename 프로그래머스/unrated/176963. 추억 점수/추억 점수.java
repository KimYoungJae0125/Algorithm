import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int photoLength = photo.length;
        int[] answer = new int[photoLength];
        
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0, length = name.length; i < length; i++) {
            map.put(name[i], yearning[i]);
        }
        for(int i = 0; i < photoLength; i++) {
            int result = 0;
            for(String people : photo[i]) {
                result += map.getOrDefault(people, 0);
            }
            answer[i] = result;
        }     
        
        return answer;
    }
}