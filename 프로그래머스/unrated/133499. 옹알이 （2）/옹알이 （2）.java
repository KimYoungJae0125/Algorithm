import java.util.HashMap;
import java.util.Map;
class Solution {
    public int solution(String[] babbling) {
        Map<String, Boolean> map = new HashMap<>(){{
            put("aya", false);
            put("ye", false);
            put("woo", false);
            put("ma", false);
        }};
        //"aya", "ye", "woo", "ma"
        int answer = 0;
        for(String babble : babbling) {
            map.keySet().forEach(key -> map.put(key, false));
            while(true) {
                if(babble.length() >= 3) {
                    String subStr = babble.substring(0, 3);
                    if(subStr.equals("aya") || subStr.equals("woo")) {
                        if(map.get(subStr)) break;
                        babble = replace(babble, subStr, map);
                        continue;
                    }
                }
                if(babble.length() >= 2) {
                    String subStr = babble.substring(0, 2);
                    if(subStr.equals("ye") || subStr.equals("ma")) {
                        if(map.get(subStr)) break;
                        babble = replace(babble, subStr, map);
                        continue;
                    }
                }
                break;
            }
            if(babble.equals("")) answer++;
        }
        return answer;
    }
    private String replace(String babble, String subStr, Map<String, Boolean> map) {
        map.keySet().forEach(key -> map.put(key, false));
        map.put(subStr, true);
        return babble.replaceFirst(subStr, "");
    }
}