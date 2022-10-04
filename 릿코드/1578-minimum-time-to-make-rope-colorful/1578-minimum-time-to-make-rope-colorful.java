class Solution {
    public int minCost(String colors, int[] neededTime) {
        int result = 0;
        StringBuilder sb = new StringBuilder().append(colors);
        List<Integer> list = new ArrayList<>();
        for(int num : neededTime) list.add(num);
        for(int i=0, len=sb.length()-1; i<len; i++) {
            if(sb.charAt(i) == sb.charAt(i+1)) {
                int index = list.get(i) > list.get(i+1) ? i+1 : i;
                result += list.get(index);
                list.remove(index);
                sb.deleteCharAt(index);
                len--; i--;
            }
        }
        return result;
    }
}