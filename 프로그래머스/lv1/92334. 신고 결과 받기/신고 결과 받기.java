import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
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
}