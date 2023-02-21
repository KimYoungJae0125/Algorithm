import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int damage : enemy) {
            n -= damage;
            queue.offer(damage);
            
            if(n < 0) {
                if(k == 0) break;
                n += queue.poll();
                k--;
            }
            answer++;
        }
        return answer;
    }
    
}