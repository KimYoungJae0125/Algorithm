/**
 * @param {string} s
 * @return {string}
 */
const reverseWords = (s) => s.split(" ").map(v => v.split("").reverse().join("")).join(" ");