class Solution {
    public String reverseVowels(String s) {
        Queue<int[]> queue = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        char[] c = new char[s.length()];
        char[] reverseC = new char[s.length()];
        int count = 0;
        Map<Character, Boolean> map = new HashMap<>(){{
            put('A', true); put('a', true);
            put('E', true); put('e', true);
            put('I', true); put('i', true);
            put('O', true); put('o', true);
            put('U', true); put('u', true);
        }};
        for(int i=0, len=s.length(); i<len; i++) {
            if(map.get(s.charAt(i)) != null) {
                queue.offer(new int[]{i});
                reverseC[count++] = s.charAt(i);
            }
            c[i] = s.charAt(i);
        }
        while(!queue.isEmpty()) {
            int index = queue.poll()[0];
            c[index] = reverseC[--count];
        }

        return new String(c);
    }
}