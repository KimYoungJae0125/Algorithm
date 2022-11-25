class Solution {
    public String oddString(String[] words) {
        int len = words.length;
        int[][] difference = new int[len][];
        Integer[] matchInt = new Integer[len];
        matchInt[0] = 1;
        int trueCount = 1;
        for(int i=0; i<len; i++) {
            int lenJ = words[i].length()-1;
            difference[i] = new int[lenJ];
            for(int j=0; j<lenJ; j++)
                difference[i][j] = (int) words[i].charAt(j+1) - (int) words[i].charAt(j);
            if(i != 0)
                if(Arrays.equals(difference[0], difference[i])) {
                    matchInt[i] = 1;
                    trueCount++;
                } else {
                    matchInt[i] = 0;
                }
        }

        return words[Arrays.asList(matchInt).indexOf(trueCount == 1 ? 1 : 0)];
    }
}