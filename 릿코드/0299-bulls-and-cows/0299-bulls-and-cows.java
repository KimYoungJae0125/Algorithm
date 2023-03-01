class Solution {
    public String getHint(String secret, String guess) {
        int a = 0, b = 0, length = secret.length();
        Map<Character, Integer> map = new HashMap<>();
        char[] check = new char[length];
        for(int i = 0; i < length; i++) {
            if(secret.charAt(i) == guess.charAt(i)) {
                check[i] = (char) -1;
                a++;
                continue;
            }
            map.put(secret.charAt(i), map.getOrDefault(secret.charAt(i), 0) + 1);
        }
        for(int i = 0; i < length; i++) {
            if(check[i] != (char) -1) {
                char c = guess.charAt(i);
                Integer count = map.get(c);
                if(count != null && count > 0) {
                    b++;
                    map.put(c, --count);
                }
            }
        }
        
        return a + "A" + b + "B";
    }
}