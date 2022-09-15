class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] a = Arrays.stream(nums).distinct().sorted().toArray();
        if(a[0] > 1 || a[a.length-1] < 0) return 1;
        int count = a[0];
        for(int i=0, len=a.length; i<len; i++) {
            if(a[i] != count) return count;
            count++;
            if(count == 0) count++;
            if(i < len-1) if(a[i] <= 0) count = a[i+1] > 0 ? 1 : a[i+1];
        }
        return count;
    }
}