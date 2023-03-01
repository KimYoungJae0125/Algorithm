class Solution {
    public String reverseVowels(String s) {
        Queue<int[]> queue = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int length = s.length(), count = 0;
        char[] c = new char[length], reverseC = new char[length];

        for(int i = 0; i < length; i++) {
            char sc = s.charAt(i);
            switch (sc) {
                case 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u' -> {
                    queue.offer(new int[]{i});
                    reverseC[count++] = sc;
                }
            }
            c[i] = sc;
        }
        while(!queue.isEmpty()) {
            int index = queue.poll()[0];
            c[index] = reverseC[--count];
        }

        return new String(c);
    }
}