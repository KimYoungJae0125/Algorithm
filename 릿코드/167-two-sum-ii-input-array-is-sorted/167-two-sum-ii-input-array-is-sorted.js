/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
const twoSum = (numbers, target) => {
    const map = {};
    for(let i=0, len=numbers.length; i<len; i++) {
        const before = target-numbers[i];
        if(before in map) return [map[before]+1, i+1];
        map[numbers[i]] = i;
    }
};