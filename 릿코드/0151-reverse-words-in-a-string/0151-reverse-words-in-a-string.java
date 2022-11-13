class Solution {
    public String reverseWords(String s) {
        return String.join(" ", new ArrayList<>(){{
            String[] splitS = s.split(" ");
            for(int i = 0, len=splitS.length-1; i<=len; i++) 
                if(!"".equals(splitS[len-i])) 
                    add(splitS[len-i]);
            }
        });
    }
}