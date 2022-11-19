class Solution {
    public int findComplement(int num) {
        int len = Integer.toBinaryString(num).length();
        String s = Integer.toBinaryString(~num);
        return Integer.parseInt(s.substring(s.length()-len), 2);
    }
}