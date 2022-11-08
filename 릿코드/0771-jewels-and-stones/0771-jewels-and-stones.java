class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<String> jewelsSet = new HashSet<>(){{for(String s : jewels.split("")) if(s != null && !"".equals(s))add(s);}};
        StringBuilder sb = new StringBuilder().append(stones);
        Iterator<String> setIterator = jewelsSet.iterator();
        int count = 0;
        while(setIterator.hasNext()) {
            int index;
            String s = setIterator.next();
            while((index = sb.indexOf(s)) != -1) {
                sb.deleteCharAt(index);
                count++;
            }
        }
        return count;
    }
}