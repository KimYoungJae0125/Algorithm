/**
 * @param {number[]} arr1
 * @param {number[]} arr2
 * @return {number[]}
 */
var relativeSortArray = function(arr1, arr2) {
    const arr = arr1.filter((v) => !arr2.includes(v)).sort((a, b) => a-b);
    return [...arr2.map(v => arr1.filter(v2 => v==v2)).flat(), ...arr];
};