import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();

        Map<String, Integer> indicatorsMap = new HashMap<>();

        String[][] keys = new String[4][2];
        keys[0] = new String[]{"R", "T"};
        keys[1] = new String[]{"C", "F"};
        keys[2] = new String[]{"J", "M"};
        keys[3] = new String[]{"A", "N"};

        for(int i=0; i<4; i++) {
            for(int j=0; j<2; j++) {
                indicatorsMap.put(keys[i][j], 0);
            }
        }

        for (int i=0, len =survey.length; i<len; i++) {
            char[] c = survey[i].toCharArray();
            if(choices[i] < 4){
                indicatorsMap.put(String.valueOf(c[0]), indicatorsMap.get(String.valueOf(c[0]))+(4-choices[i]));
            } else if(choices[i] > 4) {
                indicatorsMap.put(String.valueOf(c[1]), indicatorsMap.get(String.valueOf(c[1]))+(choices[i] - 4));
            }
        }

        for(int i=0; i<4; i++){
            if(indicatorsMap.get(keys[i][0]) > indicatorsMap.get(keys[i][1])){
                answer.append(keys[i][0]);
            } else if (indicatorsMap.get(keys[i][0]) < indicatorsMap.get(keys[i][1])){
                answer.append(keys[i][1]);
            } else {
                Arrays.sort(keys[i]);
                answer.append(keys[i][0]);
            }

        }
        return answer.toString();
    }
}