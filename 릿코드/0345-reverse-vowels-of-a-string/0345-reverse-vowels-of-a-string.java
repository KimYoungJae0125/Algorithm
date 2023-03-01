class Solution {
    public String reverseVowels(String s) {
        Queue<int[]> queue = new PriorityQueue<>((a, b) -> b[0] - a[0] );
        Queue<String> queue2 = new LinkedList<>();
        String st[] = s.split("");
        Map<String, Boolean> map = new HashMap<>(){{
            put("A", true); put("a", true);
            put("E", true); put("e", true);
            put("I", true); put("i", true);
            put("O", true); put("o", true);
            put("U", true); put("u", true);
        }};
        for(int i=0, len=s.length(); i<len; i++) {
            if(map.get(st[i]) != null) {
                queue.offer(new int[]{i});
                queue2.offer(st[i]);
            }
        }

        StringBuilder sb = new StringBuilder().append(s);
        while(!queue.isEmpty()) {
            int index = queue.poll()[0];
            sb.replace(index, index+1, queue2.poll());
        }

        return sb.toString();
    }
}