/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
const twoSum = (nums, target) => {
    for(let i=0, len=nums.length; i<len; i++) {
        for(let j=0; j<len; j++) {
            if(i === j) continue;
            if(nums[i] + nums[j] === target) return [i, j];
        }
    }
};