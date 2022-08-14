package Programmers.Java.Lv1.Kakao_Blind_Recruitment_2022;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
//        int[] answer = {};
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> report_map = new HashMap<>();
        Map<String, Integer> answer_map = new HashMap<>();
        for(String id : id_list) {
            report_map.put(id, new HashSet<>());
            answer_map.put(id, 0);
        }
        for(String report_id : report) {
            String[] split_id = report_id.split(" ");
            if(!split_id[0].equals(split_id[1])){
                report_map.get(split_id[1]).add(split_id[0]);
            }
        }
        for(String id : id_list){
            if(report_map.get(id).size() >= k) {
                for(String report_id : report_map.get(id)){
                    answer_map.put(report_id, answer_map.get(report_id)+1);
                }
            }
        }
        for(int i=0, len = id_list.length; i<len; i++){
            answer[i] = answer_map.get(id_list[i]);
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Solution solution = new Solution();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        int[] answer = solution.solution(id_list, report, k);
        bw.write("[");
        bw.write(Arrays.stream(answer).mapToObj(String::valueOf).collect(Collectors.joining(", ")));
        bw.write("]");
        bw.newLine();

        String[] id_list2 = {"con", "ryan"};
        String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k2 = 3;
        int[] answer2 = solution.solution(id_list2, report2, k2);
        bw.write("[");
        bw.write(Arrays.stream(answer2).mapToObj(String::valueOf).collect(Collectors.joining(", ")));
        bw.write("]");

        bw.close();
    }
}
