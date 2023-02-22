class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(char c : s.toCharArray()) {
            if(c == '(') {
                if(stack.isEmpty())
                    stack.push(c);
                else {
                    sb.append(c);
                    count++;
                }
            } else {
                if(count > 0) {
                    count--;
                    sb.append(c);
                } else {
                    stack.pop();
                }
            }
        }
        return sb.toString();
    }
}