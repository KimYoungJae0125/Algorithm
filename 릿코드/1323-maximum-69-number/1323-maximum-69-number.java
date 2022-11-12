class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder();
        while(num > 0) {
            sb.append(num%10);
            num/=10;
        }
        sb = sb.reverse();
        for(int i=0, len=sb.length(); i<len; i++) {
            if(sb.charAt(i) == '6') {
                sb.replace(i, i+1, "9");
                break;
            }
        }
        return Integer.parseInt(sb.toString());
    }
}