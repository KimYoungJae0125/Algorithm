class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length == 1) return nums[0];
        List<Integer> list = new ArrayList<>(){{for(int num : nums) add(num);}};
        while(true) {
            if(list.size() <= 2) return (list.get(0) + list.get(1))%10;
            int[] newNums = new int[list.size()-1];
            for(int i=0; i<list.size()-1; i++) newNums[i] = (list.get(i)+list.get(i+1))%10;
            list.remove(0);
            for(int num : newNums) {
                list.remove(0);
                list.add(num);
            }
        }
    }
}