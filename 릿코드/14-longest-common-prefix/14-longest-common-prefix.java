class Solution {
    public String longestCommonPrefix(String[] strs) {
        String[] a = Arrays.stream(strs).sorted().toArray(String[]::new);
        for(int i=0, len=a[0].length(); i<len; i++) {
            for(int j=0, lenJ= a.length; j<lenJ; j++) {
                if(j < lenJ-1){
                    if(a[j].charAt(i) != a[j+1].charAt(i)) {
                        return a[0].substring(0, i);
                    }
                }
            }
        }
        return a[0];
    }
}