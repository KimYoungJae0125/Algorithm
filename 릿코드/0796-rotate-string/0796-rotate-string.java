class Solution {
    public boolean rotateString(String s, String goal) {
        Queue<Character> queue = new LinkedList(){{
            for(char c : s.toCharArray()) add(c);
        }};
        queue.offer(queue.poll());
        String st = "";
        while(!s.equals((st = queue.stream().map(String::valueOf).collect(Collectors.joining())))) {
            queue.offer(queue.poll());
            if(st.equals(goal)) return true;
        }
        return false;
    }
}