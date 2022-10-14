/**
 * @param {number[]} nums
 * @return {number[]}
 */
const runningSum = (nums) => nums.map((v, index) => {
    let sum = 0;
    for(let i=0; i<=index; i++) sum += nums[i];
    return sum;
})