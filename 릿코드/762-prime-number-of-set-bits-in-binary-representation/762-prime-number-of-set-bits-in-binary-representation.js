/**
 * @param {number} left
 * @param {number} right
 * @return {number}
 */
const countPrimeSetBits = (left, right) => {
    return [...Array(right-left+1)].map((v, i) => i+left)
                                   .map(v => Array.from(((v).toString(2)), (arg) => parseInt(arg)).reduce((x, y) => x+y))
                                   .filter(v => {
                                        for(let i = 2; i < v; i++) 
                                            if(v % i === 0) 
                                            return false;
                                        return v > 1;}).length;
};