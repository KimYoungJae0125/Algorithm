class Solution {
    public int findComplement(int num) {
        StringBuilder sb = new StringBuilder();
        for(char c : Integer.toBinaryString(num).toCharArray())
            sb.append(c == '0' ? '1' : '0');
        return Integer.parseInt(sb.toString(), 2);
    }
}