/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
const findMedianSortedArrays = (nums1, nums2) => {
    const nums = [...nums1, ...nums2].sort((a, b) => a-b);
    const index = parseInt(nums.length/2);
    if(nums.length%2 == 0) return ((nums[index-1] + nums[index])/2).toFixed(5);
    return nums[index].toFixed(5);
};