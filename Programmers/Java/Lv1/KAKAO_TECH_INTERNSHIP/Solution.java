package Programmers.Java.Lv1.KAKAO_TECH_INTERNSHIP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
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
    public static void main(String[] args) {
        //survey = "RT, "TR, "FC", "CF", "MJ", "JM", "AN", "NA" 중 하나
        //survey의 첫 번째 문자열은 i+1번 질문의 비동의 관련 선택지
        //survey의 두 번째 문자열은 i+1번 질문의 동의 관련 선택지
        //choices.length = survey.length
        //[A : 어피치형, C : 콘형, F : 프로도형, R : 라이언형, T : 튜브형, M : 무지형, N : 네오형, J : 제이지형]
        //choices = [ 1 : "매우 비동의", 2 : "비동의", 3 : "약간 비동의", 4 : "모르겠음", 5 : "약간 동의", 6 : "동의", 7 : "매우 동의" ]
        /*
            1 : R, T
            2 : C, F
            3 : J, M
            4 : A, N
         */

        System.out.println(new Solution().solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5}));
        System.out.println(new Solution().solution(new String[]{"TR", "RT", "TR"}, new int[]{7, 1, 3}));
    }
}
