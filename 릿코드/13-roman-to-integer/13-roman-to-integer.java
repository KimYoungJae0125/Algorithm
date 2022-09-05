class Solution {
    public int romanToInt(String s) {
       char[] c = s.toCharArray();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<c.length; i++) {
            int result = charToInt(c[i]);
            if (i < c.length - 1) {
                boolean flag = c[i] == 'I' && (c[i + 1] == 'V' || c[i + 1] == 'X')
                            || c[i] == 'X' && (c[i + 1] == 'L' || c[i + 1] == 'C')
                            || c[i] == 'C' && (c[i + 1] == 'D' || c[i + 1] == 'M');
                if(flag) {
                    result = charToInt(c[i + 1]) - result;
                    i++;
                }
            }
            list.add(result);
        }
        return IntStream.range(0, list.size()).map(list::get).sum();
    }
    int charToInt(char c) {
        int result = 0;
        switch (c) {
            case 'I' :
                result = 1;
                break;
            case 'V' :
                result = 5;
                break;
            case 'X' :
                result = 10;
                break;
            case 'L' :
                result = 50;
                break;
            case 'C' :
                result = 100;
                break;
            case 'D' :
                result = 500;
                break;
            case 'M' :
                result = 1000;
                break;
        }
        return result;
    }
}