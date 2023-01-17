class Solution {
    public String generateTheString(int n) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            char a = randomAlphabet();
            map.put(a, map.getOrDefault(a, 0)+1);
        }

        StringBuilder sb = new StringBuilder();
        map.entrySet().stream()
                .filter(entry -> entry.getValue() % 2 != 0)
                .forEach(entry -> sb.append(entry.getKey()));

        int count = n - sb.length();
        if(count != 0) {
            while(true) {
                char a = randomAlphabet();
                if(sb.indexOf(String.valueOf(a)) == -1) {
                   if(count % 2 == 0) {
                       for(int i=0, len=count-1; i<len; i++) sb.append(a);
                       count = 1;
                       continue;
                   }
                   sb.append(a);
                   break;
                }
            }
        }

        return sb.toString();
    }

    private char randomAlphabet() {
        return (char) new Random()
                .ints(97, 122)
                .findFirst()
                .getAsInt();
    }
}