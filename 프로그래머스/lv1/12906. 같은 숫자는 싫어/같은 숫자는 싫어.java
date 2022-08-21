import java.util.*;

public class Solution {
    public int[] solution(int []arr) {       
        List<Integer> list = new ArrayList<>();
        for(int i=0, len=arr.length; i<len; i++){
            if(list.size() == 0 || list.get(list.size()-1) != arr[i]) {
                list.add(arr[i]);
            };
        }      
  
        return list.stream().mapToInt(i -> i).toArray();
    }
}