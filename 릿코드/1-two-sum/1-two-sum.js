/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
const twoSum = (nums, target) => {
    const map = {};
    for(let i=0, len=nums.length; i<len; i++) {
        const another = target - nums[i];
        if(another in map) {
            return [map[another], i];
        }
        map[nums[i]] = i;
    }
};