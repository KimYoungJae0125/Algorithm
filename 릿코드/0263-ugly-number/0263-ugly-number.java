class Solution {
    public boolean isUgly(int n) {
    while(n >= 1) {
        if(n%2 == 0) {
            n/=2;
            continue;
        }
        if(n%3 == 0) {
            n/=3;
            continue;
        }
        if(n%5 == 0) {
            n/=5;
            continue;
        }
        if(n == 1) return true;
        break;
    }
    return false;
    }
}