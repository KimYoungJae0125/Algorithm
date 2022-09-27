/**
 * @param {number} num
 * @return {boolean}
 */
const checkPerfectNumber = (num) => {
    if(num === 1) return false;
    const factorMath = [];
    for(let i=1, len=num/2; i<=len; i++) {
        if(num%i === 0) 
        factorMath.push(i);
    }
    return factorMath.reduce((x, y) => x+y) === num;
}