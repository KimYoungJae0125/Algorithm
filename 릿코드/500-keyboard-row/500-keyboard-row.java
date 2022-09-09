class Solution {
    public String[] findWords(String[] words) {
        String firstS = "qwertyuiop";
        String secondS = "asdfghjkl";
        String thirdS = "zxcvbnm";
        return Arrays.stream(words).filter(s -> {
            String[] c = s.toLowerCase().split("");
            int count = 0;
            for(int i =0, len = c.length; i<len; i++) {
                if(count == -1) break;
                if(firstS.contains(c[i])) {
                    if(count == 2 || count == 3) {
                        count = -1; break;
                    }
                    count = 1;
                }
                if(secondS.contains(c[i])) {
                    if(count == 1 || count == 3) {
                        count = -1; break;
                    }
                    count = 2;
                }
                if(thirdS.contains(c[i])) {
                    if(count == 1 || count == 2) {
                        count = -1; break;
                    }
                    count = 3;
                }
            }
            return count != -1;
        }).toArray(String[]::new);
    }
}