class Solution {
    public int findComplement(int num) {
        int mask = -1;
        while ((num & mask) != 0) {
            mask <<= 1;
        }

        return ~(num ^ mask); //~num & ~mask
    }
}