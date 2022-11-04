class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder().append(s);
        StringBuilder reverseSb = new StringBuilder();
        var index = new ArrayList<Integer>();
        int count = 0;
        for(char c : s.toLowerCase().toCharArray()) {
            switch (c) {
                case 'a' :
                case 'e' :
                case 'i' :
                case 'o' :
                case 'u' :
                    index.add(count);
                    reverseSb.append(sb.charAt(count));
                    break;
            }
            count++;
        }
        int sbIndex = reverseSb.length()-1;
        for(int i : index) {
            sb.replace(i, i+1, String.valueOf(reverseSb.charAt(sbIndex--)));
        }
        return sb.toString();
    }
}