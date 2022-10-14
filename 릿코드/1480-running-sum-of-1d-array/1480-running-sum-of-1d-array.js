/**
 * @param {number[]} nums
 * @return {number[]}
 */
const runningSum = (nums) => nums.map((v, index) => 
    nums.filter((v, i) => i<=index).reduce((x, y) => x+y, 0))