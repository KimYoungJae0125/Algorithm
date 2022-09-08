class Solution {
    public String[] findWords(String[] words) {
        char[] firstC = new char[]{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        char[] secondC = new char[]{'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
        char[] thirdC = new char[]{'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        List<Integer> list = new ArrayList<>();
        for(int i=0, len= words.length; i<len; i++) {
            char[] c = words[i].toLowerCase().toCharArray();
            int count = 0;
            for(int j=0, lenJ=firstC.length; j<lenJ; j++) {
                for(int k=0, lenK=c.length; k<lenK; k++) {
                    if(firstC[j] == c[k]) {
                        count = 1;
                    }
                }
            }
            for(int j=0, lenJ=secondC.length; j<lenJ; j++) {
                if(count == -1) break;
                for(int k=0, lenK=c.length; k<lenK; k++) {
                    if(secondC[j] == c[k]) {
                        if (count == 1) {
                            count = -1;
                            break;
                        }
                        count = 2;
                    }
                }
            }
            for(int j=0, lenJ=thirdC.length; j<lenJ; j++) {
                if(count == -1) break;
                for(int k=0, lenK=c.length; k<lenK; k++) {
                    if(thirdC[j] == c[k]) {
                        if (count == 1 || count == 2 || count == -1) {
                            count = -1;
                            break;
                        }
                        count = 3;
                    }
                }
            }
            if(count != -1) list.add(i);
        }
        return list.stream().map(i -> words[i]).toArray(String[]::new);
    }
}