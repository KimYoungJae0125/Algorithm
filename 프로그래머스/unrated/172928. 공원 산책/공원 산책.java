class Solution {
    int parkYLength, parkXLength;
    
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        boolean flag = false;
        parkYLength = park.length;
        parkXLength = park[0].length();
        
        for(int i = 0; i < parkYLength; i++) {
            if(flag) break;
            for(int j = 0; j < parkXLength; j++) {
                if(park[i].charAt(j) == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                    flag = true;
                    break;
                }    
            }
        }
        for(String route : routes) {
            char[] c = route.toCharArray();
            move(park, c[0], Character.getNumericValue(c[2]), answer);
        }
        
        return answer;
    }
    
    private void move(String park[], char op, int n, int[] answer) {
        int tempX = answer[0];
        int tempY = answer[1];

        if((op == 'N' && answer[0] - n < 0)
            || (op == 'S' && answer[0] + n >= parkYLength)
            || (op == 'E' && answer[1] + n >= parkXLength)
            || (op == 'W' && answer[1] - n < 0)) {
            return;
        }

        for(int i = 0; i < n; i++) {
            if(op == 'N') answer[0]--;
            if(op == 'S') answer[0]++;
            if(op == 'E') answer[1]++;
            if(op == 'W') answer[1]--;
            if(park[answer[0]].charAt(answer[1]) == 'X') {
                answer[0] = tempX;
                answer[1] = tempY;
                return;
            }
        }
          
    }
    
}