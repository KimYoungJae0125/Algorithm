class Solution {
    public String reverseVowels(String s) {
        Queue<int[]> queue = new PriorityQueue<>((a, b) -> b[0] - a[0] );
        Queue<String> queue2 = new LinkedList<>();
        String st[] = s.split("");
        for(int i=0, len=s.length(); i<len; i++) {
            switch (st[i]) {
                case "A" :
                case "a" :
                case "E" :
                case "e" :
                case "I" :
                case "i" :
                case "O" :
                case "o" :
                case "U" :
                case "u" :
                    queue.offer(new int[]{i});
                    queue2.offer(st[i]);
                    break;
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