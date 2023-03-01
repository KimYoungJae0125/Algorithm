class Solution {
    public String getHint(String secret, String guess) {
        int a = 0, b = 0, length = secret.length();
        char[] check = new char[length];
        char[] check2 = new char[length];
        for(int i = 0; i < length; i++) {
            if(secret.charAt(i) == guess.charAt(i)) {
                check[i] = (char) -1;
                check2[i] = (char) -1;
                a++;
                continue;
            }
            check[i] = secret.charAt(i);
            check2[i] = guess.charAt(i);
        }

        for(int i = 0; i < length; i++) {
            if(check[i] == (char) -1) continue;
            for(int j = 0; j < length; j++) {
                if(check2[j] == (char) -1) continue;
                if(check[i] == check2[j]) {
                    b++;
                    check[i] = (char) -1;
                    check2[j] = (char) -1;
                }
            }
        }

        return a + "A" + b + "B";
    }
}