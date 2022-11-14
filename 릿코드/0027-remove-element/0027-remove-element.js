/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
const removeElement = (nums, val) => {
    const list = [];
    nums.forEach((num, index) => {if(num === val) list.push(index);});    
    list.forEach((num, index) => nums.splice(num-index, 1));
}
