class Solution {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder().append(x).reverse();
        int result = 0, minus=1;
        if(sb.indexOf("-") != -1) {
            sb.deleteCharAt(sb.length()-1);
            minus = -1;
        }
        try {
            result = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {

        }
        return result * minus;
    }
}