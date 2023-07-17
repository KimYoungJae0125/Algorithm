class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1));
        for(int i = 1; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for(int j = 1; j < i; j++) {
                int sum = result.get(i-1).get(j-1)+result.get(i-1).get(j);
                list.add(sum);
            }
            list.add(1);
            result.add(list);
        }
        return result;
    }
}