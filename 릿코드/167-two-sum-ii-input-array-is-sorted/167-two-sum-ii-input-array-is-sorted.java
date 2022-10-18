class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i=0, len=numbers.length; i<len; i++) {
            if(map.keySet().contains(target-numbers[i])) return new int[]{map.get(target-numbers[i])+1, i+1};
            map.put(numbers[i], i);
        }
        return null;
    }
}