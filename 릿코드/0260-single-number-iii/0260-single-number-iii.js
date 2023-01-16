/**
 * @param {number[]} nums
 * @return {number[]}
 */
const singleNumber = (nums) => {
    const map = {}

    nums.forEach(v => map[v] = map[v] == null ? 1 : map[v]+1);

    return Object.keys(map).filter(k => map[k] != 2);
};
