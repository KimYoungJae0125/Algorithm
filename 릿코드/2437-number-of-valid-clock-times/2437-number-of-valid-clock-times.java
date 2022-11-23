class Solution {
    public int countTime(String time) {
        int[] newInt = {-1, -1, -1, -1};
        int count = 0;
        for(char c : time.toCharArray()) {
            if(c != '?' && c != ':')
                newInt[count] = Character.getNumericValue(c);
            if(c != ':') count++;
        }
        int[] multiply = {1, 1};
        for(int i=0; i<4; i++) {
            if(newInt[i] == -1) {
                if(i == 0) {
                    if(newInt[1] != -1) multiply[0] = 2;
                    if(newInt[1] <= 3) multiply[0] = 3;
                }
                if(i == 1) {
                    if(newInt[0] == 2) multiply[0] = 4;
                    else multiply[0] = 10;
                    if(newInt[0] == -1) multiply[0] = 24;
                }
                if(i == 2) {
                    if(newInt[3] != -1) multiply[1] = 6;
                }
                if(i == 3) {
                    if(newInt[2] == -1) multiply[1] = 60;
                    else multiply[1] = 10;
                }
            }
        }
        return multiply[0] * multiply[1];
    }
}