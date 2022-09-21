/**
 * @param {number} x
 * @return {number}
 */
const reverse = (x) => {
    const nums = String(x).split("").reverse();
    let minus = 1;
    if(nums[nums.length-1] == '-') {
        nums.pop();
        minus = -1;
    }
    let reversNumber =  Number(nums.join(""));
    if(reversNumber >= Math.pow(2, 31)) {
        reversNumber = 0;
    }
    return reversNumber * minus;
}