/**
 * @param {string} s
 * @return {string}
 */
const reverseWords = (s) => {
    return s.split(" ").map(v => {
        return v.split("").reverse().join(""); 
    }).join(" ");
};