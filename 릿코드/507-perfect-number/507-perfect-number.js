/**
 * @param {number} num
 * @return {boolean}
 */
const checkPerfectNumber = (num) => {
    const factorMath = [0];
    for(let i=1; i<=num/2; i++) {
        if(num%i === 0) 
        factorMath.push(i);
    }
    return factorMath.reduce((x, y) => x+y) === num;
}