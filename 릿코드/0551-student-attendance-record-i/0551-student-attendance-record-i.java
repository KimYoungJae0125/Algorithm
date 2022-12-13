class Solution {
    public boolean checkRecord(String s) {
        int a = 0, l = 0;
        for(char c : s.toCharArray()) {
            switch (c) {
                case 'L' -> l++;
                case 'A' -> {a++; l=0;}
                default -> l=0;
            }
            if(l >= 3 || a >= 2) return false;
        }
        return true;
    }
}