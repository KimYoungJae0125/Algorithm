/**
 * @param {number[]} nums
 * @return {boolean}
 */
const containsDuplicate = (nums) => [...new Set(nums)].length !== nums.length;