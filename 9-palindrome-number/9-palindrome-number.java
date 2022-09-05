class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        sb.append(x).reverse();
        return String.valueOf(x).equals(sb.toString());
    }
}