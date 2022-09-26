/**
 * @param {string} s
 * @return {string}
 */
const reverseWords = (s) => s.split(" ").filter(v => v !== '').reverse().join(" ");